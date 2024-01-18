package 알고리즘문제;

import java.util.Scanner;

public class 보너스문제_1번 {

	public static void main(String[] args) {
		// 제한시간 : 12분
		// 획득점수 : 22점
		Scanner sc = new Scanner(System.in);
		

		
		
		while (true) {//break를 만날때까지 반복
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			
			if(num1==0 && num2==0) { // num1과 num2가 동시에 0일때 종료
				System.out.println("종료");
				break;
			}
			
			System.out.println("결과 >> "+(num1+num2));
			
		}
	}
}
