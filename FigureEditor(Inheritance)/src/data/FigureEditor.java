package data;
import java.util.ArrayList; //ArrayList �ҷ�����
public class FigureEditor {
	private ArrayList<Rectangle> Rectangles; //Rectangle Ÿ���� Rectangles �迭 ����
	private int numOfRect; //Rectangles �迭�� ������ �ޱ� ���� ���� numDfRect ����
	private ArrayList<Circle> Circles; //Circle Ÿ���� Circles �迭 ����
	private int numOfCircle; //Circles �迭�� ������ �ޱ� ���� ���� numDfCircle ����
	public FigureEditor() { //�ʱ�ȭ �ϱ� ���� ����Ʈ ������ ����
		Rectangles = new ArrayList<Rectangle>(); //Rectangles �迭 ����
		numOfRect = 0; //���� numOfRect�� 0���� �ʱ�ȭ
		Circles = new ArrayList<Circle>(); //Circles �迭 ����
		numOfCircle = 0; //���� numOfCircle 0���� �ʱ�ȭ
		}
	public void add(Rectangle r) { //��ü r�� ��������� ����� Rectangles �迭�� �߰�
		boolean x = true; //�O���Ǵ� ���� �ִٸ� �������� �ʱ� ����
				if(true) {
					for(int i = 0; i< numOfRect; i++) {	//ó�� �ε������� �迭�� ������ �ε�������
						if((Rectangles.get(i) instanceof Rectangle)) { //���� Rectangles�� i���� ������ Rectangle Ŭ������ �ν��Ͻ����
							Rectangle R = (Rectangle)Rectangles.get(i); //Rectangle ��ü R ���� �� ����
							if(R.equals((Rectangle)r)) { //���� Rectangle ��ü r�� Rectangle��ü R�� ���ٸ�
								x = false; //�������� ����
							}
							}
						}
					}
		if(x) { //Rectangle ��ü r�� ������ �簢���� ���ٸ�
			Rectangles.add(r); //Rectangles �迭�� r �߰�
			numOfRect++; //�迭���� �ϳ� �߰�
			}
		}
	public void add(Circle c) {	//��ü c�� ��������� ����� Circles �迭�� �߰�
		boolean x = true; //�O���Ǵ� ���� �ִٸ� �������� �ʱ� ����
				if(true) {
					for(int i = 0; i< numOfCircle; i++) { //ó�� �ε������� �迭�� ������ �ε�������
						if((Circles.get(i) instanceof Circle)) { //���� Circles�� i���� ������ Circle Ŭ������ �ν��Ͷ��
							Circle C =  (Circle) Circles.get(i); //Circle ��ü C ���� �� ����
							if(C.equals((Circle)c)) { //���� Circle ��ü c�� Circle ��ü C�� ���ٸ�
								x = false; //�������� ����
							}
						}
					}
				}
		if(x) { //Circle ��ü r�� ������ ���� ���ٸ�
			Circles.add(c);	//Circles �迭�� c �߰�
			numOfCircle++; //�迭���� �ϳ� �߰�
		}
	}
	public void display() {
		System.out.println("-------------Rectangles-------------");
		for(int  i = 0;  i<numOfRect;i++) {	//ó�� �ε������� �迭�� ������ �ε�������
			if(Rectangles.get(i) instanceof Rectangle) { //���� Rectangles�� i���� ������ Rectangle Ŭ������ �ν��Ͻ����
				System.out.println((Rectangle)Rectangles.get(i)); //���
				}
			}
		System.out.println("-------------Circle-------------");
		for(int  i = 0;  i<numOfCircle;i++) { //�迭�� ������ŭ �ݺ�
			if(Circles.get(i) instanceof Circle) { //���� Circles�� i���� ������ Circle Ŭ������ �ν��Ͷ��
				System.out.println((Circle)Circles.get(i));	//���
			}
		}
	}
}