package switch문;

import java.util.Scanner;

public class Ex02_자판기프로그램 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("메뉴를 고르세요. ");
		System.out.println("1.아우터 700원  2.이구동성 1000원  3.에그몽 500원 ");
		int cho = sc.nextInt();
		int price = 0;
		String st = "";
		switch (cho) {

		case 1:
			price = 700;
			if (price > money) {
				st = "돈이 부족합니다.";
			} else {
				st = "";
			}
			break;

		case 2:
			price = 1000;
			if (price > money) {
				st = "돈이 부족합니다.";
			} else {
				st = "";
			}
			break;

		case 3:
			price = 500;
			if (price > money) {
				st = "돈이 부족합니다.";
			} else {
				st = "";
			}
			break;

		default:
			System.out.println("1~3번만 입력하세요");
		}
		int a,b,c,sum = 0;
		sum= money-price;
		if (sum > 0) {
			System.out.println("잔돈 : " + (sum));
			System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개",sum/1000,(sum%1000)/500,(sum%500)/100);
		}else {
			System.out.print(st);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}