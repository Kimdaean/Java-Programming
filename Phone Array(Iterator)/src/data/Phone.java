package data;
public class Phone { //�ٸ� ��Ű�������� ���� ������ �� �ֵ��� public���� ����
	private String name; //�̸��� �ޱ� ���� ���� name ����
	private String tel; //��ȭ��ȣ�� �ޱ� ���� ���� tel ����
	public Phone(String name, String tel) {
		this.name = name; //���� ��ü�� name���� ���� ���� ���� name�� �ֱ�
		this.tel = tel; //���� ��ü�� tel���� ���� ���� ���� tel�� �ֱ�
	}
	public String getName() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return name; //���� name ���� ��ȯ�ϱ� ���� �޼ҵ�
	}
	public String getTel() { //private ��� ������ �ٸ� Ŭ�������� ����ϱ� ���� �޼ҵ�
		return tel; //���� tel ���� ��ȯ�ϱ� ���� �޼ҵ�
	}
}