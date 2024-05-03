Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        if (firstChar == lastChar) {
            if (s.length() % 2 == 1) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        } else {
            if (s.length() % 2 == 1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if the first and last characters are the same, and then determines the winner based on the length of the string.
