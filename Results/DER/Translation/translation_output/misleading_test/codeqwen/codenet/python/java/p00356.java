Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b - gcd(a, b) + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates their sum, subtracts the greatest common divisor (gcd) of the two numbers, and then adds 1 to the result. The gcd function is defined recursively, using the Euclidean algorithm.
