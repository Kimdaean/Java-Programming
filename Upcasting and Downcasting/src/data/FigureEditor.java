package data;
import java.util.ArrayList;	//ArrayList �ҷ�����
public class FigureEditor {
	private ArrayList<Shape> Shapes; //Shape Ÿ���� Shapes�迭 ����
	private int numOfShape;	//Shapes �迭�� ������ �ޱ� ���� numOfShape ���� ����
	public FigureEditor() { //�ʱ�ȭ �ϱ� ���� ����Ʈ ������ ����
		Shapes = new ArrayList<Shape>(); //Shapes �迭 �ʱ�ȭ
		numOfShape = 0;	//Shapes �迭�� ������ 0���� �ʱ�ȭ
	}
	public void add(Shape s) { //��ü s�� ��������� ����� Shapes �迭�� �߰�
		boolean x = true; //�O���Ǵ� ���� �ִٸ� �����ϱ� ����
		if(s instanceof Rectangle) { //��ü s�� Rectangle Ŭ������ �ν��Ͻ����
			if(true) {
				for(int i = 0; i< numOfShape; i++) { //ó�� �ε������� ������ �迭�� �ε�������
					if((Shapes.get(i) instanceof Rectangle)) { //���� Shapes�� i���� ������ Rectangle Ŭ������ �ν��Ͻ����
						Rectangle R =  (Rectangle) Shapes.get(i); //Rectangle ��ü R ���� �� ����
						if(R.equals((Rectangle)s)) { //���� Shape ��ü s�� Rectangle ��ü R�� ���ٸ�
							x = false;	//�������� ����
						}
					}
				}
			}
		}
		if(s instanceof Circle) { //��ü s�� Circle Ŭ������ �ν��Ͻ����
			if(true) {
				for(int i = 0; i< numOfShape; i++) { //ó�� �ε������� ������ �迭�� �ε�������
					if((Shapes.get(i) instanceof Circle)) {	//���� Shapes�� i���� ������ Circle Ŭ������ �ν��Ͻ����
						Circle C =  (Circle)Shapes.get(i); //Circle ��ü C ���� �� ����
						if(C.equals((Circle)s)) { //���� Shape ��ü s�� Circle ��ü C�� ���ٸ�
							x = false;	//�������� ����
						}
					}
				}
			}
		}
		if(x) { //Shape ��ü s�� ������ �簢���� ���� ���ٸ�
			Shapes.add(s); //Shapes �迭�� ��ü s�� �߰�
			numOfShape++; //�迭���� �ϳ� �߰�
		}
	}
	public void display() {
		System.out.println("-------------Shapes-------------");
		for(int  i = 0;  i<numOfShape;i++) { //ó�� �ε������� ������ �迭�� �ε�������
			if(Shapes.get(i) instanceof Rectangle) //���� Shapes�� i���� ������ Rectangle Ŭ������ �ν��Ͻ����
				System.out.println((Rectangle)Shapes.get(i)); //���
			if(Shapes.get(i) instanceof Circle)	//���� Shapes�� i���� ������ Circle Ŭ������ �ν��Ͻ����	
				System.out.println((Circle)Shapes.get(i)); //���
					}
				}
		}