
public class Student {
	private String name;
	private int roll;
	private int age;
	private int regNo;
	double cgpa;
	
	public Student(String name, int roll, int regNo) {
		this.name = name;
		this.roll = roll;
		this.regNo = regNo;
	}

	void submitAssignment() {
		System.out.println("assignment submitted");
	}
	void showIDCard() {
		System.out.println("name: " + this.name);
		System.out.println("reg no: " + this.regNo);
	}
}
