package 알고리즘문제;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진 정수 >>> ");
		int num = sc.nextInt();
		String str = new String();
		
		while(num>0) {
			int i = num%2;
			str+=i;
			num/=2;
		}
		for (int i = str.length()-1; i >=0 ; i--) { // 인덱스를 마지막번호에서 처음번호 순으로 호출
			System.out.print(str.charAt(i)+" ");	// str+=i 때문에 뒤로밀린 값들을 역순으로 호출
		}
		
		
	}

}
