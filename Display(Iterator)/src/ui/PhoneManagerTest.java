package ui;
import java.util.Iterator; //Iterator �ҷ�����
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
			if (name.equals("exit")) //�Է¹��� ���� "exit"�̶��
				break; //�ݺ��� ����������
			Iterator<Phone> result = manager.searchByName(name); //���� manager�� ���� result �迭�� �ֱ�
			if (result != null) { //result�� �Է¹��� ���� ���� ���� ���� �ε����� �ִٸ�
			while (result.hasNext()) { //���� �ε����� �����Ҷ����� �ݺ�
				Phone phone = result.next(); //���� �ε����� �Ѿ��
				System.out.printf("%s�� ��ȣ�� %s�Դϴ�.\n",name, phone.toString()); //���� manger���� ã�� ���� �迭 result�� �ֱ�
			}
			}else //�˻��� �̸��� result�� ���� ���
				System.out.printf("%s�� ��ȣ�� �����ϴ�.\n",name); //�˻��� �̸��� ���ٴ� ���� ���
	}
}
}
