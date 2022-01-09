import java.util.Scanner; //Scanner 불러옴
public class 년도날짜출력 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 시작
		int year,month,day; //년도,달,일 변수 설정
		boolean x=true; // 참,거짓을 판단하기 위한 변수
		do {
		System.out.print("년도를 입력하세요: "); //키보드로부터 년도 입력값 받기
		year = scanner.nextInt();} //입력받은 값을 변수에 넣기
		while(year<=0); //입력 받은 값이 음수이거나 0일경우 다시 입력받기
		do {
			System.out.print("달을 입력하시오: "); //키보드로부터 달 입력값 받기
			month = scanner.nextInt();} //입력받은 값을 변수에 넣기
		while((month<=0)||(month>12)); //입력 받은 값이 0보다 작거나 같거나 또는 12보다 크면 다시 입력받기
		do {
			System.out.print("일을 입력하시오: "); //키보드로부터 일 입력값 받기
			day = scanner.nextInt(); // 입력받은 값을 변수에 넣기
			if(year%400 == 0) { //윤년일 경유
				if((month == 4)||(month == 6)||(month == 9)||(month == 11)) { //최대 일수가 30일인 달들 설정
					if((day>0)&&(day<=30)) //일수를 최대 30일까지
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}
				else if(month == 2) { //윤년의 2월인 경우
					if((day>0)&&(day<=29)) //윤년의 2월은 29일까지 있음		
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
						
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}
				else {
					if((day>0)&&(day<=31)) //올바른 날짜를 입력받았을 경우
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}	
			}
			else if( (year%4 == 0)&&!(year%100 == 0)) {	//윤년일 경우							
				if((month == 4)||(month == 6)||(month == 9)||(month == 11)) { //최대 일수가 30일인 달을 설정
					if((day>0)&&(day<=30)) //일수를 최대 30일까지
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}
				else if(month == 2) { //윤년의 2월인 경우
					if((day>0)&&(day<=29)) //윤년의 2월은 29일까지 있음
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출		
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}
				else {
					if((day>0)&&(day<=31)) //올바른 날짜를 입력받았을 경우
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}	
			}
			else {
				if((month == 4)||(month == 6)||(month == 9)||(month == 11)) { //최대 일수가 30일인 달을 설정
					if((day>0)&&(day<=30)) //일수를 최대 30일까지
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}
				else if(month == 2) { 
					if((day>0)&&(day<=28)) //평년 2월은 최대 일수가 28일
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else  //잘못된 값을 입력받았을 경우
						continue; //재반복
				}
				else {
					if((day>0)&&(day<=31)) //올바른 날짜를 입력받았을 경우
						x = false; //올바른 값을 입력 받을 경우 루프문 탈출
					else //잘못된 값을 입력받았을 경우
						continue; //재반복
				}		
			}
		}while(x);
		System.out.printf("입력하신 날짜는 %d년 %d월 %d일입니다",year,month,day);
	}
}
		
