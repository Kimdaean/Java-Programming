package ui;
import java.util.Iterator; //Iterator 불러오기
import java.util.Scanner; //Scanner 불러오기
import data.Phone; //data 패키지에 Phone 클래스 불러오기
import data.PhoneManager; //data 패키지에 PhoneManager 클래스 불러오기
public class PhoneManagerTest {
	public static void main(String Args[]) {
		System.out.print("인원수 >>"); //인원수를 받기 위한 문구 출력
		Scanner scanner = new Scanner(System.in); //Scanner 시작
		int number = scanner.nextInt(); //키보드로부터 입력 받은 인원수를 변수 number에 넣기
		PhoneManager manager = new PhoneManager(); //PhoneManager 클래스에서 manager라는 변수 생성
		for (int i=0; i<number; i++) { //입력 받은 인원수만큼 반복
			System.out.print("이름과 전화번호 >>"); //이름과 전화번호를 받기 위한 문구 출력
			String name = scanner.next(); //키보드로부터 입력 받은 이름을 변수 name으로 설정
			String tel = scanner.next(); //키보드로부터 입력 받은 전화번호를 변수 tel로 설정
			Phone phone = new Phone(name,tel); //Phone 클래스에서 phone이라는 변수 생성
			manager.add(phone); //변수 phone값을 변수 manager에 넣기
		}
		System.out.println("저장되었습니다.."); //키보드로부터 입력받은 값을 저장했다는 문구 출력
		manager.display(); //저장된 모든 이름과 전화번호를 출력
		while(true) { //무한반복
			System.out.print("검색할 이름을 입력하세요 >>"); //검색할 이름을 받기 위한 문구 출력
			String name = scanner.next(); //키보드로부터 입력 받은 이름을 변수 name에 넣기
			if (name.equals("exit")) //입력받은 값이 "exit"이라면
				break; //반복문 빠져나오기
			Iterator<Phone> result = manager.searchByName(name); //변수 manager의 값을 result 배열에 넣기
			if (result != null) { //result에 입력받은 값과 같은 값을 갖은 인덱스가 있다면
			while (result.hasNext()) { //다음 인덱스가 존재할때까지 반복
				Phone phone = result.next(); //다음 인덱스로 넘어가기
				System.out.printf("%s의 번호는 %s입니다.\n",name, phone.toString()); //변수 manger에서 찾은 값을 배열 result에 넣기
			}
			}else //검색한 이름이 result에 없을 경우
				System.out.printf("%s의 번호는 없습니다.\n",name); //검색한 이름이 없다는 문구 출력
	}
}
}
