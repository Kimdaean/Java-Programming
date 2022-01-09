package 실습12;

public class Shape {
	protected int x, y;
	public Shape() { //디폴트 생성자 생성
		x = y = 0; //변수 x,y를 0으로 초기화
	}
	public Shape(int x, int y) { //셍성자 생성
			this.x = x; //객체 x에서 받은 값을 변수 x에 넣기
			this.y = y; //객체 y에서 받은 값을 변수 y에 넣기
	}
}
