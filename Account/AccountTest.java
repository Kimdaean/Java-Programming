public class AccountTest {
	public static void main (String[] args) {
		Account account1 = new Account(10000,"001"); //Account class���� account1 ��ü ����
		Account account2 = new Account(20000,"002"); //Account class���� account2 ��ü ����
		account1.withdraw(1000); //1000�� ������ 001 ���¿� ����� ī��� ����
		account1.withdraw(3000); //3000�� ��å�� 001 ���¿� ����� ī��� ����
		account1.withdraw(4000); //���ɽð��� �Ǿ� 4000�� �ܹ��Ÿ� 001 ���¿� ����� ī��� ����
		account1.withdraw(15000); //������ �ĺ��� ����� �ڵ���ü �Ǵ� �� ������ ���� ��� ������ �ȵ�
		account2.withdraw(13000); //002 ���¿��� ���� ������
		account1.deposit(13000); //002 ���¿��� ���� ���� 001 ���¿� �Ա�
		account1.withdraw(13000); //�� �� �ĺ��� ����� 001 ���¿��� ��ü��
	}
}