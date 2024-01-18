package 알고리즘문제;

public class 알고리즘문제_11번 {

	public static void main(String[] args) {
		// 제한시간 : 15분
		// 획득점수 : 20점
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : "+result);
		
		
		
		
	}
	public static boolean isDivide(int num1, int num2) {
		if(num1%num2 ==0) { // num1을 num2로 나눈 나머지가 0이라면
			return true;	// 그수는 num1에 대해 약수임
		}else {
			return false;
		}		
	}
}
