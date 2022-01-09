package ui;
import java.util.ArrayList;
import java.util.Scanner; //Scanner �ҷ�����
import data.Phone; //data ��Ű���� Phone Ŭ���� �ҷ�����
import data.PhoneManager; //data ��Ű���� PhoneManager Ŭ���� �ҷ�����
public class PhoneManagerTest {
	public static void main(String Args[]) {
		System.out.print("�ο��� >>"); //�ο����� �ޱ� ���� ���� ���
		Scanner scanner = new Scanner(System.in); //Scanner ����
		int number = scanner.nextInt(); //Ű����κ��� �Է� ���� �ο����� ���� number�� �ֱ�
		PhoneManager manager = new PhoneManager(); //PhoneManager Ŭ�������� manager��� ���� ����
		for (int i=0; i<number; i++) { //�Է� ���� �ο�����ŭ �ݺ�
			System.out.print("�̸��� ��ȭ��ȣ >>"); //�̸��� ��ȭ��ȣ�� �ޱ� ���� ���� ���
			String name = scanner.next(); //Ű����κ��� �Է� ���� �̸��� ���� name���� ����
			String tel = scanner.next(); //Ű����κ��� �Է� ���� ��ȭ��ȣ�� ���� tel�� ����
			Phone phone = new Phone(name,tel); //Phone Ŭ�������� phone�̶�� ���� ����
			manager.add(phone); //���� phone���� ���� manager�� �ֱ�
		}
		System.out.println("����Ǿ����ϴ�.."); //Ű����κ��� �Է¹��� ���� �����ߴٴ� ���� ���
		manager.display(); //����� ��� �̸��� ��ȭ��ȣ�� ���
		while(true) { //���ѹݺ�
			System.out.print("�˻��� �̸��� �Է��ϼ��� >>"); //�˻��� �̸��� �ޱ� ���� ���� ���
			String name = scanner.next(); //Ű����κ��� �Է� ���� �̸��� ���� name�� �ֱ�
			if (name.equals("exit")) //�Է� ���� ���� "exit"�̶��
				break; //�ݺ��� ����������
			ArrayList<Phone> result = manager.searchByName(name); //���� manger���� ã�� ���� �迭 result�� �ֱ�
			if (result != null) { //result�� �Է� ���� ���� ���� ���� ���� �ε����� �ִٸ�
				for(int i=0; i<result.size(); i++) //ó������ ���ʴ�� result �ε��� Ȯ��
					System.out.printf("%s�� ��ȣ�� %s�Դϴ�.\n",name, result.toString()); //����� �̸��� ��ȭ��ȣ�� ���
			}else //���� �Է� ���� ���� ���� ���� ���� �ε����� ���ٸ�
				System.out.printf("%s�� ��ȣ�� �����ϴ�.\n",name); //�˻��� �̸��� ���ٴ� ���� ���
		}
	}
}
