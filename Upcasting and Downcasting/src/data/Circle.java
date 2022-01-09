package data;
public class Circle extends Shape {
	private int radius;
	public Circle() { //�ʱ�ȭ �ϱ� ���� ����Ʈ ������
		super();
		radius = 0;
	}
	public Circle(int x, int y, int radius) { //x,y,������ ������
		super(x,y);
		this.radius = radius; //��ü radius���� ���� ���� ���� radius�� �ֱ�
	}
	public int getRadius() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return radius; //���� radius ���� ��ȯ
	}
	public void setRadius(int radius) { //��ü radius���� ���� ���� ���� radius�� �ֱ� ���� �Լ� ����
		this.radius = radius; //��ü radius���� ���� ���� ���� radius�� �ֱ�
	}
	public String toString() { //���ڿ� ǥ���� ��ȯ �ޱ� ���� �޼ҵ�
		return "x=" + getX() + ", y=" + getY() + ", radius=" + radius; //���� X,Y,radis�� ���ڿ��� ��ȯ
	}
	public boolean equals(Circle c) { //��ü c�� ���� ��ü�� ������ ������ �Ǵ��ϱ� ���� �Լ�
		if (this == c)	//������ ���̶��
			return true; //true�� ��ȯ
		if (c == null)	//������ ���� �ƴ϶��
			return false; //false�� ��ȯ
		return this.getX() == c.getX() && this.getY() == c.getY() && this.radius == c.radius; //��� ���� ������ true�� ��ȯ
	}
}