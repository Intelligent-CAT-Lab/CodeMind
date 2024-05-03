Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        if (firstChar == 'x' && lastChar == 'x') {
            System.out.println('x');
        } else {
            System.out.println('o');
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if the first and last characters are 'x', and prints 'x' if they are, otherwise it prints 'o'.
