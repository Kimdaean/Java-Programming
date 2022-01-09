import java.util.Scanner; //Scanner 불러옴
public class StudentArrayTest {
	public static void main(String[] args) {
		System.out.print("학생수를 입력하세요 >> "); //학생수를 입력받기 위한 문구 출력
		Scanner scanner = new Scanner(System.in); //Scanner 시작
		int number = scanner.nextInt(); //키보드로부터 입력받은 학생수를 변수 number에 넣기
		Student[] students = new Student[number]; //입력받은 학생 수 만큼의 Student 객체배열 생성
		for (int i=0; i<number;i++) { //입력받은 학생 수 만큼의 학생 이름과 성적을 구하기 위한 for문 설정
			System.out.print(i+"번쩨 학생 이름과 성적을 입력하시오 : "); //차례대로 학생 이름과 성적을 구하기 위한 문구 출력
			String name = scanner.next(); //입력 받은 학생의 이름을 변수 name에 넣기
			int score = scanner.nextInt(); //입력 받은 학생의 성적을 변수 score에 넣기 
			Student student = new Student(name,score); //Student class에서 student라는 변수 생성
			students[i] = student; //student 변수에 들어있는 값을 student 객체배열에 넣기
		}
		int sum=0; //평균을 구하기 위해 학생들의 합을 얻기 위한 변수 sum을 설정
		for (int i=0; i<number; i++) { //입력 받은 학생의 수만큼 더하기 위한 for문 설정
			sum += students[i].score; //입력받은 학생들의 값을 더하기
		}
		System.out.printf("%d명 학생의 평균성적은 %f입니다.", number,
				(double)sum/number); //입력받은 학생의 수와 평균성적을 출력하기 위한 문구 출력
	}
}