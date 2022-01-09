import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명
public class PanelC extends JPanel{	//JPanel 컨테이너
	PanelC(PanelA panelA){ //레퍼런스 변수 panelA를 파라미터로 받는 PanelC 생성
		add(new PanelB(panelA)); //PanelC에 레퍼런스 변수 panelA를 파라미터로 받는 PanelB추가
	}
}