package 반복문;

public class Ex02_for문예제 {

	public static void main(String[] args) {
		
		for(int i = 96 ; i >= 73 ; i--){
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		for(int i = 96 ; i >= 73 ; i--){
			if(i%2==1) {
				//홀수
				System.out.print(i+" ");				
			}
		}
//		for(int i = 95 ; i >= 73 ; i-=2){
//			System.out.print(i+" ");
//		}
	}
}
