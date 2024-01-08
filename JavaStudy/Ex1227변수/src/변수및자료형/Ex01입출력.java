package 변수및자료형;

// 도구를 꺼내올 때는 반드시 어디에서 꺼낼 지 import 구문을 작성
// 직접 작성하기 보다는 에러에 마우스를 올려 해결하자
import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
		//주석주석김주석 중국의 주석은 시진핑이다.
		//단축키
		//글자크기 컨트롤+-
		//실행단축키 f11
		//자동 임포트 단축키 컨트롤 쉬프트 영문O
		
		
		
		
		//	1. 출력문
		//	--->()안쪽에 작성
		//syso + 컨트롤 스페이스 -> System.out.println();
		
		System.out.println("앙기모띠");
		System.out.println("김동현!!ㅁㅁㅁ");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		System.out.print("글자를 입력하세요 >>");
		// 2-2) 입력 받기
		sc.next();
		
		
	}

}
