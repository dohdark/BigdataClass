package 반복문;

import java.util.Scanner;

public class Ex04_입력하는구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느수까지 출력 : ");
		int gob = sc.nextInt();
		
		for(int i = 1; i <= gob ; i++) {
			System.out.println(dan + "x"+ i +" = "+ i*dan);
		}
	}

}
