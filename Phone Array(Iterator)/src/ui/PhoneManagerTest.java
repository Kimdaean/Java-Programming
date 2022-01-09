package ui;
import data.PhoneManager; //data 패키지에서 PhoneManager 클래스 불러오기
import java.util.Scanner; //Scannner 불러오기
public class PhoneManagerTest {
	public static void main(String[] args) {
		PhoneManager manager = new PhoneManager(); //PhoneManager 클래스에서 manager라는 변수 생성
		Scanner scanner = new Scanner(System.in); //Scannner 시작
		while(true){ 
			System.out.print("검색할 이름>>"); //이름을 검색받기 위한 문구 출력
			String name=scanner.next(); //입력받은 이름을 변수 name에 넣기
			if(name.equals("exit")) { //입력받은 값이 exit이면
				break; //반복문 빠져나오기
			}
			manager.searchByName(name);	//입력받은 변수를 searchByName에 입력
		}
	}
}