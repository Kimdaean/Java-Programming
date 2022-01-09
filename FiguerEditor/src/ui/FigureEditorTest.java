package ui;
import data.Circle;
import data.FigureEditor;
import data.Rectangle;
public class FigureEditorTest {
	public static void main(String[] args) {
		FigureEditor editor = new FigureEditor(); //FigureEditor 클래스에서 editor 변수 생성
		Rectangle r1 = new Rectangle(1,2,3,4); //Rectangle 클래스에서 r1 변수 생성
		Rectangle r2 = new Rectangle(2,3,4,5); //Rectangle 클래스에서 r2 변수 생성
		Circle c1 = new Circle(3,4,5); //Circle 클래스에서 c1 변수 생성
		Circle c2 = new Circle(4,5,6); //Circle 클래스에서 c2 변수 생성
		editor.add(r1);	//editor에 r1 저장하기
		editor.add(r2);	//editor에 r2 저장하기
		editor.add(c1);	//editor에 c1 저장하기
		editor.add(c2);	//editor에 c2 저장하기
		editor.display(); //editor에 저장된 모든 값 출력
		Rectangle r3 = new Rectangle(2,3,4,5); //Rectangle 클래스에서 r2와 같은 값을 가진 변수 r3 생성
		editor.add(r3);	//editor에 r3집어 넣기
		editor.display(); //중복된 값이 추가되었는지 확인하기 위해 출력
		r3.setX(1);	//변수 r3의 x좌표값을 1로 변경
		editor.add(r3);	//editor에 r3집어 넣기
		Circle c3 = new Circle(4,5,6); //Circle 클래스에서 c1과 같은 가진 변수 c3 생성
		editor.add(c3);	//editor에 c3집어 넣기
		editor.display(); //새로운 값이 추가 되고 중복된 값은 추가되지 않았는지 확인하기 위해 출력
	}
}