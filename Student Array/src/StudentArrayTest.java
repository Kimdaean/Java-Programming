import java.util.Scanner; //Scanner �ҷ���
public class StudentArrayTest {
	public static void main(String[] args) {
		System.out.print("�л����� �Է��ϼ��� >> "); //�л����� �Է¹ޱ� ���� ���� ���
		Scanner scanner = new Scanner(System.in); //Scanner ����
		int number = scanner.nextInt(); //Ű����κ��� �Է¹��� �л����� ���� number�� �ֱ�
		Student[] students = new Student[number]; //�Է¹��� �л� �� ��ŭ�� Student ��ü�迭 ����
		for (int i=0; i<number;i++) { //�Է¹��� �л� �� ��ŭ�� �л� �̸��� ������ ���ϱ� ���� for�� ����
			System.out.print(i+"���� �л� �̸��� ������ �Է��Ͻÿ� : "); //���ʴ�� �л� �̸��� ������ ���ϱ� ���� ���� ���
			String name = scanner.next(); //�Է� ���� �л��� �̸��� ���� name�� �ֱ�
			int score = scanner.nextInt(); //�Է� ���� �л��� ������ ���� score�� �ֱ� 
			Student student = new Student(name,score); //Student class���� student��� ���� ����
			students[i] = student; //student ������ ����ִ� ���� student ��ü�迭�� �ֱ�
		}
		int sum=0; //����� ���ϱ� ���� �л����� ���� ��� ���� ���� sum�� ����
		for (int i=0; i<number; i++) { //�Է� ���� �л��� ����ŭ ���ϱ� ���� for�� ����
			sum += students[i].score; //�Է¹��� �л����� ���� ���ϱ�
		}
		System.out.printf("%d�� �л��� ��ռ����� %f�Դϴ�.", number,
				(double)sum/number); //�Է¹��� �л��� ���� ��ռ����� ����ϱ� ���� ���� ���
	}
}