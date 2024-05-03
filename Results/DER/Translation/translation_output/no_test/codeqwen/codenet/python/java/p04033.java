Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 && b <= 0) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else if ((b - a + 1) % 2 == 0) {
                System.out.println("Positive");
            }
        } else if (0 < a) {
            System.out.println("Positive");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks the conditions, and prints the result.
