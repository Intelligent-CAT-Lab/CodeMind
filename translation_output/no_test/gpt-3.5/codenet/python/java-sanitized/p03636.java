import java.util.List;
import java.util.ArrayList;

public class p03636 {
    public static void main(String[] args) {
        /* Assuming input is a string */
        String input = "example";
        char[] charArray = input.toCharArray();
        
        char a = charArray[0];
        List<Character> b = new ArrayList<>();
        for (int i = 1; i < charArray.length - 1; i++) {
            b.add(charArray[i]);
        }
        char c = charArray[charArray.length - 1];

        System.out.println(a + b.size() + c);
    }
}