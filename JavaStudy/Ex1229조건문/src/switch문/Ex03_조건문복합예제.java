package switch문;

import java.util.Scanner;

public class Ex03_조건문복합예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int t = sc.nextInt();
		int m = 5000;
		int tm=0;
		
		
		
		if(t>8) {
			tm= ((m*8) + (int)(m*1.5) * (t-8) );
		}else {
			tm=m*t;
		}
		System.out.println("총 임금은 "+ tm +"원 입니다.");
	}

}
