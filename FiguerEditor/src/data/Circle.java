package data;
public class Circle {
	private int x; //변수 x를 생성
	private int y; //변수 y를 생성
	private int radius;	//반지름을 받기 위한 변수 radius 생성
	public Circle() { //초기화 하기 위한 디폴트 생성자 생성
		x=0; //변수 x를 0으로 초기화
		y=0; //변수 y를 0으로 초기화
		radius = 0; //변수 radius를 0으로 초기화
	}
	public Circle(int x, int y, int radius) { //x,y,반지름 생성자
		this.x = x; //객체 x에서 받은 값을 변수 x에 넣기
		this.y= y; //객체 y에서 받은 값을 변수 y에 넣기
		this.radius = radius; //객체 radius에서 받은 값을 변수 radius에 넣기
	}
	public int getX() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return x; //변수 x 값을 반환
	}
	public int getY() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return y; //변수 y 값을 반환
	}
	public int getRadius() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return radius; //변수 radius 값을 반환
	}
	public void setRadius(int radius) { //객체 radius에서 받은 값을 변수 radius에 넣기 위한 함수 생성
		this.radius = radius; //객체 radius에서 받은 값을 변수 radius에 넣기
	}
	public String toString() { //문자열 표현을 반환 받기 위한 메소드
		return "x=" + getX() + ", y=" + getY() + ", radius=" + radius; //변수 X,Y,radius를 문자열로 반환
	}
	public boolean equals(Circle c) { //객체 c와 현재 객체가 동일한 원인지 판단하기 위한 함수
		if (this == c)	//객체 c와 현재 객체가 동일한 원이면
			return true; //true를 반환
		if (c == null)	//객체 c와 현재 객체가 동일한 원이 아니라면
			return false; //false를 반환
		return this.getX() == c.getX() && this.getY() == c.getY() && this.radius == c.radius; //모든 값이 같으면 true를 반환
	}
}