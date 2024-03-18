Here's the translated Python code into Java:

```java
import java.util.Scanner;

public class CombinationModulo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = p * (N + K - 1 - i) % MOD;
            q = q * (i + 1) % MOD;
        }

        long result = p * modInverse(q, MOD) % MOD;

        System.out.println(result);
    }

    private static long modInverse(long a, int m) {
        return power(a, m - 2, m);
    }

    private static long power(long x, int y, int m) {
        if (y == 0)
            return 1;
        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        return (y % 2 == 0) ? p : (x * p) % m;
    }
}
```

This Java program captures user input for `N` and `K`, then calculates the combination modulo `MOD` using the same approach as in the Python code. Here, `modInverse` function uses Fermat's Little Theorem for modulo inverse under mod `MOD` assuming `MOD` is prime, which is the same as `pow(q, MOD-2, MOD)` in the Python code. The `power` function calculates the exponentiation under the `MOD` modulo. Make sure to import `java.util.Scanner` for reading the input.
