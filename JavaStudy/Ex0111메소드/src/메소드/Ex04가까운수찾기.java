package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력:");
		int num1 = sc.nextInt();

		System.out.print("정수 입력:");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}

	public static int close10(int num1, int num2) {

		
		
		
		
		if(Math.abs(10-num1) > Math.abs(10-num2)) {
			return num2;
		}else if(Math.abs(10-num1) < Math.abs(10-num2)) {
			return num1;
		}else {
			return 0;
		}
			
			
//		if (10 - m1 > 10 - m2) {
//			return num1;
//		} else if (10 - m1 < 10 - m2) {
//			return num2;
//		} else {
//
//			return 0;
//
//		}
//		if((10-num1)*(10-num1) > (10-num2)*(10-num2)) {
//			return num2;
//		}else if((10-num1)*(10-num1) < (10-num2)*(10-num2)) {
//			return num1;
//		}else {
//			return 0;
//		}
		
	}

}
