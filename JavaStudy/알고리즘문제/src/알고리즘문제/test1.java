package 알고리즘문제;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
	
		
//		String str = "11111010";// leng8 index7
//		char[] strarr = str.toCharArray();
//		int sum = 0;
//		for (int i = 0; i < strarr.length; i++) {
//			int two = 1;
//			if(strarr[i]=='1') {
//				for(int j = 0; j<strarr.length-i-1;j++) {
//					two*=2;
//				}
//				sum+=two;
//				
//			}
//		}
//		System.out.println(sum);
		
		// 변환하고자 하는 10진수
        int decimal = 10;

        // 2진수를 저장할 문자열
        String str = new String();
        
        // 10진수를 2진수로 변환
        while (decimal > 0) {
            int r = decimal % 2; // 나머지
            str+=r; // 나머지를 문자열에 추가
            decimal /= 2; // 몫을 업데이트
        }
        String result="";
        // 변환된 2진수를 역순으로 뒤집고 출력
        for(int i = str.length()-1;i>=0;i--) {
        	result+=str.charAt(i);
        }
        
        // 2진수 출력
        System.out.println(result.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
