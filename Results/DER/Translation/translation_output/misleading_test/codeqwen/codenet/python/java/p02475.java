Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then calls the `round` method with these two integers as arguments. The `round` method works the same way as your Python code: if the product of `a` and `b` is negative, it returns the integer part of the negative quotient of `a` divided by `b` (which is calculated using the unary `-` operator to negate the quotient). Otherwise, it returns the integer part of the quotient of `a` divided by `b`. The result is then printed to the console.
