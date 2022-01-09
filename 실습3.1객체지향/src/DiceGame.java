public class DiceGame {
	Dice dice1; //레퍼런스 변수 dice1 선언
	Dice dice2; //레퍼런스 변수 dice2 선언
	public DiceGame() {
		dice1 = new Dice(); //Dice class에서 dice1이라는 객체를 생성
		dice2 = new Dice(); //Dice class에서 dice2이라는 객체를 생성
		}
	void play() { //주사위 게임을 하기 위한 함수
		int diceValue1 = dice1.roll(); //dice1을 돌려서 나온 값을 diceValue1에 넣기
		int diceValue2 = dice2.roll(); //dice2를 돌려서 나온 값을 diceValue2에 넣기
		dice1.print(); //dice1을 돌려서 나온 값을 출력
		dice2.print(); //dice2를 돌려서 나온 값을 출력 
		judge(diceValue1,diceValue2); //diceValue1과 diceValue2의 값을 판단
	}
	void judge(int value1,int value2) { //받는 값을 판단하기 위한 judge함수
		if (value1+value2>=10) { //받은 값들의 합이 10 이상이면 
			System.out.println("주사위게임을 이겼습니다!!"); //승리의 문구 출력
		}
		else //그 외(10 이하)의 경우
			System.out.println("주사위게임을 졌습니다."); //패배의 문구 출력
	}

}