package 학생정보관리프로그램;

public class Student {

	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	// getter 메소드 --> 클래스 내부에 있는 필드 값을 외부(다른클래스)로
	// 가져 갈 수 있는 메소드
	// setter 메소드 --> 클래스 내부에 있는 필드 값을 외부에서 수정...
	// (alt + shift + s) + r + (alt + a) + (alt + s)+Enter
	
	
	//생성자 (constructor) --> 객체를 생성하는 순간에 실행되는 메소드
	// 필드에 있는 데이터를 객체를 생성하는 순간에 초기화
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	public Student(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}

	
}
