Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int M = 998244353;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        F[0] = 1;
        
        // Calculate factorials and their modular inverses
        for (int n = 1; n < P; n++) {
            f = f * n % M;
            F[n] = f;
        }

        // Modular inverse using Fermat's Little Theorem
        I[N] = pow(f, M - 2, M);
        for (int n = N; n > 0; n--) {
            I[n - 1] = I[n] * n % M;
        }

        // Calculate the result
        for (int k = 0; k < Math.min(A + 1, N - B); k++) {
            if (N - B - A < 0 && k >= A + 1) break;
            long Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] % M * I[k] % M * F[Q + A - k] % M * I[Q] % M * I[A - k] % M;
            z %= M;
        }

        System.out.println(B == 0 ? 1 : z % M);
    }

    // Method to calculate power with modular arithmetic (iterative version of binary exponentiation)
    private static long pow(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}
```
