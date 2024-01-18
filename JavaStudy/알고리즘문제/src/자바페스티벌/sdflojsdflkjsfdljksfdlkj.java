package 자바페스티벌;

import java.util.Arrays;

public class sdflojsdflkjsfdljksfdlkj {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j]=count++;
			}
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				System.out.print(arr[j][arr.length-1-i]+" ");
				
			}
			System.out.println();
		}
		

	}

}
