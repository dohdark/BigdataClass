package javaFestival;

import java.util.Scanner;

public class JavaFestival_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int money = sc.nextInt();

		System.out.println("잔돈 : " + money);
		int money2 = 0;
		int a10000 = 0;
		int a5000 = 0;
		int a1000 = 0;
		int a500 = 0;
		int a100 = 0;
		
		
		
		
		if (money/10000>=1) {
			a10000 = money/10000;
			money -= a10000*10000;
		}if(money/5000>=1) {
			a5000 = money/5000;
			money -= a5000*5000;
		}if(money/1000>=1) {
			a1000 = money/1000;
			money -= a1000*1000;
		}if(money/500>=1) {
			a500 = money/500;
			money -= a500*500;
		}if(money/100>=1) {
			a100 = money/100;
			money -= a100*100;
		}
		System.out.println(" 10000원: "+ a10000);
		System.out.println(" 5000원: "+ a5000);
		System.out.println(" 1000원: "+ a1000);
		System.out.println(" 500원: "+ a500);
		System.out.println(" 100원: "+ a100);
		
		
		
		
	}
}
