
import java.util.*;

public class UniversityTest {

    public static void main(String[] args) {
        Person p1 = new Person("Elon", "Musk", 22);
        Person p2 = new Student("Selena", "Gomez", 11);
        Person p3 = new Employee("Sumaiya", "Islam", 2);
        Person p4 = new Employee("Nahian", "Sheikh", 20);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        University u1 = new University(list);
        System.out.println(list.get(1).getFullName());
        System.out.println(u1.getNumberOfEmployees());
        System.out.println(u1.getYoungestPerson().getFullName());
        System.out.println(u1.getOldestPerson().getFullName());
        System.out.println(u1.getFullNames());
    }

}