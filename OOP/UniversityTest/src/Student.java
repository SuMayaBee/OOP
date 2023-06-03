

public class Student extends Person{

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    @Override
    public String getFullName() {
        return String.format("%s, %s", super.getLastName(), super.getFirstName());
    }

}