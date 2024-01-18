package 상속기초;

public class Main {

	public static void main(String[] args) {
		Parent p = new Parent();

		p.makeJjam();

		Child c = new Child();

		c.makeJjam();
		// 메소드 오버라이딩을 하면 오버라이딩한 메소드를 호출해서 사용

		c.makeJjajang();
		// 상속의 특징 3가지
		// 1. 다중상속이 불가능하다
		// 2. 상속의 횟수가 제한이없다.
		// 3. 모든 클래스는 Object를 상속한다.

		// 객체의 형변환 Casting
		// Reference Type에서의 형변환은 반드시 상속이 전제되어야 함
		// --> 객체 내의 필드, 메소드에 접근권한 강제, 자동형변환 인지 결정한다.
		// 1) Upcasting
		// : 자식 클래스가 부모클래스 타입으로 명시하지않아도 자동으로 형변환
		// 부모타입 변수명 = new 자식자료형();
		Parent p2 = new Child(); // Parent의 메소드 내용을 child에서 가져옴
		p2.makeTang();
		// 만약 자식 클래스에서 부모클래스드의 메소드를 오버라이딩한 경우 오버라이딩된 자식의 메소드를 호출
		p2.makeJjam();

		// 2) Downcasting
		// : 부모 클래스 타입이 자식클래스로 형변환 , 메소드를 채울수 없어 에러
		// Child c2 = (Child) new Parent();  예외사항 에러 발생 -> Exception 오류 : 구문오류는 없으나 실행시 예외상황이 발생하는것.
		// c2.makeJjajang();
		
		// 전제조건 : 업캐스팅된 객체만 다운캐스팅 가능
		// 다운캐스팅은 업케스팅된 객체를 강제 형변환으로 본래자료형으로 되돌려 놓는것.
		Child c2 = (Child)p2;
		c2.makeJjam();
		c2.makeTang();
		c2.makeJjajang();
		// 본래 자신이 가지고 있던 메소드를 사용할 수 있다.
		
		
		
		
		
		
		
	}

}
