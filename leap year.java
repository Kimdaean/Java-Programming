import java.util.Scanner; //Scanner 불러옴
public class 윤년검사 { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner 시작
			System.out.print("연도를 입력하세요 : "); //키보드로부터 연도 입력받기
			int year = scanner.nextInt(); //입력받은 값을 변수에 넣기
			if (year%400==0 || (year%4==0 && year%100!=0)) //입력받는 값 중 윤년인 경우
				System.out.printf("입력한 연도는 %d이고, 윤년입니다.",year);
			else //윤년을 제외한 나머지
				System.out.printf("입력한 연도는 %d이고, 윤년이 아닙니다.", year);
		}
	}
