public class Account {
	int balance; //잔액을 받기 위한 변수
	String id; //계좌번호를 얻기 위한 변수
	Account(){
		balance =0;
		id = "NONE";
	}
	Account(int Balance,String ID) { //balance와 ID를 입력받아 현재 객체인 balance와 id에 넣어주는 생성자 
		this.balance = Balance; //현재 객체인 balance에서 받은 값을 변수 balance에 넣기
		this.id = ID; //현재 객체인 id에서 받은 값을 변수 id에 넣기
	}
	void deposit(int amount) { //돈을 입금하기 위한 함수 생성
		balance += amount; // 입금할 금액인 amount를 현재 잔액인 balance에 더하기
		System.out.println(amount+"원이 입금되어 현재 잔액은"+balance+"입니다."); //입금한 후 금액을 출력
	}
	void withdraw(int amount) { //돈을 출금하기 위한 함수 생성
		if (balance >= amount) { //잔액이 출금액보다 크거나 같을 경우
			balance -= amount; //잔액에서 출금액 만큼 빼줌
			System.out.println(amount+"원이 출금되어 현재 잔액은"+balance+"입니다."); //출금하고 남은 금액을 출력
			}else //그 외(잔액이 출금액보다 적은) 경우
				System.out.println("잔액이 부족하여 출금을 할 수 없습니다."); //출금을 할 수 없으므로 "잔액이 부족합니다" 문구 출력
	}
}