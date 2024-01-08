package 다중if문;

import java.util.Scanner;

public class Ex_01_다중if문 {

	public static void main(String[] args) {

		// 숫자를 입력받아서 홀,짝,0 인지 구분하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String answer ="";
		
//		if(num%2==0 & num!=0) {
//			answer = "짝수";
//		}else if(num%2==1){
//			answer = "홀수";
//		}else {
//			answer="0";
//		}
//		System.out.println(answer+" 입니다.");
		
		
		if(num==0) {
			answer = "0";
		}else if(num%2==0){
			answer="짝수";
		}else
			answer="홀수";
		System.out.println(answer+" 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
