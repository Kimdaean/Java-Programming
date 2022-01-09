package 실습12;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class FigureEditor {
	public static void main(String[] args) {
		new FigureEditorFrame();
	}
}

class FigureEditorFrame extends JFrame {
	PanelA panelA; //panelA 객체 생성
	PanelC panelC; //panelC 객체 생성
	
	FigureEditorFrame() {
		setSize(500,300); //프레임의 크기 설정
		panelA = new PanelA(this); //현재 객체를 파라미터로 받는 panelA
		panelC = new PanelC(this); //현재 객체를 파라미터로 받는 panelC
		add(panelA, BorderLayout.CENTER); //panelA를 중앙에 설정
		add(panelC, BorderLayout.WEST); //panelC를 좌측에 설정
		setVisible(true); //프레임 보이게 하기
	}	

class PanelA extends JPanel {
	ArrayList<Shape> shapes = new ArrayList<Shape>(); //shapes 배열 생성
	ArrayList<Shape> littleshapes = new ArrayList<Shape>(); //shapes 배열 생성
	Shape checkShape;
	FigureEditorFrame topFrame; //topFrame 객체 생성
	Point start=null, end=null; //마우스의 시작점과 끝점
	String selectedBtn = "사각"; //selectedBtn 변수 생성
	PanelA(FigureEditorFrame frame) { //PanelA 생성
		topFrame = frame; //파라미터로 받은 frame을 topFrame에 넣기
		setBackground(Color.YELLOW); //배경색을 노란색으로 설정
		MyMouseListener listener = new MyMouseListener(); //listener 객체 생성
        addMouseListener(listener); //마우스 리스너 컴포넌트에 등록
        addMouseMotionListener(listener); //마우스 무브나 마우스 드래깅을 함께 처리하고자 하기 위해 MouseMotion 리스너 등록
	}
	
	class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            start = e.getPoint(); //마우스가 눌린 곳을 시작점으로 설정
        }
        public void mouseDragged(MouseEvent e) {
            end = e.getPoint(); //마우스가 드래그되는 곳을 마지막점으로 설정
            repaint(); //패널의 그리기 요청 주목
        }
        
		
		public void mouseReleased(MouseEvent e) {
			int x = Math.min(start.x, end.x); //마우스가 눌린 곳을 x축의 시작점으로 설정
	        int y = Math.min(start.y, end.y); //마우스가 눌린 곳을 y축의 시작점으로 설정
	        int width = Math.abs(start.x - end.x); //x축의 길이 즉 폭을 설정
	        int height = Math.abs(start.y - end.y); //y축의 길이 즉 높이을 설정
	        if(selectedBtn == "사각") { //사각 버튼이 눌렀다면
            	Shape s = new Rectangle(x, y, width, height); //업캐스팅
				shapes.add(s); // shapes에 s 추가
            }
            else if(selectedBtn == "타원") { //타원 버튼이 눌렀다면
            	Shape s = new Oval(x,y,width,height); //업캐스팅
            	shapes.add(s); //shapes에 s 추가
            }
            else { //그 외인 직선 버튼이 눌렀다면
            	Shape s = new Line(x,y,width,height); //업캐스팅
            	shapes.add(s); // shapes에 s추가
            }
            repaint(); //패널의 그리기 요청
        }  
		}
	
	public boolean containXY(int x, int y) {
    	if (shapes != null) {
    		for (Shape s : shapes) {
    			if(s instanceof Rectangle) {
    				Rectangle r = (Rectangle)s;
    				for(int i=0; i <= end.x; i++) {
    					if((r.x<=x+i && x+i<r.x+end.x) && (r.y<=y+i && y+i <= r.y+end.y))
    						return true;
    				}
    			}else if(s instanceof Line) {
    				Line l = (Line)s;
    				for(int i=0; i <= end.x; i++) {
    					if((l.x<=x+i && x+i<l.x+end.x) && (l.y<=y+i && y+i <= l.y+end.y))
    						return true;
    			}
    			}else if(s instanceof Oval) {
    				Oval o = (Oval)s;
    				for(int i=0; i <= end.x; i++) {
    					if((o.x<=x+i && x+i<o.x+end.x) && (o.y<=y+i && y+i <= o.y+end.y))
    						return true;
    	}
    }
    		}
    	}
    	return false;
	}

    public void paintComponent(Graphics g) {
        super.paintComponent(g); //패널 내에 이전에 그려진 잔상을 지우기 위해 호풀
        if(start == null) // 마우스가 눌리지 않았다면
            return; //아무것도 하지 않기
        g.setColor(Color.BLUE); //파란색 선택
        int x = Math.min(start.x, end.x); //마우스가 눌린 곳을 x축의 시작점으로 설정
        int y = Math.min(start.y, end.y); //마우스가 눌린 곳을 y축의 시작점으로 설정
        int width = Math.abs(start.x - end.x); //x축의 길이 즉 폭을 설정
        int height = Math.abs(start.y - end.y); //y축의 길이 즉 높이을 설정
        switch(selectedBtn) {
        case "사각": //사각 버튼이 눌렀다면
        	g.drawRect(x, y, width, height); //입력 받은 값으로 사각형 그리기
        	break; //그리고 끝내기
        case "타원": //타원 버튼이 눌렀다면
        	g.drawOval(x, y, width, height); //입력 받은 값으로 타원 그리기
        	break; //그리고 끝내기
        case "직선": //직선 버튼이 눌렸다면
        	g.drawLine(x, y, width, height); //입력받은 값으로 직선 그리기
        	break; //그리고 끝내기
        }
        for (int i=0; i<shapes.size(); i++) {
        	if(shapes.get(i) instanceof Rectangle) { //만일 shapes의 i번재 변수가 Rectangle 클래스의 인스턴스라면
        		Rectangle r = (Rectangle)shapes.get(i); //다운캐스팅
        		r.draw(g); //사각형 그리기
        	}
        	if(shapes.get(i) instanceof Oval) { //만일 shpaes의 i번재 변수가 Oval 클래스의 인스턴스라면
        		Oval o = (Oval)shapes.get(i); //다운캐스팅
        		o.draw(g); //타원 그리기
        	}
        	if(shapes.get(i) instanceof Line) { //만일 shapes의 i번재 변수가 Line 클래스의 인스턴스라면
        		Line l = (Line)shapes.get(i); //다운캐스팅
        		l.draw(g); //직선 그리기
        	}
        }
    }
    public void ClickShape(int x, int y) {
    	if(shapes != null) {
    		for (Shape s : shapes) {
    			if(s instanceof Line) {
    				Line l = (Line)s;
    				if((l.x <= x && x <= l.getWidth()) && (l.y <= y && x <= l.getHeight())) {
    					return;
    				}
    			}
    			else {
    				return;
    				}
    			}
    		}
    	}
    }

class PanelB extends JPanel {
	FigureEditorFrame topFrame; //topFrame 객체 생성
	
		PanelB(FigureEditorFrame frame) { //PanelB를 생성
		this.topFrame = frame; //파라미터로 받은 frame을 현재 객체 topFrame으로 설정
		setBackground(Color.BLUE); //배경색을 파란색으로 설정
		setLayout(new GridLayout(3,1,5,5));	//3행 1열로 배열하고 컴포넌트 사이의 간격을 상하좌우로 5픽셀로 설정
		JButton btn1 = new JButton("사각"); //"사각"버튼 생성
		btn1.addActionListener(new MyActionListener()); //사각버튼이 눌리면 ActionEvent 발생
		add(btn1); //사각버튼 추가
		JButton btn2 = new JButton("직선"); //"직선"버튼 생성
		btn2.addActionListener(new MyActionListener()); //직선버튼이 눌리면 ActionEvent 발생
		add(btn2); //직선버튼 추가
		JButton btn3 = new JButton("타원"); //"타원"버튼 생성
		btn3.addActionListener(new MyActionListener()); //사각버튼이 눌리면 ActionEvent 발생
		add(btn3); //타원버튼 추가
	}
		
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { //ActionEvent가 발생할 경우
			String actionCmd = e.getActionCommand(); //버튼을 누르면 해당 버튼의 커맨드를 받기
			topFrame.panelA.selectedBtn = actionCmd; //선택된버튼을 해당 버튼의 커맨드로 설정
		}
	}
}

class PanelC extends JPanel {
	PanelC(FigureEditorFrame frame) { //PanelC 샐성
		add(new PanelB(frame)); //객체 frame을 파라미터로 받는 PanelB를 추가
	}
}
}
