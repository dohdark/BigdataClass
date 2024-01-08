package javaFestival;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		int count=1;
		int result = 0;
		// 25462581
		
		for(int i = 10 ; i <= 100000000 ; i*=10) {
			// 1 10 100 1000 10000
			// 1 10 100 1000 10000
			System.out.println(num%i / count);
			count*=10;
			
			System.out.println(num%i);
			
			
			
			
		}
		
		
		
		System.out.println("합은 : "+result);
		
		
		
		
		
		
	}

}
