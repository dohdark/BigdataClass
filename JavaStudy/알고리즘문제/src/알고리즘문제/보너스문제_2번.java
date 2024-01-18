package 알고리즘문제;

public class 보너스문제_2번 {

	public static void main(String[] args) {
		// 제한시간 : 10분
		// 획득점수 : 30점

		System.out.println(getMiddle("power"));

	}

	public static String getMiddle(String input) {
        int length = input.length();
        int middleIndex = length / 2;
        
        if (length % 2 == 0) {
            // 문자열 길이가 짝수인 경우 length
            return input.substring(middleIndex - 1, middleIndex + 1);
        } else {
            // 문자열 길이가 홀수인 경우
            return input.substring(middleIndex, middleIndex + 1);
        }
    }
}
