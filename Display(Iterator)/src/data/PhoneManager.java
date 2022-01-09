package data;
import java.util.ArrayList; //Iterator 불러오기
import java.util.Iterator;
public class PhoneManager { //다른 패키지에서 접근 가능할 수 있도록 public으로 설정
	private ArrayList<Phone> phoneArray; //phoneArray를 PhoneManager 클래스에서만 사용할 수 있게 설정
	public PhoneManager() {
		phoneArray = new ArrayList<Phone>(); //입력받은 Phone만 다루는 컬렉션 phoneArray컬렉션 생성
	}
	public void add(Phone phone) { //입력받은 이름과 전화번호를 추가하기
		phoneArray.add(phone); //phoneArray에 이름과 전화번화를 저장
	}
	public Iterator<Phone> searchByName(String name) { //입력받은 이름을 통해 전화번호를 찾기 위한 함수 생성
		ArrayList<Phone> result = new ArrayList<Phone>(); //새로운 배열 result 생성
		Iterator<Phone> phoneIterator = phoneArray.iterator(); //phoneArray배열을 iterator에 저장
		while (phoneIterator.hasNext()) { //다음 인덱스가 존재할때까지 반복
			Phone phone = phoneIterator.next(); //다음 인덱스로 넘어가기
			result.add(phone); //result 배열에 이름과 연락처 저장
		}
		if (result.size() == 0) //입력받은 값이 phoneArray에 없다면
			return null; //아무런 값도 반환하지 않기
		else //phoneArray에 입력받은 값이 있다면
			return result.iterator(); //result를 반환
	}
	public void display() { //저장받은 모든 이름과 전화번호를 출력하기 위한 함수 생성 
		for (int i=0; i<phoneArray.size(); i++) { //처음부터 마지막 인덱스까지
			System.out.printf("저장된 이름은 %s이고 전화번호는 %s입니다.\n",phoneArray.get(i).getName(),phoneArray.get(i).toString()); //저장된 모든 이름과 전화번호를 출력
		}
	}
}
