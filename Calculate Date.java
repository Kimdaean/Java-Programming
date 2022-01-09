import java.util.Scanner; //Scanner 불러옴
public class 일수계싼 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 시작
		int year,month,day,total_day=0; //년도,달,일,총 날짜 변수 설정
		int x=0; //입력된 연도가 윤년이고 주어진 월이 2월이나 1월임을 판단하기 위한 변수 x설정
		int y=0; //윤년 확인 변수
		int Jan =31,Mar=31,Apr=30,May=31,Jun=30,Jul=31,Aug=31,Sept=30,Oct=31,Nov=30; //각종 월 변수(2월의 경우 윤년 확인변수가 이미 있고 12월의 경우 필요없어서 적지 않음)
		boolean z = true; //날짜가 올바른지 확인하기 위한 변수
		do {
			System.out.print("년도를 입력하시오: "); //키보드로부터 년도 입력받기
			year = scanner.nextInt(); //입력받은 값을 변수에 설정
			}while(year<=0); //년도가 0이하일경우 다시 입력받기 설정
		do {
			System.out.print("달을 입력하시오: "); //키보드로부터 월 입력받기
			month = scanner.nextInt();	//입력받은 값을 변수에 설정
			}while((month<=0)||(month>12));	//월이 0이하이거나 12보다 클 경우 다시 입력받기 설정	
		do {
			System.out.print("일을 입력하시오: "); //키보드로부터 일 입력받기
			day = scanner.nextInt(); //입력받은 일수 변수에 설정
			if(year%400 == 0) { //윤년일 경우
				y = 1; //윤년일 경우 y 변수에 1저장
				if(month == 2) { //윤년의 2월의 경우
					if((day>0)&&(day<=29)) { //윤년의 2월은 최대 29일까지 입력 가능
						x=1; //주어진 연도가 윤년이고 주어진 월이 2월
						z = false; //루프문 탈출
						}
					else //올바르지 않을 경우
						continue; //재반복
				}
				else {
					if((day>0)&&(day<=31)) { //올바른 날짜의 경우
						if(month == 1) 
							x=1; //주어진 연도가 윤년이고 주어진 월이 1월
						z = false; //루프문 탈출
					}
					else //올바르지 않을 경우
						continue; //재반복
				}
				}
				else if( (year%4 == 0)&&!(year%100 == 0)) {	//윤년일 경우						
				y = 1;  //윤년일 경우 y 변수에 1저장 
				if(month == 2) { //윤년의 2월의 경우
					if((day>0)&&(day<=29)) { //윤년의 2월의 경우 최대 29일까지 입력 가능
						z = false; //루프문 탈출
						x=1; //주어진 연도가 윤년이고 주어진 월이 2월
						}
					else //올바르지 않을 경우
						continue; //재반복
				}
				else {
					if((day>0)&&(day<=31)) { //올바른 날짜의 경우
						if(month == 1) 
							x=1; //주어진 연도가 윤년이고 주어진 1월
						z = false; //루프문 탈출
					}
					else //올바르지 않을 경우
						continue; //재반복
				}	
			}
			else {
				if((month == 4)||(month == 6)||(month == 9)||(month == 11)) { //4,6,9,11월의 경우
					if((day>0)&&(day<=30)) //4,6,9,11일 경우 최대 일수 30일까지 입력 가능
						z = false; //루프문 탈출
					else //올바르지 않을 경우
						continue; //재반복
				}
				else if(month == 2) { //2월의 경우
					if((day>0)&&(day<=28)) //올바른 날짜의 경우
						z = false; //루프문 탈출
					else //올바르지 않을 경우
						continue; //재반복
				}
				else {
					if((day>0)&&(day<=31)) //올바른 날짜의 경우
						z = false; //루프문 탈출
					else //올바르지 않을 경우
						continue; //재반복
				}		
			}
		}while(z);																
		total_day += (year-1)*365+year/4-year/100+year/400-x+day;
		                    
		//월을 제외한 모든 날짜 계산      
		
		switch(month) {
		case 1:	//1월일 때
			break;
		case 2:	//2월일 때
			total_day += Jan;
			break;
		case 3:	//3월일 때
			total_day += Jan+(28+y);
			break;
		case 4:	//4월일 때
			total_day += Jan+(28+y)+Mar;
			break;
		case 5:	//5월일 때
			total_day += Jan+(28+y)+Mar+Apr;
			break;
		case 6:	//6월일 때
			total_day += Jan+(28+y)+Mar+Apr+May;
			break;
		case 7:	//7월일 때
			total_day += Jan+(28+y)+Mar+Apr+May+Jun;
			break;
		case 8:	//8월일 때
			total_day += Jan+(28+y)+Mar+Apr+May+Jun+Jul;
			break;
		case 9:	//9월일 때
			total_day += Jan+(28+y)+Mar+Apr+May+Jun+Jul+Aug;
			break;
		case 10: //10월일 때
			total_day += Jan+(28+y)+Mar+Apr+May+Jun+Jul+Aug+Sept;
			break;
		case 11: //11월일 때
			total_day += Jan+(28+y)+Mar+Apr+May+Jun+Jul+Aug+Sept+Oct;
			break;
		case 12: //12월일 때
			total_day += Jan+(28+y)+Mar+Apr+May+Jun+Jul+Aug+Sept+Oct+Nov;
			break;		
		}	
		System.out.printf("기준일(1년 1월 1일)부터 %d년 %d월 %d일까지의 총 일수는 %d입니다",year,month,day,total_day);
	}

}
