package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		
		//메소드는 메소드안에서 생성불가 메인메소드를 나와서 작성해야함
		System.out.println(addDouble(3.15,2.05));
		System.out.println(subInt(1, 1));
		fofofo();
	}
		// 1. 메소드 생성
	public static double addDouble(double a,double b) {
		return a+b; //메소드는 리턴을 만나면 종료 , 리턴이후 코딩불가
	}
	
	public static int subInt(int n1,int n2) {
		if(n1>n2) {
			return n1-n2;
			}
		else {
			return n2-n1;
			}
	}
	public static void fofofo() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello world");
		}		
	}
}
