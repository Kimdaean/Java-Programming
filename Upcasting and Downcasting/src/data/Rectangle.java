package data;
public class Rectangle extends Shape {
	private int height;	//������ ���� ���� ���� height ����
	private int width;	//�ʺ��� ���� ���� ���� width ����
	public Rectangle() { //����Ʈ ������ ����
		super();
		height = 0; //���� height�� 0���� �ʱ�ȭ
		width = 0; //���� width�� 0���� �ʱ�ȭ
	}
	public Rectangle(int x, int y, int height, int width) {	//x,y,����,�ʺ� ������
		super(x,y);
		this.height = height; //��ü height���� ���� ���� ���� height�� �ֱ�
		this.width = width; //��ü width���� ���� ���� ���� width�� �ֱ�
	}
	public String toString() { //���ڿ� ǥ���� ��ȯ �ޱ� ���� �޼ҵ�
		return "x=" + getX() + ", y=" + getY() + ", height=" + height + ", width=" + width; //���� x,y,radius�� ���ڿ��� ��ȯ
	}
	public int getHeight() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return height; //���� height ���� ��ȯ
	}
	public int getWidth() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return width; //���� width ���� ��ȯ
	}
	public boolean equals(Rectangle r) { //��ü r�� ���� ��ü�� ������ �簢������ �Ǵ��ϱ� ���� �Լ�
		if (this == r)	//������ �簢���̶��
			return true; //true�� ��ȯ
		if (r == null)	//������ �簢���� �ƴ϶��
			return false; //false�� ��ȯ
		return this.getX() == r.getX() && this.getY() == r.getY() && this.height == r.height && this.width == r.width;	//��� ���� ������ true�� ��ȯ
	}
}
