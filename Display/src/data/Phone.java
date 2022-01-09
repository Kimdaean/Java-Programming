package data;
public class Phone { //다른 패키지에서 접근할 수 있도록 public으로 설정
	private String name; //이름을 받기 위한 변수 name 생성
	private String tel; //전화번호를 받기 위한 변수 tel 생성
	public Phone(String name, String tel) { //이름과 전화번호를 받고 초기화하기 위한 생성자 생성
		this.name = name; //현재 객체인 name에서 받은 값을 변수 name에 넣기
		this.tel = tel; //현재 객체인 tel에서 받은 값을 변수 tel에 넣기
	}
	public String getName() { //현 객체 name에 대한 문자열 표현을 반환받기 위한 메소드
		return name; //name을 문자열로 반환
	}
	public String toString() { //현 객체 tel에 대한 문자열 표현을 반환받기 위한 메소드
		return ""+tel+""; //tel을 문자열로 반환
	}
}