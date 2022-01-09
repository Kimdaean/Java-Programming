public class Rectangle extends Shape {
	private int width , height; //���� width, height ����
	public Rectangle(int x, int y, int width, int height) { //����Ʈ ������ ����
		super(x,y); //����Ŭ�������� ���� ���� x,y�� �ʱ�ȭ
		if (width > 0) //���� width�� ������ �޾Ҵٸ�
			this.width = width; //��ü width���� ���� ���� ���� width�� �ֱ�
		else //���� width�� ������ ���� ���Ͽ��ٸ�
			this.width = 1; //���� width�� 1 ����
		if (height > 0) //���� height�� ������ �޾Ҵٸ�
			this.height = height; //��ü height���� ���� ���� ���� height�� �ֱ�
		else //���� height�� ������ ���� ���Ͽ��ٸ�
			this.height = 1; //���� height�� 1 ����
	}
	public int getWidth() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return width; //���� width ���� ��ȯ
	}
	public void setWidth(int width) { //��ü width���� ���� ���� ���� width�� �ֱ� ���� �Լ� ����
		this.width = width; //��ü width���� ���� ���� ���� width�� �ֱ�
	}
	public int getHeight() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return height; //���� height ���� ��ȯ
	}
	public void setHeight(int height) { //��ü height���� ���� ���� ���� height�� �ֱ� ���� �Լ� ����
		this.height = height; //��ü height���� ���� ���� ���� height�� �ֱ�
	}
	public String toString() { //���ڿ� ǥ���� ��ȯ �ޱ� ���� �޼ҵ�
		return String.format("[Rectangle ��ü]x = %d, y = %d, width = %d, height = %d", x , y , width , height); //���� x,y,width,height�� ���ڿ��� ��ȯ
	}
	public boolean equals(Shape s) {
		if (s instanceof Rectangle) { //��ü s�� Rectangle Ŭ������ �ν��Ͻ����
			Rectangle r = (Rectangle)s; //s�� r�� �ٿ�ĳ����
			return super.equals(s) && this.width == r.width && this.height == r.height; //x,y,width,heiight�� �������� ������ true�� ��ȯ
		}
		return false; //���� ������ false�� ��ȯ
	}
}
