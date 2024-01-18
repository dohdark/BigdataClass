package 알고리즘문제;

public class 알고리즘문제_3번 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 10점
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {// 홀수는 더하고 짝수는 빼기
			if (i % 2 == 0) {
				sum -= i; // 짝수일때
				System.out.print("-"+i+" ");
			} else {
				sum += i; //홀수일때
				System.out.print(i+" ");
			}
		}
		System.out.println("\n결과 : "+sum);
	}

}
