package �ǽ�12;

import java.awt.Graphics;

public class Oval extends Shape {
	private int width , height; //���� width, height ����
	public Oval(int x, int y, int width, int height) { //����Ʈ ������ ����
		super(x,y); //����Ŭ�������� ���� ���� x,y�� �ʱ�ȭ
		this.width = width; //��ü width���� ���� ���� ���� width�� �ֱ�
		this.height = height; //��ü height���� ���� ���� ���� height�� �ֱ�
	}
	public void draw(Graphics g) { //�׸��� �׸��� ���� �Լ�
		g.drawOval(x, y, width, height); //Ÿ���� ���� �Է� �޾� �׸��� ���� �Լ�
	}
}