public class Student {
	String name;	//�л����� �̸��� �Է¹ޱ� ���� ���� name ����
	int score;	//�л����� ������ �Է¹ޱ� ���� ���� score ����
	static int count=0;	//��ü �ν��Ͻ��� ���� count ������ �����ϱ� ���� static�� ���
	String School;  	//�б� �̸��� �ޱ� ���� ���� School ����
	int Student_code=0;	//�й��� �Է¹ޱ� ���� ���� Student_code ����
	public Student(String name, int score) { //�л����� �̸��� ������ �ް� �ʱ�ȭ�ϱ� ���� ������ ����
		this.name = name; //���� ��ü�� name���� ���� ���� ���� name�� �ֱ�
		this.score = score; //���� ��ü�� score���� ���� ���� ���� score�� �ֱ�
		School = "�Ѽ����б�";	//�б��̸��� �л��� ���� �����Ǵ� �����μ� '�Ѽ����б�'�� �ʱ�ȭ
		Student_code = count; //count ���� �й����� �ʱ�ȭ
		count++; //��ü�� ������ ������ �ϳ��� ����
	}
}