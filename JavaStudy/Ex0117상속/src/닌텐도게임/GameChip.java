package 닌텐도게임;
// 게임들의 표준모델


// 2. 추상클래스
// 추상메소드를 하나라도 가지고 있으면 클래스도 추상클래스여야 한다.
// 추상 클래스도 일반메소드를 가지고 있을 수 있다.
// abstract 라는 키워드를 사용해 선언한다.
// 일반 메소드만 가지고 있어도 추상클래스가 될 수 있다.
public abstract class GameChip {
	// 닌텐도에 들어갈 수 있는 모든 게임칩의 공통의 부모 클래스
	public abstract void gameStart();
	// 1. 추상 메소드
	// {}가 없음, 메소드명, 매게변수. 리턴타입은 선언되어 있으나 로직이 구현되지 않은 메소드.
	// abstract 라는 키워드를 사용해 선언한다.
	
	public void temp() {
		System.out.println("임의임의");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
