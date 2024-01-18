package javaFestival;

public class javaFestival_05일_06문제_2 {

	public static void main(String[] args) {
		String score = "xxxxoooxxoooo";
		System.out.println(score);
		System.out.print((char) 111);
		System.out.print((char) 111);
		System.out.print((char) 111);
		System.out.print((char) 120);
		System.out.print((char) 111);
		System.out.print((char) 111);
		int sum = 0;
		int count = 0;
		System.out.println();

		for (int i = 0; i < score.length(); i++) {
			if (score.charAt(i) == 'o') {
				count++;
				sum += count;
			} else if (score.charAt(i) == 'x') {
				count--;
			}
		}
		System.out.println(sum);

	}

}
