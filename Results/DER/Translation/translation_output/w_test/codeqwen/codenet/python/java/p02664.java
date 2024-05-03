Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                chars[i] = 'D';
            }
        }

        String output = new String(chars);
        System.out.println(output);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, converts it to a character array, replaces all '?' characters with 'D', and then converts the character array back to a string and prints it.
