package 알고리즘문제;

public class 알고리즘문제_6번 {

	public static void main(String[] args) {
		// 제한시간 : 8분
		// 획득점수 : 15점
		int sum = 0;
		int count = 77;	// 실행될때마다 1씩 증,감소하는 증감연산자 count선언
		for (int i = 1; i <= 77; i++) {//실행될때마다 1씩 증가하는 i를 1로 선언
			sum += i * count--; //i가 1~77까지 반복될때 i * count-- 를 실행
		}						// count는 77~1까지 떨어지고 i는 1부터 77까지 올라감
		System.out.println(sum);
	}

}
