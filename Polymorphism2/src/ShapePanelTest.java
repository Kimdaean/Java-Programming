public class ShapePanelTest {
	 public static void main(String[] args) {
	        ShapePanel panel = new ShapePanel(); //ShapePanel Ŭ�������� ���� panel ����
	        panel.add(new Rectangle(20,20,3,4)); //Rectangle ��ü �߰�
	        panel.add(new Circle(10,10,10)); //Circle ��ü �߰�
	        panel.display(); //�߰��� ��ü ����ϱ�
	        panel.add(new Rectangle(10,10,2,3)); //Rectangle ��ü �߰�
	        panel.add(new Rectangle(20,20,3,4)); //�̹� �迭�� �߰��� ��ü�� ������ ��ü �߰�
	        panel.display(); //������ ��ü�� �߰����� �����Ƿ� ������ ��ü�� 1���� ��µ�
	        panel.add(new Circle(100,100,2)); //Circle ��ü �߰�
	        panel.add(new Circle(10,10,10)); //�̹� �迭�� �߰��� ��ü�� ������ ��ü �߰�
	        panel.delete(new Circle(10,10,10)); //Circle ��ü ����
	        panel.display(); //������ ��ü�� �߰��� ��ü, �׸��� �ߺ��� ���� �߰� �ȵǾ����� Ȯ���ϱ� ���� ���
	    }
}
