

public class Employee extends Person{

    public Employee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    @Override
    public String getFullName() {
        return String.format("%s %s %s", super.getFirstName(), super.getLastName(), "(Employee)");
    }

}