package data;
public class PhoneManager { //다른 패키지에서 접근 가능할 수 있도록 public으로 설정
	private Phone[] phoneArray; //phoneArray라는 배열 생성
	private int count; //phoneArray 배열에 값을 차례대로 넣기 위한 변수 count 생성
	private final int MAX = 100; //phoneArray의 크기를 설정하기 위한 변수 MAX를 100으로 초기화
	public PhoneManager() {
		count = 0; //변수 count를 0으로 초기화
		phoneArray = new Phone[MAX]; //phoneArray의 크기 설정
	}
	public void add(Phone phone) { //입력받은 이름과 연락처를 추가하기
		phoneArray[count] = phone; //phone에서 받은 값을 phoneArray 배열에 넣기
		count++; //배열의 처음부터 시작해서 차례대로 넣기
	}
	public Phone searchByname(String name) { //연락처에서 이름으로 찾기 위한 함수 생성
		for (int i=0; i<count; i++) { //배열의 크기만큼 연락처 찾기
			if (name.equals(phoneArray[i].getName())) { //만약 객체 name에서 받은 값과 phoneArray 배열에 있는 값들 중 같은 값이 있다면
				return phoneArray[i]; //그 같은 값을 반환받기
			}
		}
		return null; //같은 값이 없으면 아무런 값도 돌려받지 않기
	}
 
}
