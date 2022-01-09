import java.util.Scanner; //Scanner 불러옴
public class intArrayTest {
	public static void main(String[] args) {
		int intArray[] = new int[10]; //크기 10개의 int 배열 생성
		System.out.print("10개의 정수를 입력하세요 >> "); //10개의 정수를 입력받기 위한 문구 출력
		Scanner scanner = new Scanner(System.in); //Scanner 시작
		for (int i=0; i<intArray.length; i++) { //10번의 정수를 입력받기 위한 for문 설정
			int input = scanner.nextInt(); //입력 받은 정수를 변수 input에 넣기
			intArray[i] = input; //입력 받은 정수를 차례대로 int 배열에 저장
		}
		for (int i=0; i<10; i++) { //입력받은 10개의 정수가 3의 배수인지 확인하기 위한 for문 설정
			if (intArray[i]%3 == 0) //배열의 입력된 값이 3의 배수일 경우
				System.out.println(intArray[i]); //배열의 값을 출력
		}
	}

}
