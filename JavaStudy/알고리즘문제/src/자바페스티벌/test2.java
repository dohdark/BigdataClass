package 자바페스티벌;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("A 입력 : ");
			int a = sc.nextInt();
			System.out.print("B 입력 : ");
			int b = sc.nextInt();
			System.out.println();
			
			if(a==0 && b==0) {
				
				System.out.println("결과 >> 0");
				break;
				
			}else {
				System.out.println("결과 >> "+(a-b));
			}
	
		}
		
		
		
		
		
	}
}
