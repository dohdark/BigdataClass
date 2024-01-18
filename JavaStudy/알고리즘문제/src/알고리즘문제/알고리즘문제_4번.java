package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_4번 {

	public static void main(String[] args) {
		//제한시간 : 15분
		//획득점수 : 10점
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 :");
		int money = sc.nextInt();
		System.out.println("\n잔돈 : " + money);
		
		if(money/10000 >= 0) {
			System.out.println("10000원 :"+money/10000);
			money-=(money/10000)*10000;
		}
		if(money/5000 >= 0) {
			System.out.println("5000원 :"+money/5000);
			money-=(money/5000)*5000;
		}
		if(money/1000 >= 0) {
			System.out.println("1000원 :"+money/1000);
			money-=(money/1000)*1000;
		}
		if(money/500 >= 0) {
			System.out.println("500원 :"+money/500);
			money-=(money/500)*500;
		}
		if(money/100 >= 0) {
			System.out.println("100원 :"+money/100);
			money-=(money/100)*100;
		}
	}
}
