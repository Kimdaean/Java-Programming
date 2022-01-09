public class Student {
	String name; //학생들의 이름을 입력받기 위한 변수 name 생성
	int score; //학생들의 성적을 입력받기 위한 변수 score 생성
	public Student(String name, int score) { //학생들의 이름과 성적을 받고 초기화하기 위한 생성자 생성
		this.name = name; //현재 객체인 name에서 받은 값을 변수 name에 넣기
		this.score = score; //현재 객체인 score에서 받은 값을 변수 score에 넣기
	}
}