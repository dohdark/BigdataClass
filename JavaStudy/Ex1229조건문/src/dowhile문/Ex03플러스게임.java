package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex03플러스게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		
		
		do {
			int ranNum = ran.nextInt(10)+1; 
			int ranNum1 = ran.nextInt(10)+1; 
		System.out.print(ranNum+ " + " +ranNum1 + " = ");
		int result = sc.nextInt();
		
		if(ranNum+ranNum1==result) {
			System.out.println("정답 정답 정답");
		}else {
			System.out.println("오답 오답 오답");
			System.out.print("계속 하시겠습니까?, Y(y) or N(n) ");
			String ch = sc.next();
			if (ch.equals("N")) {
				System.out.println("종료 되었습니다.");
				break;
			}
		}
		}while(true);
		
		
		
		
		
		
		
		
		
	}

}
