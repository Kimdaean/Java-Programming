package ui;
import data.PhoneManager; //data ��Ű������ PhoneManager Ŭ���� �ҷ�����
import java.util.Scanner; //Scannner �ҷ�����
public class PhoneManagerTest {
	public static void main(String[] args) {
		PhoneManager manager = new PhoneManager(); //PhoneManager Ŭ�������� manager��� ���� ����
		Scanner scanner = new Scanner(System.in); //Scannner ����
		while(true){ 
			System.out.print("�˻��� �̸�>>"); //�̸��� �˻��ޱ� ���� ���� ���
			String name=scanner.next(); //�Է¹��� �̸��� ���� name�� �ֱ�
			if(name.equals("exit")) { //�Է¹��� ���� exit�̸�
				break; //�ݺ��� ����������
			}
			manager.searchByName(name);	//�Է¹��� ������ searchByName�� �Է�
		}
	}
}