package data;
import java.util.ArrayList; //Iterator �ҷ�����
import java.util.Iterator;
public class PhoneManager { //�ٸ� ��Ű������ ���� ������ �� �ֵ��� public���� ����
	private ArrayList<Phone> phoneArray; //phoneArray�� PhoneManager Ŭ���������� ����� �� �ְ� ����
	public PhoneManager() {
		phoneArray = new ArrayList<Phone>(); //�Է¹��� Phone�� �ٷ�� �÷��� phoneArray�÷��� ����
	}
	public void add(Phone phone) { //�Է¹��� �̸��� ��ȭ��ȣ�� �߰��ϱ�
		phoneArray.add(phone); //phoneArray�� �̸��� ��ȭ��ȭ�� ����
	}
	public Iterator<Phone> searchByName(String name) { //�Է¹��� �̸��� ���� ��ȭ��ȣ�� ã�� ���� �Լ� ����
		ArrayList<Phone> result = new ArrayList<Phone>(); //���ο� �迭 result ����
		Iterator<Phone> phoneIterator = phoneArray.iterator(); //phoneArray�迭�� iterator�� ����
		while (phoneIterator.hasNext()) { //���� �ε����� �����Ҷ����� �ݺ�
			Phone phone = phoneIterator.next(); //���� �ε����� �Ѿ��
			result.add(phone); //result �迭�� �̸��� ����ó ����
		}
		if (result.size() == 0) //�Է¹��� ���� phoneArray�� ���ٸ�
			return null; //�ƹ��� ���� ��ȯ���� �ʱ�
		else //phoneArray�� �Է¹��� ���� �ִٸ�
			return result.iterator(); //result�� ��ȯ
	}
	public void display() { //������� ��� �̸��� ��ȭ��ȣ�� ����ϱ� ���� �Լ� ���� 
		for (int i=0; i<phoneArray.size(); i++) { //ó������ ������ �ε�������
			System.out.printf("����� �̸��� %s�̰� ��ȭ��ȣ�� %s�Դϴ�.\n",phoneArray.get(i).getName(),phoneArray.get(i).toString()); //����� ��� �̸��� ��ȭ��ȣ�� ���
		}
	}
}
