package javaFestival;

import java.util.Scanner;

public class javaFestival_04일_01문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("앙");
		}
		
	}

}
