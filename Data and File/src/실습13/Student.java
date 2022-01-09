package 실습13;

import java.io.Serializable;

public class Student implements Serializable{ //객체를 직렬화 하기 위해 Serializable 인터페이스 구현
	private String 학번; //문자열 변수 학번 생성
	private String 이름; //문자열 변수 이름 생성 
	private String 학과; //문자열 변수 학과 생성
	private int 나이; //정수형 변수 나이 생성
	
	public Student(String 학번, String 이름, String 학과, int 나이) { //생성자 호출
		this.학번 = 학번; //변수 학번에 파라미터로 받은 학번 넣기
		this.이름 = 이름; //변수 이름에 파라미터로 받은 이름 넣기
		this.학과 = 학과; //변수 학과에 파라미터로 받은 학과 넣기
		this.나이 = 나이; //변수 나이에 파라미터로 받은 나이 넣기
	}
	public String toString() { //문자열로 반환
		return String.format("%s %s %s %d", 학번, 이름, 학과, 나이); 
	}
}
class UnderGraduate extends Student { //Student 클래스를 상속받는 UnderGraduate 클래스 생성
	private String 동아리; //변수 동아리 생성
	public UnderGraduate(String 학번, String 이름, String 학과, int 나이, String 동아리) { //생성자 호출
		super(학번, 이름, 학과, 나이); //학번, 이름, 학과, 나이 파라미터로 받은 값으로 초기화
		this.동아리 = 동아리; //변수 동아리에 파라미터로 받은 동아리 넣기
	}
	
	public String toString() { //문자열로 반환
		return String.format("%s %s", super.toString(), 동아리);
	}
}

class Graduate extends Student { //Student 클래스를 상속받는 Graduate 클래스 생성
	private String 학위과정; //변수 학위과정 생성
	private String 전공; //변수 전공 생성
	
	public Graduate(String 학번, String 이름, String 학과, int 나이, String 학위과정, String 전공) { //생성자 호출
		super(학번, 이름, 학과, 나이); //학번, 이름, 학과, 나이 파라미터로 받은 값으로 초기화
		this.학위과정 = 학위과정; //변수 학위과정에 파라미터로 받은 학위과정 넣기
		this.전공 = 전공; //변수 전공에 파라미터로 받은 학위과정을 넣기
	}
	
	public String toString() { //문자열로 반환
		return String.format("%s %s %s", super.toString(), 학위과정, 전공);
	}
}
