public class Account {
	int balance; //�ܾ��� �ޱ� ���� ����
	String id; //���¹�ȣ�� ��� ���� ����
	Account(){
		balance =0;
		id = "NONE";
	}
	Account(int Balance,String ID) { //balance�� ID�� �Է¹޾� ���� ��ü�� balance�� id�� �־��ִ� ������ 
		this.balance = Balance; //���� ��ü�� balance���� ���� ���� ���� balance�� �ֱ�
		this.id = ID; //���� ��ü�� id���� ���� ���� ���� id�� �ֱ�
	}
	void deposit(int amount) { //���� �Ա��ϱ� ���� �Լ� ����
		balance += amount; // �Ա��� �ݾ��� amount�� ���� �ܾ��� balance�� ���ϱ�
		System.out.println(amount+"���� �ԱݵǾ� ���� �ܾ���"+balance+"�Դϴ�."); //�Ա��� �� �ݾ��� ���
	}
	void withdraw(int amount) { //���� ����ϱ� ���� �Լ� ����
		if (balance >= amount) { //�ܾ��� ��ݾ׺��� ũ�ų� ���� ���
			balance -= amount; //�ܾ׿��� ��ݾ� ��ŭ ����
			System.out.println(amount+"���� ��ݵǾ� ���� �ܾ���"+balance+"�Դϴ�."); //����ϰ� ���� �ݾ��� ���
			}else //�� ��(�ܾ��� ��ݾ׺��� ����) ���
				System.out.println("�ܾ��� �����Ͽ� ����� �� �� �����ϴ�."); //����� �� �� �����Ƿ� "�ܾ��� �����մϴ�" ���� ���
	}
}