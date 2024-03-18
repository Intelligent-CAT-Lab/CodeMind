Here's the above Python code translated into Java. Please note that in Java you need to handle user input and exception handling. For simplicity, I'm assuming the user input is correctly formatted as per your test case.

```java
import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

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

Please note that I've changed the input variables from `int` to `long` in order to accommodate the large input values in the test case. Additionally, in Java, the `System.in` is used along with a `Scanner` to read input from the user.

The test input you provided (-1000000000 -1) should produce the following output according to your input and the logic of the translated code:

Expected output:
```
Positive
```
