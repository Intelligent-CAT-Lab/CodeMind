Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        scanner.close();
        System.out.println(main(a, b, c, d));
    }

    public static int main(int a, int b, int c, int d) {
        int lcm = c * d / gcd(c, d);
        return b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the least common multiple (LCM) of the two numbers `c` and `d`, and then calculates the number of integers between `a` and `b` (inclusive) that are not divisible by either `c` or `d` but are divisible by the LCM. The `gcd` function is a helper function that calculates the greatest common divisor of two integers using the Euclidean algorithm.
