package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// 1. Student 자료형을 보관할 수 있는 sList 라는 이름을 가진 ArrayList를 생성
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가(짝궁의 이름, 나이를 가지고 있는 데이터(Student)를 추가)
		// 3. 짝궁의 이름 출력!
//		Student std = new Student("박준범",26);
//		sList.add(std);
		sList.add(new Student("박준범",26));
		sList.add(new Student("박종현",23));
		sList.add(new Student("이지훈",22));
		sList.add(new Student("강아람",23));
		sList.add(new Student("이병헌",23));
		
		
		System.out.println(sList.get(0).getAge());
		System.out.println(sList.get(0).getName());
		System.out.println(sList.size());
		// 본질적으로 어떤 자료형인지 확인할 것!!
		// sList.get(0) --> return type : Student 객체
		
		
		System.out.println("=== 팀원 정보 ===");
		for(Student i : sList) {
			System.out.println(i.getName()+"\t"+i.getAge());
		}
		
	}

}
