package 알고리즘문제;

import java.util.Scanner;

public class 알고리즘문제_16번 {

	public static void main(String[] args) {
		// 제한시간 : 15분
		// 획득점수 : 25점
		
		Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println(sum);
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		String num = sc.next();
//		int sum = 0;
//		for(int i = 0; i<num.length() ; i++) {
//			sum += num.charAt(i);
//			System.out.println(sum);
//		}
//		System.out.println(sum);
		
	}

}
