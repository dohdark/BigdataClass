package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		//Student 자료형 stu1 객체 생성
		Student stu1 = new Student();
		
		stu1.setName("임경남");
		stu1.setNumber("20220458");
		stu1.setAge(20);
		stu1.setScoreJava(90);
		stu1.setScoreWeb(25);
		stu1.setScoreAndroid(50);
		
		//메소드 이름위에 마우스 올려서 포스트잇 모양이뜨면
		//초록색 동그라미 오른쪽에 있는 자료형이 리턴타입을 의미한다.
		System.out.println(stu1.getScoreJava());
		
		
		//Student 자료형 stu2 객체 생성
		Student stu2 = new Student("김동현","20242222",19);
		System.out.println(stu1.getAge());
		
		
	}

}
