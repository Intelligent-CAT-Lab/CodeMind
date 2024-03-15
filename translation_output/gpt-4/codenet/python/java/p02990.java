Below is the translated Java code, encapsulated in Java syntax:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        input.close();

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                long ans = comb(N - K + 1, i, MOD) * between(N, K, i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    private static long comb(int n, int r, int mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) % mod;
            res = res * BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(mod)).longValue() % mod;
        }
        return res;
    }
}
```
Please note the following details in the translation:
1. We're using `BigDecimal` for the modular inverse calculation since Java doesn't have a built-in equivalent of Python's `pow` for modular inverses.
2. The `scanner` object is used to read inputs from the command line.
3. The `comb` and `between` functions have been translated to private static methods.

Make sure to include the import statements necessary for `Scanner` and `BigInteger` classes at the top of the code. Also, keep in mind that the recursion in the Python code is not handled in the Java code because the equivalent Java recursive stack implementation may lead to a `StackOverflowError` if the input is large. Java typically uses iterative approaches for such cases or increases the stack size if recursion is necessary.
