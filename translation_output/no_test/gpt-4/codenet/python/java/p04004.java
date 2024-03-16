The Python code you've provided appears to use the `numpy` library for array manipulations and mathematical operations, which doesn't have a direct equivalent in Java. However, we can rewrite it using pure Java, accounting for the lack of similar Python numeric features like broadcasting and vectorized operations.

Here is the rewritten Java code. Please note that Java doesn't have native support for large integer arithmetic, so the solution below implements its own modular arithmetic methods, and it will be significantly more verbose and complex than the Python version.

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final int MOD = 1000000007;
    private static final int U = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        long[] power2 = makePower(2, U, MOD);
        long[] power2_inv = makePower(BigInteger.valueOf(2).modInverse(BigInteger.valueOf(MOD)).intValue(), U, MOD);
        long[] power3 = makePower(3, U, MOD);
        long[] power3_inv = makePower(BigInteger.valueOf(3).modInverse(BigInteger.valueOf(MOD)).intValue(), U, MOD);
        long[] fact = new long[U];
        long[] fact_inv = new long[U];
        long[] temp = makeFact(U, MOD);
        fact = temp.clone();
        temp = makeFactInv(temp, U, MOD);
        fact_inv = temp.clone();

        long[] x = new long[N + M];
        for (int i = 1; i < x.length; i++) {
            x[i] = multiplyMod(-power2[i - 1], multiplyMod(power3_inv[i + K], multiplyMod(fact[i + K], multiplyMod(fact_inv[K], fact_inv[i], MOD), MOD), MOD), MOD);
            if (x[i] < 0) x[i] += MOD;
        }
        x[0] = multiplyMod(3, (1 - power3_inv[K + 1] + MOD) % MOD, MOD);
        x[0] = multiplyMod(x[0], power2_inv[1], MOD);

        for (int i = 1; i < x.length; i++) {
            x[i] = (x[i] + x[i - 1]) % MOD;
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = multiplyMod(multiplyMod(x[i], power3[i], MOD), power2_inv[i], MOD);
        }

        long[] coef = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            coef[i] = multiplyMod(
                    multiplyMod(
                            multiplyMod(fact[N + i - 1], fact_inv[i], MOD),
                            fact_inv[N - 1], MOD),
                    power3[K + M - i], MOD);
        }

        long answer = 0;
        for (int i = 0; i <= M; i++) {
            answer = (answer + multiplyMod(coef[i], x[N + i - 1], MOD)) % MOD;
        }

        System.out.println(answer);
    }

    private static long multiplyMod(long a, long b, int mod) {
        return ((a % mod) * (b % mod)) % mod;
    }

    private static long[] makePower(long a, int L, int MOD) {
        int B = Integer.SIZE - Integer.numberOfLeadingZeros(L);
        long[] x = new long[1 + (1 << B)];
        x[0] = 1; x[1] = a;
        for (int n = 1; n < B; n++) {
            for (int i=0; i < (1 << n); i++) {
                x[(1 << n) + i] = multiplyMod(x[i], a * x[(1 << n) - 1] % MOD, MOD);
            }
        }
        return x;
    }

    private static long[] makeFact(int U, int MOD) {
        long[] fact = new long[U];
        fact[0] = 1;
        for (int i = 1; i < U; i++){
            fact[i] = multiplyMod(fact[i - 1], i, MOD);
        }
        return fact;
    }

    private static long[] makeFactInv(long[] fact, int U, int MOD) {
        long[] fact_inv = new long[U];
        fact_inv[U - 1] = BigInteger.valueOf(fact[U - 1]).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int i = U - 2; i >= 0; i--) {
            fact_inv[i] = multiplyMod(fact_inv[i + 1], i + 1, MOD);
        }
        return fact_inv;
    }
}
```

Please note that I've utilized `BigInteger` for calculating modular inverses, as Java lacks a built-in method to calculate modular multiplicative inverses for large numbers.

This Java code aims to replicate the functionality of the Python version while not being a direct line-for-line translation, due to the differences in language capabilities, especially when handling arrays and mathematical operations. It includes input reading via `Scanner` and avoids `numpy` by using loops and manual array operations. The arithmetic operations are handled in a safe manner to account for modularity.
