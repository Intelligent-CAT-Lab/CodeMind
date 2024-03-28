Here is the corresponding Java code for the given Python code with the same functionality:

```java
import java.util.Scanner;

// Java has no built-in modulo inversion method, so we'll need to provide our own.
class ModMath {
    static final long MOD = 998244353;

    static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            // q is quotient
            long q = a / m;
            long t = m;

            // m is remainder now, process same as Euclid's algo
            m = a % m;
            a = t;
            t = y;

            // Update y and x
            y = x - q * y;
            x = t;
        }

        // Make x positive
        if (x < 0)
            x += m0;

        return x;
    }

    static long[] getInv(int N) {
        long[] inv = new long[N + 1];
        inv[1] = 1;

        for (int i = 2; i <= N; i++) {
            inv[i] = modInverse(i, MOD) % MOD;
        }

        return inv;
    }

    static long[] getCmb(int N) {
        long[] inv = getInv(N);
        long[] nCr = new long[N + 1];
        nCr[0] = 1;

        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) % MOD * inv[i]) % MOD;
        }

        return nCr;
    }

    static long solve(int N, int A, int B, int K) {
        long ans = 0;
        long[] nCr = getCmb(N);
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if (A * a + B * b == K && 0 <= b && b <= N) {
                ans = (ans + (nCr[a] * nCr[b]) % MOD) % MOD;
            }
        }
        return ans;
    }
}

public class CombinationSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(ModMath.solve(N, A, B, K));
    }
}
```

This Java code performs the same calculations as the provided Python code. It reads four integer values from the standard input, uses those to compute a certain value based on combinations and modular arithmetic, and prints the result to the standard output.
