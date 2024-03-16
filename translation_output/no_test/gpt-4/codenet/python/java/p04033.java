Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 && 0 <= b) {
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

        scanner.close();
    }
}
```

I've converted the lambda expressions into direct use of a `Scanner` object for reading inputs in Java, and the logic of the conditionals remains the same, just adapted to Java syntax. Make sure to include appropriate imports and place the code inside a class when using it in a Java environment.
