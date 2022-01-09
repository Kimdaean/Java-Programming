public class Student {
	String name;	//학생들의 이름을 입력받기 위한 변수 name 생성
	int score;	//학생들의 점수를 입력받기 위한 변수 score 생성
	static int count=0;	//객체 인스턴스들 간의 count 변수를 공유하기 위해 static을 사용
	String School;  	//학교 이름을 받기 위한 변수 School 생서
	int Student_code=0;	//학번을 입력받기 위한 변수 Student_code 생성
	public Student(String name, int score) { //학생들의 이름과 성적을 받고 초기화하기 위한 생성자 생성
		this.name = name; //현재 객체인 name에서 받은 값을 변수 name에 넣기
		this.score = score; //현재 객체인 score에서 받은 값을 변수 score에 넣기
		School = "한성대학교";	//학교이름은 학생들 간에 공유되는 정보로서 '한성대학교'로 초기화
		Student_code = count; //count 값을 학번으로 초기화
		count++; //객체가 생성될 때마다 하나씩 증가
	}
}