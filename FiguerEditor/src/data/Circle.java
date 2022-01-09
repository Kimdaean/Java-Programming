package data;
public class Circle {
	private int x; //���� x�� ����
	private int y; //���� y�� ����
	private int radius;	//�������� �ޱ� ���� ���� radius ����
	public Circle() { //�ʱ�ȭ �ϱ� ���� ����Ʈ ������ ����
		x=0; //���� x�� 0���� �ʱ�ȭ
		y=0; //���� y�� 0���� �ʱ�ȭ
		radius = 0; //���� radius�� 0���� �ʱ�ȭ
	}
	public Circle(int x, int y, int radius) { //x,y,������ ������
		this.x = x; //��ü x���� ���� ���� ���� x�� �ֱ�
		this.y= y; //��ü y���� ���� ���� ���� y�� �ֱ�
		this.radius = radius; //��ü radius���� ���� ���� ���� radius�� �ֱ�
	}
	public int getX() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return x; //���� x ���� ��ȯ
	}
	public int getY() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return y; //���� y ���� ��ȯ
	}
	public int getRadius() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return radius; //���� radius ���� ��ȯ
	}
	public void setRadius(int radius) { //��ü radius���� ���� ���� ���� radius�� �ֱ� ���� �Լ� ����
		this.radius = radius; //��ü radius���� ���� ���� ���� radius�� �ֱ�
	}
	public String toString() { //���ڿ� ǥ���� ��ȯ �ޱ� ���� �޼ҵ�
		return "x=" + getX() + ", y=" + getY() + ", radius=" + radius; //���� X,Y,radius�� ���ڿ��� ��ȯ
	}
	public boolean equals(Circle c) { //��ü c�� ���� ��ü�� ������ ������ �Ǵ��ϱ� ���� �Լ�
		if (this == c)	//��ü c�� ���� ��ü�� ������ ���̸�
			return true; //true�� ��ȯ
		if (c == null)	//��ü c�� ���� ��ü�� ������ ���� �ƴ϶��
			return false; //false�� ��ȯ
		return this.getX() == c.getX() && this.getY() == c.getY() && this.radius == c.radius; //��� ���� ������ true�� ��ȯ
	}
}