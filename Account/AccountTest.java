public class AccountTest {
	public static void main (String[] args) {
		Account account1 = new Account(10000,"001"); //Account class에서 account1 객체 생성
		Account account2 = new Account(20000,"002"); //Account class에서 account2 객체 생성
		account1.withdraw(1000); //1000원 볼펜을 001 계좌와 연결된 카드로 결제
		account1.withdraw(3000); //3000원 공책을 001 계좌와 연결된 카드로 결제
		account1.withdraw(4000); //점심시간이 되어 4000원 햄버거를 001 계좌와 연결된 카드로 결제
		account1.withdraw(15000); //오늘이 후불제 교통비 자동이체 되는 날 하지만 돈이 없어서 지출이 안됨
		account2.withdraw(13000); //002 계좌에서 돈을 꺼내서
		account1.deposit(13000); //002 계좌에서 꺼낸 돈을 001 계좌에 입금
		account1.withdraw(13000); //못 낸 후불제 교통비 001 계좌에서 이체됨
	}
}