package 자바페스티벌;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// 0 6
		// 1 2
		// 2 5
		// 3 5
		// 4 4
		// 5 5
		// 6 6
		// 7 3
		// 8 7
		// 9 6
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0 을 제외한 숫자를 입력: ");
		String str = sc.next();
		char[]chararr = str.toCharArray();
		int result = 0;
		for (int i = 0; i < chararr.length; i++) {
			if(chararr[i]=='0') {
				result +=6;
			}else if(chararr[i]=='1') {
				result+=2;
			}else if(chararr[i]=='2'||chararr[i]=='3'||chararr[i]=='5') {
				result+=5;
			}else if(chararr[i]=='4') {
				result+=4;
			}else if(chararr[i]=='6'||chararr[i]=='9') {
				result+=6;
			}else if(chararr[i]=='7') {
				result+=3;
			}else if(chararr[i]=='8') {
				result+=7;
				
			}
			
		}
		System.out.println(result);
		
		
		
	}

}
