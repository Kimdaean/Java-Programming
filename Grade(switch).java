import java.util.Scanner;  //Scanner를 불러옴
public class 성적발표 {
	public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in); // Scanner 시작
        System.out.print("성적(0~100점)를 입력하세요 : "); // 키보드로부터 성적을 입력받습니다.
        grade = scanner.nextInt();
        int x = grade/10; // 학점을 구하기 위해 성적에서 10으로 나눈 몫을 구합니다.
        switch(x) {
        case 10: // 몫이 10이면 성적이 100점이으로 A학점입니다.
        	System.out.print("A학점 입니다.");
            break;
        case 9:  // 몫이 9이면 성적이 90이상
        	System.out.print("A학점 입니다.");
            break;
        case 8:  // 몫이 8이면 성적이 80이상 90미만
        	System.out.print("B학점 입니다.");
            break;
        case 7: // 몫이 7이면 성적이 70이상 80미만
        	System.out.print("C학점 입니다.");
            break;
        case 6: // 몫이 6이면 성적이 60이상 70미만
        	System.out.print("D학점 입니다.");
            break;
        default: // 그 외 성적들은 전부 60미만
        	System.out.print("F학점 입니다.");
            break;	
        }
        }

}
