package data;
public class Shape {
	private int x; //private ���� X ����
	private int y; //private ���� Y ����
	public int getX() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return x; //���� X ���� ��ȯ
	}
	public void setX(int x) { //��ü x���� ���� ���� ���� X�� �ֱ� ���� �Լ� ����
		this.x = x; //��ü x���� ���� ���� ���� X�� �ֱ�
	}
	public int getY() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return y; //���� Y ���� ��ȯ
	}
	public Shape() { //����Ʈ ������ ����
		x = 0; //���� X�� 0���� �ʱ�ȭ
		y = 0; //���� Y�� 0���� �ʱ�ȭ
	}
	
	public Shape(int x, int y) { //������ ����
		this.x = x; //��ü x���� ���� ���� ���� X�� �ֱ�
		this.y = y; //��ü y���� ���� ���� ���� Y�� �ֱ�
	}
}