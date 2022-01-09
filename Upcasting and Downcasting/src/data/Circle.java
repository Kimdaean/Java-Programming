package data;
public class Circle extends Shape {
	private int radius;
	public Circle() { //초기화 하기 위한 디폴트 생성자
		super();
		radius = 0;
	}
	public Circle(int x, int y, int radius) { //x,y,반지름 생성자
		super(x,y);
		this.radius = radius; //객체 radius에서 받은 값을 변수 radius에 넣기
	}
	public int getRadius() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return radius; //변수 radius 값을 반환
	}
	public void setRadius(int radius) { //객체 radius에서 받은 값을 변수 radius에 넣기 위한 함수 생성
		this.radius = radius; //객체 radius에서 받은 값을 변수 radius에 넣기
	}
	public String toString() { //문자열 표현을 반환 받기 위한 메소드
		return "x=" + getX() + ", y=" + getY() + ", radius=" + radius; //변수 X,Y,radis를 문자열로 반환
	}
	public boolean equals(Circle c) { //객체 c와 현재 객체가 동일한 원인지 판단하기 위한 함수
		if (this == c)	//동일한 원이라면
			return true; //true를 반환
		if (c == null)	//동일한 원이 아니라면
			return false; //false를 반환
		return this.getX() == c.getX() && this.getY() == c.getY() && this.radius == c.radius; //모든 값이 같으면 true를 반환
	}
}