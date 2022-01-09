package data;
public class Rectangle {
	private int x; //변수 x 생성
	private int y; //변수 y 생성
	private int height;	//높이의 값을 받을 변수 height 생성
	private int width; //너비의 값을 받을 변수 width 생성
	public Rectangle() { //초기화 하기 위한 디폴트 생성자 생성
		x=0; //변수 x를 0으로 초기화
		y=0; //변수 y를 0으로 초기화
		height = 0; //변수 height를 0으로 초기화
		width = 0; //변수 width를 0으로 초기화
	}
	public Rectangle(int x, int y, int height, int width) {	//x,y,높이,너비 생성자
		this.x = x; //객체 x에서 받은 값을 변수 x에 넣기
		this.y =y; //객체 y에서 받은 값을 변수 y에 넣기
		this.height = height; //객체 height에서 받은 값을 변수 height에 넣기
		this.width = width; //객체 width에서 받은 값을 변수 width에 넣기
	}
	public int getX() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return x; //변수 x 값을 반환
	}
	public int getY() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return y; //변수 y 값을 반환
	}
	public int setX(int x) { //객체 x에서 받은 값을 변수 x에 넣고 반환하기 위한 함수 생성
		return this.x = x; //객체 x에서 받은 값을 변수 x에 넣고 반환하기
	}
	public String toString() { //문자열 표현을 반환 받기 위한 메소드
		return "x=" + getX() + ", y=" + getY() + ", height=" + height + ", width=" + width; //변수 x,y,radius를 문자열로 반환
	}
	public int getHeight() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return height; //변수 height 값을 반환
	}
	public void setHeight(int height) { //객체 height에서 받은 값을 변수 height에 넣기 위한 함수 생성
		this.height = height; //객체 height에서 받은 값을 변수 height에 넣기
	}
	public int getWidth() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return width; //변수 width 값을 반환
	}
	public void setWidth(int width) { //객체 width에서 받은 값을 변수 width에 넣기 위한 함수 생성
		this.width = width; //객체 width에서 받은 값을 변수 width에 넣기
	}
	public boolean equals(Rectangle r) { //객체 r과 현재 객체가 동일한 사각형인지 판단하기 위한 함수
		if (this == r)	//객체 r과 현재 객체가 동일한 사각형이면
			return true; //true를 반환
		if (r == null)	//객체 r과 현재 객체가 동일한 사각형이 아니면
			return false; //false를 반환
		return this.getX() == r.getX() && this.getY() == r.getY() && this.height == r.height && this.width == r.width;	//모든 값이 같으면 true를 반환
	}
}
