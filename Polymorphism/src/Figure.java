public class Figure {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10, 100, 100); //Rectangle Ŭ�������� r1 ���� ����
        Rectangle r2 = new Rectangle(0, 10, 100, 100); //Rectangle Ŭ�������� r2 ���� ����
        Rectangle r3 = new Rectangle(10, 10, 10, 100); //Rectangle Ŭ�������� r3 ���� ����
        Rectangle r4 = new Rectangle(10, 10, 100, 100); //Rectangle Ŭ�������� r4 ���� ����
        r1.display(); //���� r1 ���
        r2.display(); //���� r2 ���
        System.out.println("�� Rectangle ��ü�� �����Ѱ�? " + r1.equals(r2)); //�� ������ ������ �Ǵ��ϴ� ���� ���
        System.out.println(); //�� �� ����
        r3.display(); //���� r3 ���
        r4.display(); //���� r4 ���
        System.out.println("�� Rectangle ��ü�� �����Ѱ�? " + r3.equals(r4)); //�� ������ ������ �Ǵ��ϴ� ���� ���
        System.out.println(); //�� �� ����
        r1.display(); //���� r1 ���
        r4.display(); //���� r4 ���
        System.out.println("�� Rectangle ��ü�� �����Ѱ�? " + r1.equals(r4)); //�� ������ ������ �Ǵ��ϴ� ���� ���
        System.out.println(); //�� �� ����
        Circle c1 =  new Circle(20,30,100); //Circle Ŭ�������� c1 ���� ����
        Circle c2 =  new Circle(10,30,10); //Circle Ŭ�������� c2 ���� ����
        Circle c3 =  new Circle(20,30,100); //Circle Ŭ�������� c3 ���� ����
        c1.display(); //���� c1 ���
        c2.display(); //���� c2 ���
        System.out.println("�� Circle ��ü�� �����Ѱ�?"+ c1.equals(c2)); //�� ������ ������ �Ǵ��ϴ� ���� ���
        System.out.println(); //�� �� ����
        c1.display(); //���� c1 ���
        c3.display(); //���� c3 ���
        System.out.println("�� Circle ��ü�� �����Ѱ�?"+ c1.equals(c3)); //�� ������ ������ �Ǵ��ϴ� ���� ���
        System.out.println(); //�� �� ����
        r1.display(); //���� r1 ���
        c1.display(); //���� c1 ���
        System.out.println("Rectangle ��ü�� Circle ��ü�� �����Ѱ�?"+ r1.equals(c1)); //�� ������ ������ �Ǵ��ϴ� ���� ���
        System.out.println("Circle ��ü�� Rectangle ��ü�� �����Ѱ�?"+ c1.equals(r1)); //�� ������ ������ �Ǵ��ϴ� ���� ���
    }
}