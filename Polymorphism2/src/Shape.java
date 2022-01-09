public class Shape {
	protected int x, y;
	public Shape() { //����Ʈ ������ ����
		x = y = 0; //���� x,y�� 0���� �ʱ�ȭ
	}
	public Shape(int x, int y) { //�ļ��� ����
		if (x >= 0) //x�� ������ �޾Ҵٸ�
			this.x = x; //��ü x���� ���� ���� ���� x�� �ֱ�
		if (y >= 0) //y�� ������ �޾Ҵٸ�
			this.y = y; //��ü y���� ���� ���� ���� y�� �ֱ�
	}
	public boolean equals(Shape s) {
		return this.x == s.x && this.y == s.y; //�Ķ���ͷ� ���� x,y�� ��ü x,y�� ���ٸ� true�� ��ȯ
	}
}
