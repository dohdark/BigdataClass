package 자바페스티벌;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int n = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			
		}
	}
}
