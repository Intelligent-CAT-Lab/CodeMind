Here is the equivalent Java implementation of the given Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        BigInteger[] fact = new BigInteger[N + 1];
        BigInteger[] frev = new BigInteger[N + 1];
        BigInteger[] dp = new BigInteger[N + 1];

        fact[0] = BigInteger.ONE;
        frev[0] = BigInteger.ONE;
        dp[0] = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            frev[i] = fact[i].modInverse(BigInteger.valueOf(MOD));
        }

        BigInteger[] Y = new BigInteger[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            for (int j = C; j <= Math.min(D, N / g); j++) {
                if (p <= N) {
                    Y[p] = frev[g].modPow(BigInteger.valueOf(j), BigInteger.valueOf(MOD))
                                    .multiply(frev[j]).mod(BigInteger.valueOf(MOD));
                    p += g;
                    if (p > N) break;
                }
            }

            for (int i = p; i <= N; i += g) {
                BigInteger sum = BigInteger.ZERO;
                for (int j = p; j <= Math.min(q, i); j += g) {
                    if (Y[j] != null) {
                        sum = sum.add(
                                dp[i - j].multiply(fact[N - i + j]).multiply(Y[j])
                        ).mod(BigInteger.valueOf(MOD));
                    }
                }
                dp[i] = dp[i].add(frev[N - i].multiply(sum)).mod(BigInteger.valueOf(MOD));
            }
        }

        System.out.println(dp[N].mod(BigInteger.valueOf(MOD)));
        scanner.close();
    }
}
```

This Java code implements the same algorithm and logic used in the Python code. The core functionality, like modular arithmetic and the dynamic programming approach used to solve the problem, should be the same, but the syntax and certain methods might differ to align with Java's standards and libraries, such as using `BigInteger` for big integer arithmetic.

Please ensure to provide the required inputs exactly as expected (e.g., on one line separated by spaces), since the code expects input in this format. Note that the performance may vary substantially from Python due to difference in BigInteger implementations and general language performance characteristics.
