Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if it is "AAA" or "BBB", and prints "No" if it is, and "Yes" otherwise.
