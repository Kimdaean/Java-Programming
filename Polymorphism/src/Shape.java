public class Shape {
	protected int x, y;
	public Shape() { //디폴트 생성자 생성
		x = y = 0; //변수 x,y를 0으로 초기화
	}
	public Shape(int x, int y) { //셍성자 생성
		if (x >= 0) //x가 정상값을 받았다면
			this.x = x; //객체 x에서 받은 값을 변수 x에 넣기
		if (y >= 0) //y가 정상값을 받았다면
			this.y = y; //객체 y에서 받은 값을 변수 y에 넣기
	}
	public boolean equals(Shape s) {
		return this.x == s.x && this.y == s.y; //파라미터로 받은 x,y가 객체 x,y와 같다면 true를 반환
	}
	public void display() { //현재 객체를 출력하기 위한 함수
		System.out.println(this); //현재 객체를 출력
	}
}
