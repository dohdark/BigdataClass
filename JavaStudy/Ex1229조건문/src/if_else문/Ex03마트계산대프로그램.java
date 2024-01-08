package if_else문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요: ");
		int gift = sc.nextInt();
		int price=0;
		
		if(gift>=11) {
			price= (int) ((10000 * gift)*0.9);
		}else {
			price=10000*gift;
		}
		System.out.printf("가격은 %d원입니다.",price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
