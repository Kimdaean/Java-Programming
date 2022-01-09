public class 주사위던지기 {
	public static void main(String[] args) {
		int dice1 = rolldice(); //rollDice에서 나오는 값을 변수에 널기
		int dice2 = rolldice(); //rollDice에서 나오는 값을 변수에 널기
		printDice(dice1,dice2); //rollDice에서 받은 dice1값과 dice2값을 출력하기 위한 변수
		judge(dice1,dice2); 
	}
	static int rolldice() { //rolldice에 1부터 6사이에 숫자 넣기
		return(int)(Math.random()*6)+1; // 1부터 6사이에 무작위 숫자
		}
	static void printDice(int value1, int value2) { //value1에 dice1값을, value2에 dice2값을 넣음
		System.out.printf("dice1 = %d, dice2= %d\n",value1,value2); //dice1값과 dice2값을 출력
	}
	static void judge(int value1, int value2) { //dice1(=value1)값과 dice2(=value2)값에 조건을 부여하기 위한 함수
		if (value1+value2>=10) { //두 주사위의 값이 10이상이면
			System.out.println("주사위 게임을 이겼습니다!!"); //승리의 문구를 출력
			}
		else //그 외(10 이하)이면
			System.out.println("주사위 게임을 졌습니다."); //패배의 문구를 출력
	}
}
