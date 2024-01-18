package 상속기초;

public class Child extends Parent{
	// 자식 클래스, 새로운 클래스, 서브 클래스
	// extends : 연장하다, 확장하다
	
	// 짜장면 만드는 메소드(나만의기능)
	/**
	 * @author Kimdonghyun
	 * @since 24.01.17
	 * @return void
	 * @param 매개변수 없음
	 */
	public void makeJjajang() {
		System.out.println("맛있는 짜장면을 만든다!");
	}
	
	
	
	
	@Override // <-- 어노테이션 annotation(주석): 특정기능을 가지고있는것은 아님
	public void makeJjam() {
		System.out.println("맛있는 해물 짬뽕을 만든다!");
		
	}
	// 메소드 오버라이딩
	// : 상속이 전제되어 있어야 한다.
	// : 부모 클래스가 가지고 있는 메소드의 틀을 (메소드명, 리턴타입, 매게변수)
	// : 그대로가지고 와서 {} 안에 로직만 재정의 기법*
	
	
	
}

