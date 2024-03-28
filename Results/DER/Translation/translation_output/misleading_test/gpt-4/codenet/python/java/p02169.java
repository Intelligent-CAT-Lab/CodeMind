Here's the translated Java code, which performs the same calculations. Please note that the input reading and handling parts might need to be adjusted according to how you want to use the Java program. For simplicity, I'll use Scanner for reading input in this example:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(solve(m, n, k));
    }

    private static int solve(int m, int n, int k) {
        if (n < k || m < k) {
            return 0;
        }

        BigInteger ans = BigInteger.valueOf(m).modPow(BigInteger.valueOf(n), BigInteger.valueOf(mod));
        BigInteger[] p = new BigInteger[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = BigInteger.valueOf(i).modPow(BigInteger.valueOf(n), BigInteger.valueOf(mod));
        }

        BigInteger c = BigInteger.valueOf(m);
        BigInteger[][] comb = new BigInteger[k + 1][];
        for (int i = 0; i <= k; i++) {
            comb[i] = new BigInteger[i + 1];
            for (int j = 0; j <= i; j++) {
                comb[i][j] = BigInteger.ZERO;
            }
        }

        comb[0][0] = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i + 1][j] = comb[i + 1][j].add(comb[i][j]);
                if (j + 1 <= i) {
                    comb[i + 1][j + 1] = comb[i + 1][j + 1].add(comb[i][j]);
                }
            }
        }

        for (int i = 1; i < k; i++) {
            BigInteger innerSum = BigInteger.ZERO;
            for (int j = i; j >= 1; j--) {
                BigInteger sign = (i + j) % 2 == 0 ? BigInteger.ONE : BigInteger.valueOf(-1);
                innerSum = innerSum.add(sign.multiply(comb[i][j]).multiply(p[j]));
            }

            innerSum = innerSum.multiply(c).mod(BigInteger.valueOf(mod));
            c = c.multiply(BigInteger.valueOf(m - i)).multiply(inverse(BigInteger.valueOf(i + 1)))
                    .mod(BigInteger.valueOf(mod));

            ans = ans.subtract(innerSum).add(BigInteger.valueOf(mod)).mod(BigInteger.valueOf(mod));
        }

        return ans.intValue();
    }

    private static BigInteger inverse(BigInteger x) {
        return x.modPow(BigInteger.valueOf(mod - 2), BigInteger.valueOf(mod));
    }
}
```

**Note**:
- Java does not have a built-in modular exponentiation for `int` types, so the `modPow` function from `BigInteger` is used instead.
- The modular inverse function uses `modPow` since `mod` is prime and Fermat's little theorem can be applied. (`a^(p-2) % p` is the modular inverse of `a` with respect to prime `p`).
- The code assumes that the actual reading of the input and the printing of the output will be handled outside of the `solve` function. Thus, we call `solve` with the input values and then print the result.
- Java code uses zero-based indexing for arrays, unlike Python's one-based indexing for lists. Adjustments have been made accordingly.
- Python's `print` automatically converts the value to a string and prints it, while in Java, a call to `System.out.println()` is made to print the integer value.
- I've replaced array handling with `BigInteger` to deal with bigint operations directly. This avoids manual modular arithmetic and keeps the code clean.
- Variable `k` inside the loop has been renamed to `innerSum` to avoid naming conflicts.
- The program expects the standard input to follow the sample test case formatting ("2 10 1"). Adjustments may be required for different input formats.

Ensure this Java code is run within a class structure as per Java's requirements and that it's properly compiled and executed within a Java environment.
