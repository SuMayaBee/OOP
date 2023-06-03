
import java.util.*;

public class University {
    private ArrayList<Person> list;
    public University(ArrayList<Person> persons) {
        this.list = persons;
        Collections.sort(this.list, Comparator.comparingInt(Person::getAge));
    }

    public String getFullNames() {
        StringBuilder sb = new StringBuilder();
        for (Person person : list) {
            sb.append(person.getFullName()).append(", ");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }


    public Person getOldestPerson() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public Person getYoungestPerson() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public ArrayList<Person> getVoters() {
        ArrayList<Person> canVote = new ArrayList<Person>();
        for (Person x : list) {
            if (x.canVote())
                canVote.add(x);
        }
        return canVote;
    }

    public int getNumberOfEmployees() {
        int count = 0;
        for (Person p : list) {
            if (p.getFullName().contains("Employee"))
                count++;
        }
        return count;
    }
}