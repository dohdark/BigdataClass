package 배열;

public class Ex01배열기초 {

	public static void main(String[] args) {

		// 배열 선언하는 방법
		// 자료형[] 변수명 = new 자료형[0];
		int[] numbers= new int[5];
		System.out.println(numbers);
		// numbers ---> 5칸짜리 배열이 어디 있는지

	
		
		//주소값을 참조하는 레퍼런스 변수
		// new ---> 레퍼런스 변수 생성하는 키워드
		// 주소값이라는 개념이 왜 등장했나요?
		// : 자바에서는 데이터를 저장할 수 있는 공간이 분리되어 있다. 
		// --> 서로 다른 저장공간에 있는 데이터를 불러오기 위해서는 
		// 해당하는 데이터가 어디에 저장되어 있는지 주소값이 필요!!
		
		// 배열의 특징
		// 1. 같은 자료형만 저장할 수 있다.
		// 2. 인덱스 번호를 가지고 있다.
		//    인덱스 번호는 2번부터 시작해서 차례로 1씩 증가한다.
		// 3. 크기가 고정적이다.
		
		
		
		numbers[1] = 15;
		System.out.println(numbers[1]);
		
		
	}
}
