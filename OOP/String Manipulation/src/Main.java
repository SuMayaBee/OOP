import java.util.*;

public class Main {
    public static void main(String[] args) {

      // Person person = new Person("John Doe", 35);
      // System.out.println(person.toString());

       // String numString = "12345";
       // int number = Integer.parseInt(numString);
       // System.out.println(number);

        //String text = "Hello";
        //char firstCharacter = text.charAt(0);
        //System.out.println(firstCharacter);

       // String text = "    The quick brown fox jumps over the lazy dog.    ";
       // int index = text.indexOf("brown");
       // System.out.println(index);
       // String mtext = text.replace("brown", "red");
       // System.out.println(mtext);
       // String mtext1 = mtext.trim();
       // System.out.println(mtext1);

        StringBuffer stringBuffer = new StringBuffer("The quick brown fox jumps over the lazy dog.");
        stringBuffer.append(" And so does the quick grey fox.");
        stringBuffer.insert(4, "lazy");
        stringBuffer.delete(30, 34);

        String result = stringBuffer.toString();
        System.out.println(result);

    }
}