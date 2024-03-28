Here's the Python code translated into Java with a main method to read from standard input and produce the expected output:

```java
import java.util.Scanner;

public class NumberSignChecker {
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

The Java code takes two integers `a` and `b` as input, just like the Python code, and determines if the range of numbers between them (inclusive) is Positive, Negative, or contains a Zero just as the original Python code does. 

The `Scanner` class is used for input, and the logic is otherwise a direct translation from the given Python code. Note that `long` is used instead of `int` to accommodate the value `-1000000000` which is within the range of the integer type in both Python and Java.
