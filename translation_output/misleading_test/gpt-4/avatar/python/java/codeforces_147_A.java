Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class PunctuationSpaceFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input:");
        String s = scanner.nextLine();
        String t = " ,.?!";
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            s = s.replace(Character.toString(c), c + " ▁ ");
        }
        
        s = String.join(" ▁ ", s.trim().split("\\s+"));
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            s = s.replace(" ▁ " + c, Character.toString(c));
        }
        
        System.out.println(s);
        scanner.close();
    }
}
```

To use this code, you would compile and execute the `PunctuationSpaceFormatter` class, then follow the instructions to enter your input. After typing the input, press Enter, and you will get the formatted output as expected.
