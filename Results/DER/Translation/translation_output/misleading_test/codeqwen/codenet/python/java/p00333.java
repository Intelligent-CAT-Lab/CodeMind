Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        int g = gcd(W, H);
        System.out.println(W*H*C/(g*g));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
```

This Java program does the same thing as your Python code. It reads three integers from the user, calculates the greatest common divisor (gcd) of the first two integers, and then prints the product of the three integers divided by the square of the gcd. The gcd function is defined recursively, using the Euclidean algorithm.
