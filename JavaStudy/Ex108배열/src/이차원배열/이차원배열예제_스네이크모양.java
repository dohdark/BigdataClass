package 이차원배열;

public class 이차원배열예제_스네이크모양 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 21;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (i % 2 == 0) {
					System.out.print(arr[i][j]+" ");
				} else if (i % 2 == 1) {

					System.out.print(arr[i][arr.length - 1 - j] + " ");
				}
			}
			System.out.println();
		}

	}
}
