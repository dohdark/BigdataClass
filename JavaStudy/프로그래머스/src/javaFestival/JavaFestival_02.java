package javaFestival;

import java.util.Scanner;

public class JavaFestival_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int num = sc.nextInt();
		int ban = 0;

		if(num%10>=5) {
			ban=num + (10 - num%10);
		}else {
			ban=num - num%10;
		}
		
		System.out.print("반올림 수: "+ban);
		
	}

}
