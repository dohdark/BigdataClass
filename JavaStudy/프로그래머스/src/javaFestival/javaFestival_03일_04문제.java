package javaFestival;

import java.util.Scanner;

public class javaFestival_03일_04문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력: ");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		
		for(int i = 0 ; i < n ; i++) {
			sum += count++;
			System.out.println(sum+1);
			// sum+1 말고 한번에 나오는 방법 있는지 찾아보기
		}
		
		
		
	}

}
