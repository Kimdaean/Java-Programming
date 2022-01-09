import java.util.Scanner;							//Scanner 를 불러옴
public class 성적발표2 {
	public static void main(String  [] args) {
		Scanner scanner = new Scanner(System.in);	//Scanner 시작
		System.out.print("성적(0~100점)를 입력하시오: "); //키보드로부터 성적을 입력받기
		int grades = scanner.nextInt();				//입력받은 성적을 변수에 넣기
		if(grades>=90) {							//성적이 90점이상일 경우
			System.out.print("A학점 입니다");}
		if(grades>=80) {						//성적이 90점미만 80점이상일 경우
			System.out.print("B학점 입니다");}
		if(grades>=70) {						//성적이 80점미만 70점이상일 경우
			System.out.print("C학점 입니다");}
		if(grades>=60) {						//성적이 70점미만 60점이상일 경우
			System.out.print("D학점 입니다");}
		else  {										//성적이 그 외 점수일 경우
			System.out.print("F학점 입니다");}
		}
}
