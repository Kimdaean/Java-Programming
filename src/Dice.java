public class Dice {
	int faceValue; //���� ����
	int roll() { //�ֻ����� ������ ������ ���� �����ޱ� ���� ����
		faceValue = (int)(Math.random()*6)+1; //�ֻ����� ������ 1���� 6������ �� �� �������� �� ���ڸ� ����
		return faceValue; // ���� ���ڸ� ���� faceValue�� �����ޱ�
	}
	void print() { //���� ���ڸ� ����ϱ� ���� �Լ� ����
		System.out.print("faceValue="+faceValue); //�ֻ����� ������ ������ ���� ���
		}
}
