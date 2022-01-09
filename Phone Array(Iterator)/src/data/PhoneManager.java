package data;
import java.util.Arrays; //Array 불러오기
import java.util.Iterator; //Iterator 불러오기
import java.util.Scanner; //Scanner 불러오기
public class PhoneManager {	
	private Phone[] phoneArray; //phoneArray라는 배열 생성
	private int count; //phoneArray 배열에 값을 차례대로 넣기 위한 변수 count 생성
	public void add(String name, String number) { //입력받은 이름과 연락처를 추가하기
		phoneArray[count] = new Phone(name,number); //입력받은 이름과 연락처를 phoneArray 배열에 넣기
		count = 0; //처음부터 넣기
		count++; //차례대로 넣기
		}
	public PhoneManager() {	
		System.out.print("인원수>>"); //인원수를 받기 위한 문구 출력
		Scanner scanner = new Scanner(System.in); //Scannner 시작
		int number= scanner.nextInt();	//입력받은 인원수를 변수 number에 넣기
		phoneArray = new Phone[number]; //입력받은 인원수만큼의 배열 만들기
		for(int i=0; i<number;i++) {	//입력받은 횟수만큼 객체 입력
			System.out.print("이름과 전화번호 (번호는 연속적으로 입력)>>"); //키보드로부터 이름과 전화번호를 입력받기 위한 문구 출력
			String name = scanner.next(); //입력받은 이름을 변수 name에 넣기
			String tel = scanner.next(); //입력받은 전화번호를 변수 tel에 넣기
			add(name, tel);	//입력받은 tel과 name을 입력
			}
		System.out.print("저장되었습니다...\n"); //입력받은 이름과 전화번호를 저장했다는 문구 출력
		}
	public void searchByName (String name) { //저장된 연락처에서 이름으로 찾기위한 함수 생성
		boolean x=true;	//검색된 값이 있는지 확인하기 위한 논리형 변수
		Iterator<Phone> iterator = Arrays.asList(phoneArray).iterator(); //phonArray배열을 iterartor에 저장
		while(iterator.hasNext()) {	//다음 배열의 값이 존재할때까지 반복
			Phone phone=iterator.next(); //계속해서 다음으로 넘어가기
			if((phone.getName()).equals(name)) { //만약 검색한 이름과 배열에 있는 이름이 같다면
				System.out.printf("%s의 번호는 %s입니다.\n",phone.getName(),phone.getTel()); //이름과 번호를 출력
				x=false; //검색된 변수를 찾았을 때
			}
		}
		if(x) {	//검색된 변수를 못 찾았을 때
			System.out.printf("%s이 없습니다.\n",name); //검색한 이름이 없다는 문구 출력
		}
	}
}