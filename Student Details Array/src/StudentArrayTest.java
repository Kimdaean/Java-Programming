import java.util.Scanner; //Scanner �ҷ���
public class StudentArrayTest {
	public static void main(String []args) { //�ٸ� Ŭ�������� ȣ���� �� �ִ� ��ü ���� ���� ���� ������ ��ȯ�� ���� ����� ���ڸ� �����ϴ� main �Լ� 
		System.out.print("�л����� �Է��ϼ��� >> "); //�л����� ���� �Է¹ޱ� ���� ���� ���
		Scanner scanner = new Scanner(System.in); //Scanner ����
		int number = scanner.nextInt(); //�Է¹��� �л� ���� ���� number�� �ֱ�
		Student[] students =  new Student[number];	////�Է¹��� �л� �� ��ŭ�� Student ��ü�迭 ����
		for (int i=0; i<number; i++) { //�Է¹��� �л� �� ��ŭ�� �л� �̸��� ������ ���ϱ� ���� for�� ����
			System.out.printf("%d��° �л� �̸��� ������ �Է��Ͻÿ� :",i); //���ʴ�� �л� �̸��� ������ ���ϱ� ���� ���� ���
			String name =  scanner.next();	//�Է� ���� �л��� �̸��� ���� name�� �ֱ�
			int score =  scanner.nextInt();	//�Է� ���� �л��� ������ ���� score�� �ֱ�
			Student student = new Student(name,score); //Student class���� student��� ���� ����
			students[i] = student;	//student ������ ����ִ� ���� student ��ü�迭�� �ֱ�
		}
		System.out.println("�б�"+"            "+"�й�"+"       "+"�̸�"+"     "
		+"����"); //�б�, �й�, �̸�, ������ ���
		for(int i=0;i<number;i++) {
			System.out.printf("%s         %d       %s     %d\n",students[i].School,students[i].Student_code,students[i].name,students[i].score); //�� �迭�� ���� �л����� �б�, �й�, �̸�, ������ ���ʴ�� ��� 
		}
		}
	}