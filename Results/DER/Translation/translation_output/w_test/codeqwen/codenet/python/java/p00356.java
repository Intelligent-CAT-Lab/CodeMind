Here is the Java equivalent of the Python code you provided:

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

This Java program does the same thing as your Python code. It reads two integers from the user, calculates their greatest common divisor (gcd), and then prints the sum of the two numbers, minus the gcd, plus one. The gcd function is a recursive function that calculates the greatest common divisor of two numbers using the Euclidean algorithm.
