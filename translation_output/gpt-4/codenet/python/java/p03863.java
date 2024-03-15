Here's the converted Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0)
                || (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }

        scanner.close();
    }
}
```

Some key points to note in this conversion:

- In Java, we use `Scanner` to take input from the user.
- String indexing in Java is done through the `charAt()` method rather than square brackets `[]`.
- The `System.out.println()` method is used to print output to the console.
- Java code must be enclosed within a class, and the execution entry point is the `main` method.
- We need to close the `Scanner` after we are done using it to avoid resource leaks.
