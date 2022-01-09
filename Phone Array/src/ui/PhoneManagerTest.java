package ui;
import java.util.Scanner; //Scanner �ҷ�����
import data.Phone; //data ��Ű���� Phone Ŭ���� �ҷ�����
import data.PhoneManager; //data ��Ű���� PhoneManager Ŭ���� �ҷ�����
public class PhoneManagerTest {
	public static void main(String Args[]) {
		System.out.print("�ο��� >>"); //�ο����� �ޱ� ���� ���� ���
		Scanner scanner = new Scanner(System.in); //Scanner ����
		int number = scanner.nextInt(); //Ű����κ��� �Է¹��� �ο����� ���� number�� �ֱ�
		PhoneManager manager = new PhoneManager(); //PhoneManager Ŭ�������� manager��� ���� ����
		for (int i=0; i<number; i++) { //�Է¹��� �ο�����ŭ �ݺ�
			System.out.print("�̸��� ��ȭ��ȣ >>"); //�̸��� ��ȭ��ȣ�� �ޱ� ���� ���� ���
			String name = scanner.next(); //Ű����κ��� �Է� ���� �̸��� ���� name���� ����
			String tel = scanner.next(); //Ű����κ��� �Է� ���� ��ȭ��ȣ�� ���� tel�� ����
			Phone phone = new Phone(name,tel); //Phone Ŭ�������� phone�̶�� ���� ����
			manager.add(phone); //���� phone���� ���� manager�� �ֱ�
		}
		System.out.println("����Ǿ����ϴ�.."); //Ű����κ��� �Է¹��� ���� �����ߴٴ� ���� ���
		while(true) { //���ѹݺ�
			System.out.print("�˻��� �̸��� �Է��ϼ��� >>"); //�˻��� �̸��� �ޱ� ���� ���� ���
			String name = scanner.next(); //Ű����κ��� �Է� ���� �̸��� ���� name�� �ֱ�
			if (name.equals("exit")) //�Է¹��� ���� "exit"�̶��
				break; //�ݺ��� ����������
			Phone result = manager.searchByname(name); //���� manager���� ã�� ���� ���� result�� �ֱ�
			if (result != null) { //Ű����κ��� �Է¹��� ���� result�ȿ� �ִٸ�
				System.out.printf("%s�� ��ȣ�� %s�Դϴ�.\n", name, result.getTel()); //�̸��� �Բ� ��ȣ�� ���
			}else //Ű����κ��� �Է¹��� ���� result�ȿ� ���ٸ�
				System.out.printf("%s�� ��ȣ�� �����ϴ�.\n",name); //�Է� ���� ���� ���ٴ� ���� ���
			}
		}
	}
