import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명
import java.awt.*; //그래픽 처리를 위한 클래스들의 경로명
public class PanelA extends JPanel { //JPanel 컨테이너
	JLabel label; //레퍼런스 변수 label 생성
	PanelA(){ //PanelA 생성
		setBackground(Color.YELLOW); //배경색을 노란색으로 설정
		setLayout(new FlowLayout()); //FlowLayout 생성
		label = new JLabel("여기가 그래픽 객체를 그리는 곳입니다."); //레이블에 출력될 문구 설정
		add(label);	//레이블에 문구 출력
	}
}