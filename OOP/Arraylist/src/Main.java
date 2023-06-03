import java.util.*;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> nameList = new ArrayList<String>();
      nameList.add("Jhon");
      nameList.add("Mary");
      nameList.add("Peter");
      System.out.println("Size " + nameList.size());
      System.out.println("1: "+ nameList.get(1));
      nameList.set(1, "David");
      System.out.println("1: "+ nameList.get(1));
      nameList.remove(2);

      String[] namesArray = nameList.toArray(new String[0]);
      System.out.println("List: " + nameList);
      System.out.println("Array: " + Arrays.toString(namesArray));


    }
}