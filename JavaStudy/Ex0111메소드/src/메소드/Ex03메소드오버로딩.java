package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {
		// 메소드 사용
		// 메소드 오버로딩은 메소드를 중복정의 하는것
		// 매개변수의 타입을 다르게 하거나 개수를 바꿔서 중복선언해야함
		System.out.println(add(3.5,5.5));
	}
	
	// 메소드 오버로딩 성립조건
	// 1. 메소드 이름이 같아야함
	// 2. 매개변수 개수, 자료형이 달라야함
	// 3. 매개변수와 메소드 이름이 같고 리턴타입만 다른경우 오버로딩이 아니다.
	private static int add(int num1,int num2) {
		return num1+num2;
	}
	private static double add(double num1,double num2) {
		return num1+num2;
	}
	
	
	
}
