import java.util.ArrayList;

public class MyMain {
	public static void main(String args[]) {
//		ArrayList<Person> persons = new ArrayList<>();
//		Person p1 = new Person("mou",45,"dhaka");
//		Person p2 = new Person("nandan",35,"barishal");
//		persons.add(p1);
//		persons.add(p2);
//		ISearcher isearcher = new AgeSearcher();
//		for(int i=0;i<persons.size();i++) {
//			if(isearcher.checkCondition(persons.get(i))) {
//				System.out.println(persons.get(i).firstName);
//			}
//		}
		Circle c1 = new Circle();
		System.out.println(c1.pi);
		Circle.pi = 3.1416;
		System.out.println(c1.pi);
		Circle c2 = new Circle();
		System.out.println(c2.pi);
		Circle.printMethod();
		hello();
	}
	static void hello() {
		System.out.println("hi");
	}
}
