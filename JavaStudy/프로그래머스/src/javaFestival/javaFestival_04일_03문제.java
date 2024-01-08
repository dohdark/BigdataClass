package javaFestival;

public class javaFestival_04일_03문제 {

	public static void main(String[] args) {
											 //    
//		for(int i = 0; i <= 4 ; i++) {		 // i= 4 3 2 1 0
//			System.out.print("1");
//			
//			for(int j = 4; j > i ; j--) { 	 // j= 0 1 2 3 4
//				
//				System.out.print("0");
//			}
//			System.out.print("\n");
//		}
		int n = 1000;
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("슈");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("슉");
            }
            System.out.println();
        }
	}

}
