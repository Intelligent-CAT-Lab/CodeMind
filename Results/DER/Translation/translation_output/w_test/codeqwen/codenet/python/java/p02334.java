Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        System.out.println((p * pow(q, MOD - 2, MOD)) % MOD);
    }

    public static long pow(long base, long exponent, long mod) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            return pow(base * base % mod, exponent / 2, mod);
        } else {
            return base * pow(base * base % mod, (exponent - 1) / 2, mod) % mod;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the factorial of N and K, and then calculates the result of the formula. The pow function is a helper function that calculates the power of a number with a modulus. It uses the fast exponentiation algorithm to improve the performance.
