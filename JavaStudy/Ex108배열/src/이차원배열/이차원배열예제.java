package 이차원배열;

import java.util.Arrays;

public class 이차원배열예제 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int count = 21;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = count++;
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));

	}

}
