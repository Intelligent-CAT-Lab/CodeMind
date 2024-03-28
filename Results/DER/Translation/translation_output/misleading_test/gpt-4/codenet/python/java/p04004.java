Here is the Python code translated to Java. Due to the complexity and specificity of the code (such as dependencies on NumPy and Python's big integers), the translation is not straightforward. Java does not have a direct equivalent to NumPy, and I had to adapt the code for bigint arithmetic and arrays operations. Moreover, some utility functions had to be created to emulate the NumPy behavior such as cumprod function.

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;
    private static final int U = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        BigInteger[] power2 = makePower(BigInteger.valueOf(2), U, MOD);
        BigInteger[] power2Inv = makePower(BigInteger.valueOf(2).modInverse(BigInteger.valueOf(MOD)), U, MOD);
        BigInteger[] power3 = makePower(BigInteger.valueOf(3), U, MOD);
        BigInteger[] power3Inv = makePower(BigInteger.valueOf(3).modInverse(BigInteger.valueOf(MOD)), U, MOD);
        BigInteger[] fact = makeFact(U);
        BigInteger[] factInv = makeFactInv(fact, MOD);

        BigInteger[] x = new BigInteger[N + M];
        for (int i = 0; i < x.length; i++) x[i] = BigInteger.ZERO;

        for (int i = 1; i <= N + M - 1; i++) {
            x[i] = BigInteger.valueOf(-1)
                .multiply(power2[i - 1])
                .multiply(power3Inv[K + i])
                .mod(BigInteger.valueOf(MOD))
                .multiply(fact[K + i])
                .multiply(factInv[K])
                .multiply(factInv[i])
                .mod(BigInteger.valueOf(MOD));
        }

        x[0] = BigInteger.valueOf(3)
            .multiply(BigInteger.ONE.subtract(power3Inv[K + 1]))
            .mod(BigInteger.valueOf(MOD))
            .multiply(power2Inv[1])
            .mod(BigInteger.valueOf(MOD));

        BigInteger s = BigInteger.ZERO;
        for (int i = 0; i < x.length; i++) {
            s = s.add(x[i]).mod(BigInteger.valueOf(MOD));
            x[i] = s;
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = x[i].multiply(power3[i])
                .multiply(power2Inv[i])
                .mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] coef = new BigInteger[M + 1];
        for (int i = 0; i <= M; i++) {
            coef[i] = fact[N - 1 + i]
                .multiply(factInv[i])
                .multiply(factInv[N - 1])
                .mod(BigInteger.valueOf(MOD))
                .multiply(power3[K + M - i].mod(BigInteger.valueOf(MOD)));
        }

        BigInteger answer = BigInteger.ZERO;
        for (int i = 0; i <= M; i++) {
            answer = answer.add(coef[i].multiply(x[N - 1 + i]).mod(BigInteger.valueOf(MOD)));
        }
        answer = answer.mod(BigInteger.valueOf(MOD));

        System.out.println(answer);
    }

    private static BigInteger[] makeFact(int U) {
        BigInteger[] fact = new BigInteger[U + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        return fact;
    }

    private static BigInteger[] makeFactInv(BigInteger[] fact, int MOD) {
        BigInteger[] factInv = new BigInteger[fact.length];
        factInv[fact.length - 1] = fact[fact.length - 1].modInverse(BigInteger.valueOf(MOD));
        for (int i = fact.length - 2; i >= 0; i--) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }
        return factInv;
    }

    private static BigInteger[] makePower(BigInteger a, int L, int MOD) {
        int B = Integer.toBinaryString(L).length();
        BigInteger[] x = new BigInteger[1 + (1 << B)];
        x[0] = BigInteger.ONE;
        x[1] = a.mod(BigInteger.valueOf(MOD));

        for (int n = 1; n < B; n++) {
            for (int m = 0; m < (1 << n); m++) {
                x[(1 << n) + m] = x[m]
                    .multiply(a.multiply(x[(1 << n) - 1]).mod(BigInteger.valueOf(MOD)))
                    .mod(BigInteger.valueOf(MOD));
            }
        }
        return x;
    }
}
```

This Java code expects an input in the format `1 1 1` exactly as the Python code did. Please be aware that this translation may have performance issues since Java's BigInteger class is much slower than Python's native integer arithmetic and NumPy's optimized operations for large arrays.
