package data;
public class Shape {
	private int x; //private 변수 X 생성
	private int y; //private 변수 Y 생성
	public int getX() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return x; //변수 X 값을 반환
	}
	public void setX(int x) { //객체 x에서 받은 값을 변수 X에 넣기 위한 함수 생성
		this.x = x; //객체 x에서 받은 값을 변수 X에 넣기
	}
	public int getY() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return y; //변수 Y 값을 반환
	}
	public Shape() { //디폴트 생성자 생성
		x = 0; //변수 X를 0으로 초기화
		y = 0; //변수 Y를 0으로 초기화
	}
	
	public Shape(int x, int y) { //생성자 생성
		this.x = x; //객체 x에서 받은 값을 변수 X에 넣기
		this.y = y; //객체 y에서 받은 값을 변수 Y에 넣기
	}
}