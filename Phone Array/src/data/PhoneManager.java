package data;
public class PhoneManager { //�ٸ� ��Ű������ ���� ������ �� �ֵ��� public���� ����
	private Phone[] phoneArray; //phoneArray��� �迭 ����
	private int count; //phoneArray �迭�� ���� ���ʴ�� �ֱ� ���� ���� count ����
	private final int MAX = 100; //phoneArray�� ũ�⸦ �����ϱ� ���� ���� MAX�� 100���� �ʱ�ȭ
	public PhoneManager() {
		count = 0; //���� count�� 0���� �ʱ�ȭ
		phoneArray = new Phone[MAX]; //phoneArray�� ũ�� ����
	}
	public void add(Phone phone) { //�Է¹��� �̸��� ����ó�� �߰��ϱ�
		phoneArray[count] = phone; //phone���� ���� ���� phoneArray �迭�� �ֱ�
		count++; //�迭�� ó������ �����ؼ� ���ʴ�� �ֱ�
	}
	public Phone searchByname(String name) { //����ó���� �̸����� ã�� ���� �Լ� ����
		for (int i=0; i<count; i++) { //�迭�� ũ�⸸ŭ ����ó ã��
			if (name.equals(phoneArray[i].getName())) { //���� ��ü name���� ���� ���� phoneArray �迭�� �ִ� ���� �� ���� ���� �ִٸ�
				return phoneArray[i]; //�� ���� ���� ��ȯ�ޱ�
			}
		}
		return null; //���� ���� ������ �ƹ��� ���� �������� �ʱ�
	}
 
}
