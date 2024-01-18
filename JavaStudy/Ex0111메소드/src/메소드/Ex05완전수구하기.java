package 메소드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("num1 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("num2 입력 : ");
//		int num2 = sc.nextInt();
//		boolean divisor = isdivisor(num1, num2);
//		System.out.println(divisor);
		
		System.out.println(getSum(44));
	}

	public static boolean isdivisor(int num1, int num2) {
		if (num1 % num2 > 0) {
			return false;
		} else {
			return true;
		}
	}
	public static int getSum(int num1) {
		int sum=0;
		
		
		for(int i = 1; i<= num1 ; i++) {
			if(isdivisor(num1, i)==true) {
				sum+=i;
			}
			
//			if(num1%i==0) {
//				sum+=i;
//			}
		}
		return sum-num1;
	}
	
	public static boolean isPerfect(int num1) {
		int sum = 0;
		for(int i = 1 ; i< num1 ; i++) {
			if(num1 % i == 0) {
				sum+=i;
			}
		}
		if(sum==num1) {
			return true;
		}else{
			return false;
		}
		
		
	}
	
}
