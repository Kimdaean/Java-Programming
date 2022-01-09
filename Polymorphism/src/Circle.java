public class Circle extends Shape{
	private int radius; //변수 radius 생성
	public Circle(int x, int y, int radius) { //디폴트 생성자 생성
		super(x,y); //슈퍼클래스에서 받은 변수 x,y를 초기화
		if(radius > 0) //radius가 정상값을 받으면
			this.radius = radius; //객체 radius에서 받은 값을 변수 radius에 넣기
		else //변수 radius가 정상값을 받지 못하였다면
			this.radius = 1; //변수 radius에 1을 저장
	}
	public int getRadius() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return radius; //변수 radius 값을 반환
	}
	public void setRadius(int radius) { //객체 radius에서 받은 값을 변수 radius에 넣기 위한 함수 생성
		this.radius = radius; //객체 radius에서 받은 값을 변수 radius에 넣기
	}
	public String toString() { //문자열 표현을 반환 받기 위한 메소드
		return String.format("[Circle 객체]x = %d, y = %d, radius = %d", x , y , radius); //변수 x,y,radius를 문자열로 반환
	}
	public boolean equals(Shape s) {
		if (s instanceof Circle) { //객체 s가 Circle 클래스의 인스턴스라면
			Circle c = (Circle)s; //s를 c로 다운캐스팅
			return super.equals(s) && this.radius == c.radius; //x,y,radius가 같다면 true를 반환
		}else //같지 않다면
		return false; //false를 반환
	}
}
