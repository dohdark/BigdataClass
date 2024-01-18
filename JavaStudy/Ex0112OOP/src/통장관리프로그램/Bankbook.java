package 통장관리프로그램;

public class Bankbook {
	// 통장관리 프로그램을 만든다고 가정
	// 통장 설계도면 --> 통장을 관리할 수 있는 우리만의 자료형 만들기

	// 1. field(Data, 속성)
	private int money = 0;
	// 정보은닉, private 로 임의변경을 막는다
	
	

	// 2. method(행위,로직,기능)
	public int deposit(int money) {
		this.money=money;
		// this : 현재 클래스 자체를 의미하는 키워드
		return money += money;
	}

	public int withdraw(int money) {
		return this.money -= money;
	}

	public void showMoney() {
		System.out.println("잔액 : " + money + "원 있습니다.");
	}
	
//	public int showMoney() {
//		return money;
//	}
}
