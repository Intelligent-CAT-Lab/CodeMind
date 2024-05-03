Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        System.out.println((N - gcd(N, X)) * 3);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the greatest common divisor (gcd) of the two numbers, and then prints the result. The gcd function is implemented using the Euclidean algorithm.
