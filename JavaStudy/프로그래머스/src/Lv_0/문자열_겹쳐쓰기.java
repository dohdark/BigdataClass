package Lv_0;

import java.util.Scanner;

public class 문자열_겹쳐쓰기 {

	public static void main(String[] args) {
		// 문자열 my_string,over_string과 인덱스 정수s가 주어집니다.
		// 문자열 my_string의 s부터 over_string로 초기화하여 출력.
//		Scanner sc = new Scanner(System.in);
//		String t = sc.next();
		String my_string = "Program29b8UYP";
		String over_string = "merS123";
		int s=7;
		String answer="";
		
		for(int i=0; i<my_string.length(); i++) {

//			if(i==s) {
//				answer += over_string;
//			}
//			
//			answer += my_string.charAt(i);
			if(i==s) {
		         answer += over_string;
		    }else if(i<s || i>=s+over_string.length()) {
		            answer += my_string.charAt(i);
		    }
		}
		
		System.out.println(answer);
		
		
		
		
		
		
	}

}
