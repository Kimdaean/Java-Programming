package �ǽ�12;
import java.awt.Graphics;

public class Line extends Shape { 
	private int width , height; //���� width, height ����
	public Line(int x, int y, int width, int height) { //����Ʈ ������ ����
		super(x,y); //����Ŭ�������� ���� ���� x,y�� �ʱ�ȭ
		this.setWidth(width); //��ü width���� ���� ���� ���� width�� �ֱ�
		this.setHeight(height); //��ü height���� ���� ���� ���� height�� �ֱ�
	}
	public void draw(Graphics g) { //�׸��� �׸��� ���� �Լ�
		g.drawLine(x, y, getWidth(), getHeight()); //������ �� �Է� �޾� �׸��� ���� �Լ� ����
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
