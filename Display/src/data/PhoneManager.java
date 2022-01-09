package data;
import java.util.ArrayList;
public class PhoneManager { //�ٸ� ��Ű������ ���� ������ �� �ֵ��� public���� ����
	private ArrayList<Phone> phoneArray;
	public PhoneManager() {
		phoneArray = new ArrayList<Phone>(); //�Է¹��� Phone�� ��ü�� phoneArray��� ArrayList ����
	}
	public void add(Phone phone) { //�Է¹��� �̸��� ��ȭ��ȣ�� �߰��ϱ�
		phoneArray.add(phone); //phoneArray�� �̸��� ��ȭ��ȭ�� ����
	}
	public ArrayList<Phone> searchByName(String name) { //�Է¹��� �̸��� ���� ��ȭ��ȣ�� ã�� ���� �Լ� ����
		ArrayList<Phone> result = new ArrayList<Phone>(); //���ο� �迭 result ����
		for (int i=0; i<phoneArray.size(); i++) { //ó������ ���ʴ�� phoneArray�� ������ �ε������� Ȯ��
			if (name.equals(phoneArray.get(i).getName())) { //�Է¹��� �̸��� phoneArray�� ������ �̸��� ���ٸ�
				result.add(phoneArray.get(i)); //�迭 result�� �Է¹��� ���� ������ phoneArray �ε����� ����
			}
		}
		if (result.size() == 0) //�Է¹��� ���� phoneArray�� ���ٸ�
			return null; //�ƹ��� ���� ��ȯ���� �ʱ�
		else //phoneArray�� �Է¹��� ���� �ִٸ�
			return result; //result�� ��ȯ
	}
	public void display() { //������� ��� �̸��� ��ȭ��ȣ�� ����ϱ� ���� �Լ� ���� 
		for (int i=0; i<phoneArray.size(); i++) { //ó������ ������ �ε������� ��� �Է¹��� ���� ����������
			System.out.printf("����� �̸��� %s�̰� ��ȭ��ȣ�� %s�Դϴ�.\n",phoneArray.get(i).getName(),phoneArray.get(i).toString()); //����� ��� �̸��� ��ȭ��ȣ�� ���
		}
	}
}