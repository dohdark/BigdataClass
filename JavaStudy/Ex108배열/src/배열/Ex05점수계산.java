package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		
		int[] array = new int[5];
		
		
		for(int i = 0; i<=4;i++) {
			System.out.print("0~4번 인덱스에 들어갈 정수 입력 : ");
			array[i]=sc.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		int sum = 0;
		System.out.println(Arrays.toString(array));
		
		for (int j = 0; j < array.length; j++) {
			max = array[j]>max ? array[j]:max;
			min = array[j]>min ? min:array[j];
			sum += array[j];
		}
		System.out.println("min : "+min);
		System.out.println("max : "+max);
		System.out.println("sum : "+sum);
		System.out.println("div : "+(float)sum/array.length);
		
		
//		for (int j = 0; j < array.length; j++) {
//			if(array[j] > max) { // 하나씩 크기비교해서 큰게 max로
//				max = array[j];
//			}
//			if(array[j] < min) { // 하나씩 비교해서 작은게 min으로
//				min = array[j];
//			}
//		}
		
		
	}

}
