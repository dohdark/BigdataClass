package if_else문;

import java.util.Scanner;

public class Ex01if_else문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
//		if(score>=95) {
//			System.out.printf("당신의 점수는 %d점으로 A입니다.",score);
//		}
	
		if(score>=60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다");
		}
		
		
		
		
		
		
		
	}

}
