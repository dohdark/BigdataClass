package if_else문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int pp = sc.nextInt();
		
		if(age<20) {
			System.out.println("총 "+ pp*2500 +" 원 입니다.");
		} else {
			System.out.println("총 "+ pp*5000 +" 원 입니다.");
		}
		
		
		
		
		
		
	}

}
