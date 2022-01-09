import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명
import java.awt.*; //그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*; //이벤트 처리를 위한 클래스들의 경로명
public class PanelB extends JPanel{	//JPanel 컨테이너
	PanelA panelA; //레퍼러슨 변수 panelA생성
	PanelB(PanelA panelA){ //파라미터로 panelA를 받는 PanelB 생성
		this.panelA = panelA; //파라미터로 받은 panelA를 현재 객체 panelA로 설정
		setBackground(Color.BLUE); //배경색을 파란색으로 설정
		setLayout(new GridLayout(3,1,5,5));	//3행 1열로 배열하고 컴포넌트 사이의 간격을 상하좌우로 5픽셀로 설정
		JButton btn1 = new JButton("사각"); //"사각" 버튼 생성
		btn1.addActionListener(new MyActionListener()); //사각버튼이 눌리면 ActionEvent 발생
		add(btn1); //사각버튼 추가
		JButton btn2 = new JButton("직선"); //"직선" 버튼 생성
		btn2.addActionListener(new MyActionListener()); //직선버튼이 눌리면 ActionEvent 발생
		add(btn2); //직선버튼 추가
		JButton btn3 = new JButton("타원"); //"타원" 버튼 생성
		btn3.addActionListener(new MyActionListener()); //타원버튼이 눌리면 ActionEvent 발생
		add(btn3); //타원버튼 추가
	}
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { //ActionEvent가 발생할 경우
				String actionCmd = e.getActionCommand(); //버튼을 누르면 해당 버튼의 커맨드를 받기
				panelA.label.setText(actionCmd); //label을 해당 버튼의 커맨드로 설정
			}
		}
	}