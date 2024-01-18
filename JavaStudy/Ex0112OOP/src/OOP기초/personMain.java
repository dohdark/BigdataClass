package OOP기초;

public class personMain {

	public static void main(String[] args) {
		
		// 1. 설계도를 기반으로 객체를 생성
		// 자료형 변수명 = new 자료형;
		Person person = new Person();
//		System.out.println(person);
		person.age=29;
		person.name="김동현";
		person.gender="남자";
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.gender);
		System.out.println();
		// 하나의 클래스로 여러개의 객체 생성이 가능하다!
		// 여러분 짝꿍의 정보를 저장하는 person2라는 객체를 생성
		Person person2 = new Person();
		person2.age=21;
		person2.name="박준범";
		person2.gender="남자";
		System.out.println(person2.age);
		System.out.println(person2.name);
		System.out.println(person2.gender);
		
		person2.eat();

	}

}
