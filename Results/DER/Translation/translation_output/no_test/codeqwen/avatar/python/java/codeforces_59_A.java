Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String out = " ";
        int cap = 0;
        int small = 0;
        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small += 1;
            } else {
                cap += 1;
            }
        }
        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out += Character.toLowerCase(t);
            }
        } else {
            for (char t : txt.toCharArray()) {
                out += Character.toUpperCase(t);
            }
        }
        System.out.println(out);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of uppercase and lowercase characters, and then converts the string to either all uppercase or all lowercase based on the counts. The `Character.isLowerCase(t)` and `Character.toLowerCase(t)` methods are used to check if a character is lowercase and to convert a character to lowercase, respectively. The `Character.toUpperCase(t)` method is used to convert a character to uppercase.
