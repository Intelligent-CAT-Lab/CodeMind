Here is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && Math.min(b - a, -a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

        scanner.close();
    }
}
```

This Java program achieves the same result as the given Python code. It takes two integers as input and checks the conditions to print "Zero", "Negative", or "Positive". Note that Java requires explicit variable declarations and does not support multiple assignments in the way Python does with `a, b = ...`. Instead, each variable must be assigned individually. Also, Java needs an explicit import of the `Scanner` class for taking inputs, and it also requires the main method to be enclosed in a class.
