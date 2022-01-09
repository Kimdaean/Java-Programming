public class 주사위게임 {
	Dice dice1;
	Dice dice2;
	public Dicegame() {
		dice1 = new Dice();
		dice2 = new Dice();
	}
	void play() {
		int Dicevalue1 = dice1.roll();
		int Dicevalue2 = dice2.roll();
		dice1.print();
		dice2.print();
		judge(Dicevalue1,Dicevalue2);
	}
	void judge(int value1, int value2) {
		if (value1+value2>=10) {
			System.out.println("주사위 게임을 이겼습니다!!");
		}
		else
			System.out.println("주사위 게임을 졌습니다");
	}
}
