Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `K` from the user, then iterates over all possible triples `(a, b, c)` with `1 <= a, b, c <= K`, and adds the greatest common divisor of `(a, b)` and `c` to `ans`. Finally, it prints the value of `ans`.

The `gcd` function is a recursive function that calculates the greatest common divisor of two integers using the Euclidean algorithm.
