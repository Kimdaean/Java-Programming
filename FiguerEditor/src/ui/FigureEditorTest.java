package ui;
import data.Circle;
import data.FigureEditor;
import data.Rectangle;
public class FigureEditorTest {
	public static void main(String[] args) {
		FigureEditor editor = new FigureEditor(); //FigureEditor Ŭ�������� editor ���� ����
		Rectangle r1 = new Rectangle(1,2,3,4); //Rectangle Ŭ�������� r1 ���� ����
		Rectangle r2 = new Rectangle(2,3,4,5); //Rectangle Ŭ�������� r2 ���� ����
		Circle c1 = new Circle(3,4,5); //Circle Ŭ�������� c1 ���� ����
		Circle c2 = new Circle(4,5,6); //Circle Ŭ�������� c2 ���� ����
		editor.add(r1);	//editor�� r1 �����ϱ�
		editor.add(r2);	//editor�� r2 �����ϱ�
		editor.add(c1);	//editor�� c1 �����ϱ�
		editor.add(c2);	//editor�� c2 �����ϱ�
		editor.display(); //editor�� ����� ��� �� ���
		Rectangle r3 = new Rectangle(2,3,4,5); //Rectangle Ŭ�������� r2�� ���� ���� ���� ���� r3 ����
		editor.add(r3);	//editor�� r3���� �ֱ�
		editor.display(); //�ߺ��� ���� �߰��Ǿ����� Ȯ���ϱ� ���� ���
		r3.setX(1);	//���� r3�� x��ǥ���� 1�� ����
		editor.add(r3);	//editor�� r3���� �ֱ�
		Circle c3 = new Circle(4,5,6); //Circle Ŭ�������� c1�� ���� ���� ���� c3 ����
		editor.add(c3);	//editor�� c3���� �ֱ�
		editor.display(); //���ο� ���� �߰� �ǰ� �ߺ��� ���� �߰����� �ʾҴ��� Ȯ���ϱ� ���� ���
	}
}