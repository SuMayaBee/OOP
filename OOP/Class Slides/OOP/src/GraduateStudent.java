
public class GraduateStudent extends Student {
	int meritPosition;
	GraduateStudent(String name, int roll, int regNo, int meritPosition) {
		super(name,roll,regNo);
		this.meritPosition = meritPosition;
	}
	
	void doThesis() {
		System.out.println("thesis done!");
	}
	void showIDCard() {
		super.showIDCard();
		System.out.println("merit position: " + this.meritPosition);
	}
}
