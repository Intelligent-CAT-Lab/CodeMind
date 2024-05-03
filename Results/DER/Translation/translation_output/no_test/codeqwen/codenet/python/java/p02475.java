Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

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

This Java code does the same thing as your Python code. It reads two integers from the user, then calls the `round` function with these two integers as arguments. The `round` function works the same way as your Python function. It checks if the product of `a` and `b` is negative. If it is, it returns the negative of the integer division of `a` by `b`. If it's not, it returns the integer division of `a` by `b`. The result is then printed to the console.
