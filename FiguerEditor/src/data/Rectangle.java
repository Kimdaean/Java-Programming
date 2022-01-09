package data;
public class Rectangle {
	private int x; //���� x ����
	private int y; //���� y ����
	private int height;	//������ ���� ���� ���� height ����
	private int width; //�ʺ��� ���� ���� ���� width ����
	public Rectangle() { //�ʱ�ȭ �ϱ� ���� ����Ʈ ������ ����
		x=0; //���� x�� 0���� �ʱ�ȭ
		y=0; //���� y�� 0���� �ʱ�ȭ
		height = 0; //���� height�� 0���� �ʱ�ȭ
		width = 0; //���� width�� 0���� �ʱ�ȭ
	}
	public Rectangle(int x, int y, int height, int width) {	//x,y,����,�ʺ� ������
		this.x = x; //��ü x���� ���� ���� ���� x�� �ֱ�
		this.y =y; //��ü y���� ���� ���� ���� y�� �ֱ�
		this.height = height; //��ü height���� ���� ���� ���� height�� �ֱ�
		this.width = width; //��ü width���� ���� ���� ���� width�� �ֱ�
	}
	public int getX() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return x; //���� x ���� ��ȯ
	}
	public int getY() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return y; //���� y ���� ��ȯ
	}
	public int setX(int x) { //��ü x���� ���� ���� ���� x�� �ְ� ��ȯ�ϱ� ���� �Լ� ����
		return this.x = x; //��ü x���� ���� ���� ���� x�� �ְ� ��ȯ�ϱ�
	}
	public String toString() { //���ڿ� ǥ���� ��ȯ �ޱ� ���� �޼ҵ�
		return "x=" + getX() + ", y=" + getY() + ", height=" + height + ", width=" + width; //���� x,y,radius�� ���ڿ��� ��ȯ
	}
	public int getHeight() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return height; //���� height ���� ��ȯ
	}
	public void setHeight(int height) { //��ü height���� ���� ���� ���� height�� �ֱ� ���� �Լ� ����
		this.height = height; //��ü height���� ���� ���� ���� height�� �ֱ�
	}
	public int getWidth() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return width; //���� width ���� ��ȯ
	}
	public void setWidth(int width) { //��ü width���� ���� ���� ���� width�� �ֱ� ���� �Լ� ����
		this.width = width; //��ü width���� ���� ���� ���� width�� �ֱ�
	}
	public boolean equals(Rectangle r) { //��ü r�� ���� ��ü�� ������ �簢������ �Ǵ��ϱ� ���� �Լ�
		if (this == r)	//��ü r�� ���� ��ü�� ������ �簢���̸�
			return true; //true�� ��ȯ
		if (r == null)	//��ü r�� ���� ��ü�� ������ �簢���� �ƴϸ�
			return false; //false�� ��ȯ
		return this.getX() == r.getX() && this.getY() == r.getY() && this.height == r.height && this.width == r.width;	//��� ���� ������ true�� ��ȯ
	}
}
