package javaFestival;

import java.util.Arrays;
import java.util.Random;

public class javaFestival_05_01문제 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr= new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i]=rd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		int min=arr[0];
		for(int j = 0; j < arr.length; j++) {
			max = arr[j]>max ? arr[j] : max;
			min = arr[j]>min ? min : arr[j];
		}
		System.out.println(max);
		System.out.println(min);
		
	}
}
