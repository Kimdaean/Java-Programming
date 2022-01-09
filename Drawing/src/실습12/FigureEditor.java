package �ǽ�12;
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
	PanelA panelA; //panelA ��ü ����
	PanelC panelC; //panelC ��ü ����
	
	FigureEditorFrame() {
		setSize(500,300); //�������� ũ�� ����
		panelA = new PanelA(this); //���� ��ü�� �Ķ���ͷ� �޴� panelA
		panelC = new PanelC(this); //���� ��ü�� �Ķ���ͷ� �޴� panelC
		add(panelA, BorderLayout.CENTER); //panelA�� �߾ӿ� ����
		add(panelC, BorderLayout.WEST); //panelC�� ������ ����
		setVisible(true); //������ ���̰� �ϱ�
	}	

class PanelA extends JPanel {
	ArrayList<Shape> shapes = new ArrayList<Shape>(); //shapes �迭 ����
	ArrayList<Shape> littleshapes = new ArrayList<Shape>(); //shapes �迭 ����
	Shape checkShape;
	FigureEditorFrame topFrame; //topFrame ��ü ����
	Point start=null, end=null; //���콺�� �������� ����
	String selectedBtn = "�簢"; //selectedBtn ���� ����
	PanelA(FigureEditorFrame frame) { //PanelA ����
		topFrame = frame; //�Ķ���ͷ� ���� frame�� topFrame�� �ֱ�
		setBackground(Color.YELLOW); //������ ��������� ����
		MyMouseListener listener = new MyMouseListener(); //listener ��ü ����
        addMouseListener(listener); //���콺 ������ ������Ʈ�� ���
        addMouseMotionListener(listener); //���콺 ���곪 ���콺 �巡���� �Բ� ó���ϰ��� �ϱ� ���� MouseMotion ������ ���
	}
	
	class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            start = e.getPoint(); //���콺�� ���� ���� ���������� ����
        }
        public void mouseDragged(MouseEvent e) {
            end = e.getPoint(); //���콺�� �巡�׵Ǵ� ���� ������������ ����
            repaint(); //�г��� �׸��� ��û �ָ�
        }
        
		
		public void mouseReleased(MouseEvent e) {
			int x = Math.min(start.x, end.x); //���콺�� ���� ���� x���� ���������� ����
	        int y = Math.min(start.y, end.y); //���콺�� ���� ���� y���� ���������� ����
	        int width = Math.abs(start.x - end.x); //x���� ���� �� ���� ����
	        int height = Math.abs(start.y - end.y); //y���� ���� �� ������ ����
	        if(selectedBtn == "�簢") { //�簢 ��ư�� �����ٸ�
            	Shape s = new Rectangle(x, y, width, height); //��ĳ����
				shapes.add(s); // shapes�� s �߰�
            }
            else if(selectedBtn == "Ÿ��") { //Ÿ�� ��ư�� �����ٸ�
            	Shape s = new Oval(x,y,width,height); //��ĳ����
            	shapes.add(s); //shapes�� s �߰�
            }
            else { //�� ���� ���� ��ư�� �����ٸ�
            	Shape s = new Line(x,y,width,height); //��ĳ����
            	shapes.add(s); // shapes�� s�߰�
            }
            repaint(); //�г��� �׸��� ��û
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
        super.paintComponent(g); //�г� ���� ������ �׷��� �ܻ��� ����� ���� ȣǮ
        if(start == null) // ���콺�� ������ �ʾҴٸ�
            return; //�ƹ��͵� ���� �ʱ�
        g.setColor(Color.BLUE); //�Ķ��� ����
        int x = Math.min(start.x, end.x); //���콺�� ���� ���� x���� ���������� ����
        int y = Math.min(start.y, end.y); //���콺�� ���� ���� y���� ���������� ����
        int width = Math.abs(start.x - end.x); //x���� ���� �� ���� ����
        int height = Math.abs(start.y - end.y); //y���� ���� �� ������ ����
        switch(selectedBtn) {
        case "�簢": //�簢 ��ư�� �����ٸ�
        	g.drawRect(x, y, width, height); //�Է� ���� ������ �簢�� �׸���
        	break; //�׸��� ������
        case "Ÿ��": //Ÿ�� ��ư�� �����ٸ�
        	g.drawOval(x, y, width, height); //�Է� ���� ������ Ÿ�� �׸���
        	break; //�׸��� ������
        case "����": //���� ��ư�� ���ȴٸ�
        	g.drawLine(x, y, width, height); //�Է¹��� ������ ���� �׸���
        	break; //�׸��� ������
        }
        for (int i=0; i<shapes.size(); i++) {
        	if(shapes.get(i) instanceof Rectangle) { //���� shapes�� i���� ������ Rectangle Ŭ������ �ν��Ͻ����
        		Rectangle r = (Rectangle)shapes.get(i); //�ٿ�ĳ����
        		r.draw(g); //�簢�� �׸���
        	}
        	if(shapes.get(i) instanceof Oval) { //���� shpaes�� i���� ������ Oval Ŭ������ �ν��Ͻ����
        		Oval o = (Oval)shapes.get(i); //�ٿ�ĳ����
        		o.draw(g); //Ÿ�� �׸���
        	}
        	if(shapes.get(i) instanceof Line) { //���� shapes�� i���� ������ Line Ŭ������ �ν��Ͻ����
        		Line l = (Line)shapes.get(i); //�ٿ�ĳ����
        		l.draw(g); //���� �׸���
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
	FigureEditorFrame topFrame; //topFrame ��ü ����
	
		PanelB(FigureEditorFrame frame) { //PanelB�� ����
		this.topFrame = frame; //�Ķ���ͷ� ���� frame�� ���� ��ü topFrame���� ����
		setBackground(Color.BLUE); //������ �Ķ������� ����
		setLayout(new GridLayout(3,1,5,5));	//3�� 1���� �迭�ϰ� ������Ʈ ������ ������ �����¿�� 5�ȼ��� ����
		JButton btn1 = new JButton("�簢"); //"�簢"��ư ����
		btn1.addActionListener(new MyActionListener()); //�簢��ư�� ������ ActionEvent �߻�
		add(btn1); //�簢��ư �߰�
		JButton btn2 = new JButton("����"); //"����"��ư ����
		btn2.addActionListener(new MyActionListener()); //������ư�� ������ ActionEvent �߻�
		add(btn2); //������ư �߰�
		JButton btn3 = new JButton("Ÿ��"); //"Ÿ��"��ư ����
		btn3.addActionListener(new MyActionListener()); //�簢��ư�� ������ ActionEvent �߻�
		add(btn3); //Ÿ����ư �߰�
	}
		
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { //ActionEvent�� �߻��� ���
			String actionCmd = e.getActionCommand(); //��ư�� ������ �ش� ��ư�� Ŀ�ǵ带 �ޱ�
			topFrame.panelA.selectedBtn = actionCmd; //���õȹ�ư�� �ش� ��ư�� Ŀ�ǵ�� ����
		}
	}
}

class PanelC extends JPanel {
	PanelC(FigureEditorFrame frame) { //PanelC ����
		add(new PanelB(frame)); //��ü frame�� �Ķ���ͷ� �޴� PanelB�� �߰�
	}
}
}
