package javaFestival;

import java.util.Arrays;

public class javaFestival_05일_05문제 {

	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] point2 = new int[7];
		for(int i = 0 ; i< 7; i++) { // 01 02 03 04 05 06
			for(int j = 0; j<7; j++) {
				if(point[i]>point[j]) {}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i < point.length; i++) {
//			for (int j = i; j < point.length; j++) {
//				if (point[i] - point[j] == 0) {
//					point2[i] = 0;
//					
//				} else if (point[i] - point[j] > 0) {
//					point2[j] = point[i] - point[j];
//					
//				}else if(point[i]-point[j]<0) {
//					point2[i]=point[i]-point[j];
//					point2[i]*=-1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(point2));

//			for (int j = 0; j < point.length; j++) {
//				if (point[i] - point[j] == 0) {
//					point2[i] = point[i];
//				}else if(point[i] - point[j] > 0) {
//					point2[i]=point[i] - point[j];
//				}
//
//			}

//		for(int i:point) {
//			for(int j :point) {
//				if(i-j>0) {
//					min = i-j;
//				}else if(i-j<0) {
//					min*=-1;
//				}
//			}
//		}
	}
}
