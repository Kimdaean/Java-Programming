package 실습12;
import java.awt.Graphics;

public class Rectangle extends Shape {
	private int width , height; //변수 width, height 생성
	public Rectangle(int x, int y, int width, int height) { //디폴트 생성자 생성
		super(x,y); //슈퍼클래스에서 받은 변수 x,y를 초기화
		this.width = width; //객체 width에서 받은 값을 변수 width에 넣기
		this.height = height; //객체 height에서 받은 값을 변수 height에 넣기
	}
	public void draw(Graphics g) { //그림을 그리기 위한 함수
		g.drawRect(x, y, width, height); //사각형의 값을 입력 받아 그리기 위한 함수
	}
}