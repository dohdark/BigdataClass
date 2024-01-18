package 알고리즘문제;

public class 알고리즘문제_28번 {

	public static void main(String[] args) {
		
		String str = "01001101";
		
		char[] arr = str.toCharArray();
		System.out.println(arr);
		// 7
		double[] strarr = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {	
				strarr[i]=Math.pow(2,arr.length-i);
			}
		}
		int sum = 0;
		for (int i = 0; i < strarr.length; i++) {
			sum+=strarr[i];
		}
		System.out.println(sum);
		
		
		
	}

}
