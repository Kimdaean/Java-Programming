package data;
public class Rectangle extends Shape {
	private int height;	//높이의 값을 받을 변수 height 생성
	private int width;	//너비의 값을 받을 변수 width 생성
	public Rectangle() { //디폴트 생성자 생성
		super();
		height = 0; //변수 height를 0으로 초기화
		width = 0; //변수 width를 0으로 초기화
	}
	public Rectangle(int x, int y, int height, int width) {	//x,y,높이,너비 생성자
		super(x,y);
		this.height = height; //객체 height에서 받은 값을 변수 height에 넣기
		this.width = width; //객체 width에서 받은 값을 변수 width에 넣기
	}
	public String toString() { //문자열 표현을 반환 받기 위한 메소드
		return "x=" + getX() + ", y=" + getY() + ", height=" + height + ", width=" + width; //변수 x,y,radius를 문자열로 반환
	}
	public int getHeight() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return height; //변수 height 값을 반환
	}
	public int getWidth() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return width; //변수 width 값을 반환
	}
	public boolean equals(Rectangle r) { //객체 r과 현재 객체가 동일한 사각형인지 판단하기 위한 함수
		if (this == r)	//동일한 사각형이라면
			return true; //true를 반환
		if (r == null)	//동일한 사각형이 아니라면
			return false; //false를 반환
		return this.getX() == r.getX() && this.getY() == r.getY() && this.height == r.height && this.width == r.width;	//모든 값이 같으면 true를 반환
	}
}
