package 월급계산프로그램;

public abstract class Employee {
	
	// 접근제한자 private < default < protected < public
	
	protected String empno; // 사번
	protected String name;  // 이름
	protected int pay;	  // 연봉
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	
	protected abstract int getMoneyPay();
	
	protected String print() {
		return empno+":"+name+":"+pay;
	}
	
	
}
