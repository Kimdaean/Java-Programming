public class Circle extends Shape{
	private int radius; //���� radius ����
	public Circle(int x, int y, int radius) { //����Ʈ ������ ����
		super(x,y); //����Ŭ�������� ���� ���� x,y�� �ʱ�ȭ
		if(radius > 0) //radius�� ������ ������
			this.radius = radius; //��ü radius���� ���� ���� ���� radius�� �ֱ�
		else //���� radius�� ������ ���� ���Ͽ��ٸ�
			this.radius = 1; //���� radius�� 1�� ����
	}
	public int getRadius() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return radius; //���� radius ���� ��ȯ
	}
	public void setRadius(int radius) { //��ü radius���� ���� ���� ���� radius�� �ֱ� ���� �Լ� ����
		this.radius = radius; //��ü radius���� ���� ���� ���� radius�� �ֱ�
	}
	public String toString() { //���ڿ� ǥ���� ��ȯ �ޱ� ���� �޼ҵ�
		return String.format("[Circle ��ü] x = %d, y = %d, radius = %d", x , y , radius); //���� x,y,radius�� ���ڿ��� ��ȯ
	}
	public boolean equals(Shape s) {
		if (s instanceof Circle) { //��ü s�� Circle Ŭ������ �ν��Ͻ����
			Circle c = (Circle)s; //s�� c�� �ٿ�ĳ����
			return super.equals(s) && this.radius == c.radius; //x,y,radius�� ���ٸ� true�� ��ȯ
		}else //���� �ʴٸ�
		return false; //false�� ��ȯ
	}
	public void display() {	//x,y,radius�� ����ϱ� ���� �Լ� ����
		System.out.println(String.format("[Circle ��ü] x = %d, y = %d, Radius = %d", x,y,radius)); //x,y,radius�� ���
	}
}