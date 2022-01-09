public class DiceGame {
	Dice dice1; //���۷��� ���� dice1 ����
	Dice dice2; //���۷��� ���� dice2 ����
	public DiceGame() {
		dice1 = new Dice(); //Dice class���� dice1�̶�� ��ü�� ����
		dice2 = new Dice(); //Dice class���� dice2�̶�� ��ü�� ����
		}
	void play() { //�ֻ��� ������ �ϱ� ���� �Լ�
		int diceValue1 = dice1.roll(); //dice1�� ������ ���� ���� diceValue1�� �ֱ�
		int diceValue2 = dice2.roll(); //dice2�� ������ ���� ���� diceValue2�� �ֱ�
		dice1.print(); //dice1�� ������ ���� ���� ���
		dice2.print(); //dice2�� ������ ���� ���� ��� 
		judge(diceValue1,diceValue2); //diceValue1�� diceValue2�� ���� �Ǵ�
	}
	void judge(int value1,int value2) { //�޴� ���� �Ǵ��ϱ� ���� judge�Լ�
		if (value1+value2>=10) { //���� ������ ���� 10 �̻��̸� 
			System.out.println("�ֻ��������� �̰���ϴ�!!"); //�¸��� ���� ���
		}
		else //�� ��(10 ����)�� ���
			System.out.println("�ֻ��������� �����ϴ�."); //�й��� ���� ���
	}

}