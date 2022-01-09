public class ShapePanel {
	private Shape ArrayShape[]; //ArrayShape �迭 ����
	private int numOfShape; //��ü �迭�� ����� ��ü�� ���� ��Ÿ���� ���� ���� numOfShape ����
	private int count; //�迭�� ������ �ޱ� ���� ���� x ����
	public ShapePanel() {
		ArrayShape = new Shape[100]; //ũ�� 100�� �迭�� ArrayShape �ʱ�ȭ
		numOfShape = 0; //���� numOfShape�� 0���� �ʱ�ȭ
		count = 0;
	}
	public void add(Shape s) {
		for (int i = 0; i<numOfShape; i++) { //ó�� �ε������� numOfShape��ŭ �ݺ�
			if(ArrayShape[i].equals(s)) { //�迭�� �ε��� ���� �Ķ���ͷ� �Էµ� Shape ��ü s�� ���� ���ٸ�
				return; //�߰����� �ʱ�
				}
			}
		ArrayShape[numOfShape++] = s; //���� �ڸ��� �ϳ��� �߰��ϰ� numOfShape�ϳ� �߰�
		}
	public void delete(Shape s) {
		for (int i = 0; i<numOfShape; i++) { //ó�� �ε������� numOfShape��ŭ �ݺ�
			if(ArrayShape[i].equals(s)) { //�迭�� ��ü�� �Ķ���ͷ� �Էµ� Shape ��ü s�� ���� ���ٸ�
				count = i; //���� ���� �迭�� ������ ���� x�� ����
				ArrayShape[i] = null; //������ ���� �����
				numOfShape -= 1; //�迭�� ����� ��ü�� �� �ϳ� ����
				return;
			}
		}
		for(;count<numOfShape;count++) { //������ ��ü���� �迭�� ����������
			ArrayShape[count] = ArrayShape[count+1]; //������ ��ġ �ٷ� �������� Shape ��ü �迭�� ������ ������ �̵�.
	}
	}
	public void display() { //ArrayShpae �迭�� ����ϱ� ���� �Լ� ����
		System.out.println("********** ShapePanel�� ��ϵ� ��� ���� **********"); 
		for (int i = 0; i<numOfShape; i++) { //ó�� �ε������� numOfShape��ŭ �ݺ�
			if(ArrayShape[i] != null) { //�ε��� ���� �����ϸ�
				System.out.println(ArrayShape[i]); //�� �ε��� ���� ����ϱ�
			}
		}
	}
}