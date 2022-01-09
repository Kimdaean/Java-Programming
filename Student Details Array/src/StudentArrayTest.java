import java.util.Scanner; //Scanner 불러옴
public class StudentArrayTest {
	public static void main(String []args) { //다른 클래스에서 호출할 수 있는 객체 생성 없이 접근 가능한 반환값 없는 명령행 인자를 포함하는 main 함수 
		System.out.print("학생수를 입력하세요 >> "); //학생들의 수를 입력받기 위한 문구 출력
		Scanner scanner = new Scanner(System.in); //Scanner 시작
		int number = scanner.nextInt(); //입력받은 학생 수를 변수 number에 넣기
		Student[] students =  new Student[number];	////입력받은 학생 수 만큼의 Student 객체배열 생성
		for (int i=0; i<number; i++) { //입력받은 학생 수 만큼의 학생 이름과 성적을 구하기 위한 for문 설정
			System.out.printf("%d번째 학생 이름과 성적을 입력하시오 :",i); //차례대로 학생 이름과 성적을 구하기 위한 문구 출력
			String name =  scanner.next();	//입력 받은 학생의 이름을 변수 name에 넣기
			int score =  scanner.nextInt();	//입력 받은 학생의 성적을 변수 score에 넣기
			Student student = new Student(name,score); //Student class에서 student라는 변수 생성
			students[i] = student;	//student 변수에 들어있는 값을 student 객체배열에 넣기
		}
		System.out.println("학교"+"            "+"학번"+"       "+"이름"+"     "
		+"성적"); //학교, 학번, 이름, 성적을 출력
		for(int i=0;i<number;i++) {
			System.out.printf("%s         %d       %s     %d\n",students[i].School,students[i].Student_code,students[i].name,students[i].score); //각 배열의 적힌 학생들의 학교, 학번, 이름, 성적을 차례대로 출력 
		}
		}
	}