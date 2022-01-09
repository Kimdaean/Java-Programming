public class Rectangle extends Shape {
	private int width , height; //변수 width, height 생성
	public Rectangle(int x, int y, int width, int height) { //디폴트 생성자 생성
		super(x,y); //슈퍼클래스에서 받은 변수 x,y를 초기화
		if (width > 0) //변수 width가 정상값을 받았다면
			this.width = width; //객체 width에서 받은 값을 변수 width에 넣기
		else //변수 width가 정상값을 받지 못하였다면
			this.width = 1; //변수 width에 1 저장
		if (height > 0) //변수 height가 정상값을 받았다면
			this.height = height; //객체 height에서 받은 값을 변수 height에 넣기
		else //변수 height가 정상값을 받지 못하였다면
			this.height = 1; //변수 height에 1 저장
	}
	public int getWidth() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return width; //변수 width 값을 반환
	}
	public void setWidth(int width) { //객체 width에서 받은 값을 변수 width에 넣기 위한 함수 생성
		this.width = width; //객체 width에서 받은 값을 변수 width에 넣기
	}
	public int getHeight() { //private 멤버 변수를 다른 클래스에서 사용하기 위한 메소드
		return height; //변수 height 값을 반환
	}
	public void setHeight(int height) { //객체 height에서 받은 값을 변수 height에 넣기 위한 함수 생성
		this.height = height; //객체 height에서 받은 값을 변수 height에 넣기
	}
	public String toString() { //문자열 표현을 반환 받기 위한 메소드
		return String.format("[Rectangle 객체] x = %d, y = %d, width = %d, height = %d", x , y , width , height); //변수 x,y,width,height를 문자열로 반환
	}
	public boolean equals(Shape s) {
		if (s instanceof Rectangle) { //객체 s가 Rectangle 클래스의 인스턴스라면
			Rectangle r = (Rectangle)s; //s를 r로 다운캐스팅
			return super.equals(s) && this.width == r.width && this.height == r.height; //x,y,width,heiight가 비교했을때 같으면 true를 반환
		}
		return false; //같지 않으면 false를 반환
	}
	public void dispay() { //x,y,width,height를 출력하기 위한 함수 생성
		System.out.println(String.format("[Rectangle 객체] x = %d, y = %d, width = %d, height = %d\", x , y , width , height"));
	}
}
