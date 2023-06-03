import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      String[] array = input.split(",");
      ArrayList<String> abc = new ArrayList<>(Arrays.asList(array));

      String name = abc.get(0).strip();
      String email = abc.get(1).strip();
      String phone = abc.get(2).strip();
      String m = String.format("Customer Name: %s\nEmail Address: %s\nPhone Number: %s", name, email, phone);
      System.out.println(m);

    }
}