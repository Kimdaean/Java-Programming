public class Dice {
	int faceValue; //변수 설정
	int roll() { //주사위를 돌려서 나오는 값을 돌려받기 위한 변수
		faceValue = (int)(Math.random()*6)+1; //주사위를 돌려서 1부터 6까지에 수 중 무작위로 한 숫자를 얻음
		return faceValue; // 얻은 숫자를 변수 faceValue에 돌려받기
	}
	void print() { //얻은 숫자를 출력하기 위한 함수 설정
		System.out.print("faceValue="+faceValue); //주사위를 돌려서 나오는 값을 출력
		}
}
