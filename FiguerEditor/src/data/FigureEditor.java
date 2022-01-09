package data;
import java.util.ArrayList; //ArrayList 불러오기
public class FigureEditor {
	private ArrayList<Rectangle> Rectangles; //Rectangle 타입의 Rectangles 배열 생성
	private int numOfRect; //Rectangles 배열의 갯수를 받기 위한 변수 numDfRect 생성
	private ArrayList<Circle> Circles; //Circle 타입의 Circles 배열 생성
	private int numOfCircle; //Circles 배열의 갯수를 받기 위한 변수 numDfCircle 생성
	public FigureEditor() { //초기화 하기 위한 디폴트 생성자 생성
		Rectangles = new ArrayList<Rectangle>(); //Rectangles 배열 생성
		numOfRect = 0; //변수 numOfRect를 0으로 초기화
		Circles = new ArrayList<Circle>(); //Circles 배열 생성
		numOfCircle = 0; //변수 numOfCircle 0으로 초기화
		}
	public void add(Rectangle r) { //객체 r을 멤버변수로 선언된 Rectangles 배열에 추가
		boolean x = true; //즁복되는 것이 있다면 저장하지 않기 위해
				if(true) {
					for(int i = 0; i< numOfRect; i++) {	//처음 인덱스부터 배열의 마지막 인덱스까지
						if((Rectangles.get(i) instanceof Rectangle)) { //만일 Rectangles의 i번재 변수가 Rectangle 클래스의 인스턴스라면
							Rectangle R = (Rectangle)Rectangles.get(i); //Rectangle 객체 R 생성 후 저장
							if(R.equals((Rectangle)r)) { //만일 Rectangle 객체 r과 Rectangle객체 R이 같다면
								x = false; //저장하지 않음
							}
							}
						}
					}
		if(x) { //Rectangle 객체 r과 동일한 사각형이 없다면
			Rectangles.add(r); //Rectangles 배열에 r 추가
			numOfRect++; //배열갯수 하나 추가
			}
		}
	public void add(Circle c) {	//객체 c을 멤버변수로 선언된 Circles 배열에 추가
		boolean x = true; //즁복되는 것이 있다면 저장하지 않기 위해
				if(true) {
					for(int i = 0; i< numOfCircle; i++) { //처음 인덱스부터 배열의 마지막 인덱스까지
						if((Circles.get(i) instanceof Circle)) { //만일 Circles의 i번재 변수가 Circle 클래스의 인스터라면
							Circle C =  (Circle) Circles.get(i); //Circle 객체 C 생성 후 저장
							if(C.equals((Circle)c)) { //만일 Circle 객체 c와 Circle 객체 C가 같다면
								x = false; //저장하지 않음
							}
						}
					}
				}
		if(x) { //Circle 객체 r과 동일한 원이 없다면
			Circles.add(c);	//Circles 배열에 c 추가
			numOfCircle++; //배열갯수 하나 추가
		}
	}
	public void display() {
		System.out.println("-------------Rectangles-------------");
		for(int  i = 0;  i<numOfRect;i++) {	//처음 인덱스부터 배열의 마지막 인덱스까지
			if(Rectangles.get(i) instanceof Rectangle) { //만일 Rectangles의 i번재 변수가 Rectangle 클래스의 인스턴스라면
				System.out.println((Rectangle)Rectangles.get(i)); //출력
				}
			}
		System.out.println("-------------Circle-------------");
		for(int  i = 0;  i<numOfCircle;i++) { //배열의 갯수만큼 반복
			if(Circles.get(i) instanceof Circle) { //만일 Circles의 i번재 변수가 Circle 클래스의 인스터라면
				System.out.println((Circle)Circles.get(i));	//출력
			}
		}
	}
}
