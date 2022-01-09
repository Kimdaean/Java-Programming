import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명
import java.awt.*; //그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*; //이벤트 처리를 위한 클래스들의 경로명
public class FigureEditor extends JFrame { //JFrame을 상속받는 FigureEditor 생성
	PanelA panelA = new PanelA(); //panelA 객체 생성
	PanelC panelC = new PanelC(panelA); //panelA를 파라미터로 받는 객체 panelC 생성
	FigureEditor(){ //FigureEditor 생성
		setTitle("MyFrame"); //프레임의 제목 설정
		setSize(800,400); //프레임의 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼을 누르면 프레임과 함께 프로그램을 종료하도록 설정
		Container contentPane = getContentPane(); //콘텐트페인 알아내기
		this.addMouseListener(new MyMouseListener()); // 마우스리스너
		contentPane.setLayout(new BorderLayout()); //배치를 borderlayout으로 설정
		contentPane.add(panelA,BorderLayout.CENTER); //중앙에 PanelA설정
		contentPane.add(panelC,BorderLayout.WEST); //왼쪽에 PanelC설정
		setVisible(true); //프레임을 화면에 출력
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) { //마우스가 눌리면
			panelA.label.setLocation(e.getX(),e.getY()); //마우스가 누른 위치로 label 이동
			}
		public void mouseClicked(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String []args) {
		FigureEditor f = new FigureEditor(); //프레임 출력
	}
}