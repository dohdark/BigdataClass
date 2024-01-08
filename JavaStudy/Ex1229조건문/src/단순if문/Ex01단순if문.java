package 단순if문;

import java.util.Scanner;

public class Ex01단순if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age>20) {
			System.out.println("나이가 21살 이상입니다");
		}
		else {
			System.out.println("나이가 20살 이하입니다.");
		}
		
		System.out.println(age>20?"20초과":"20이하");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}