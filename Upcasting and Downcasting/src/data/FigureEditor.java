package data;
import java.util.ArrayList;	//ArrayList 불러오기
public class FigureEditor {
	private ArrayList<Shape> Shapes; //Shape 타입의 Shapes배열 생성
	private int numOfShape;	//Shapes 배열의 갯수를 받기 위한 numOfShape 변수 생성
	public FigureEditor() { //초기화 하기 위한 디폴트 생성자 생성
		Shapes = new ArrayList<Shape>(); //Shapes 배열 초기화
		numOfShape = 0;	//Shapes 배열의 갯수를 0으로 초기화
	}
	public void add(Shape s) { //객체 s을 멤버변수로 선언된 Shapes 배열에 추가
		boolean x = true; //즁복되는 것이 있다면 제거하기 위해
		if(s instanceof Rectangle) { //객체 s가 Rectangle 클래스의 인스턴스라면
			if(true) {
				for(int i = 0; i< numOfShape; i++) { //처음 인덱스부터 마지막 배열의 인덱스까지
					if((Shapes.get(i) instanceof Rectangle)) { //만일 Shapes의 i번재 변수가 Rectangle 클래스의 인스턴스라면
						Rectangle R =  (Rectangle) Shapes.get(i); //Rectangle 객체 R 생성 후 저장
						if(R.equals((Rectangle)s)) { //만일 Shape 객체 s와 Rectangle 객체 R이 같다면
							x = false;	//저장하지 않음
						}
					}
				}
			}
		}
		if(s instanceof Circle) { //객체 s가 Circle 클래스의 인스턴스라면
			if(true) {
				for(int i = 0; i< numOfShape; i++) { //처음 인덱스부터 마지막 배열의 인덱스까지
					if((Shapes.get(i) instanceof Circle)) {	//만일 Shapes의 i번재 변수가 Circle 클래스의 인스턴스라면
						Circle C =  (Circle)Shapes.get(i); //Circle 객체 C 생성 후 저장
						if(C.equals((Circle)s)) { //만일 Shape 객체 s와 Circle 객체 C가 같다면
							x = false;	//저장하지 않음
						}
					}
				}
			}
		}
		if(x) { //Shape 객체 s와 동일한 사각형과 원이 없다면
			Shapes.add(s); //Shapes 배열에 객체 s를 추가
			numOfShape++; //배열갯수 하나 추가
		}
	}
	public void display() {
		System.out.println("-------------Shapes-------------");
		for(int  i = 0;  i<numOfShape;i++) { //처음 인덱스부터 마지막 배열의 인덱스까지
			if(Shapes.get(i) instanceof Rectangle) //만일 Shapes의 i번재 변수가 Rectangle 클래스의 인스턴스라면
				System.out.println((Rectangle)Shapes.get(i)); //출력
			if(Shapes.get(i) instanceof Circle)	//만일 Shapes의 i번재 변수가 Circle 클래스의 인스턴스라면	
				System.out.println((Circle)Shapes.get(i)); //출력
					}
				}
		}