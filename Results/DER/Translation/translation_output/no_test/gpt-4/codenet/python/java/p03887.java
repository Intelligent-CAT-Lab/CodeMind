Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000007;
    private static long[] FACT;
    private static long[] INVERSE_FACT;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        FACT = new long[n + 1];
        INVERSE_FACT = new long[n + 1];
        FACT[0] = 1;
        INVERSE_FACT[0] = 1;

        for (int i = 1; i <= n; i++) {
            FACT[i] = FACT[i - 1] * i % MOD;
            INVERSE_FACT[i] = inverse(FACT[i]);
        }

        long ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            return;
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= (c - y) / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0) {
                    continue;
                }

                long cur_ans = FACT[x + y + z] * INVERSE_FACT[x] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[y] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[z] % MOD;
                cur_ans = cur_ans * comb(x + y + z + (b / 2) + 1 - 1, b / 2) % MOD;
                cur_ans = cur_ans * comb((b / 2) + rest3 - 1, rest3) % MOD;

                ans = (ans + cur_ans) % MOD;
            }
        }

        System.out.println(ans);
    }

    private static long inverse(long k) {
        return fastPow(k, MOD - 2);
    }

    private static long comb(int n, int k) {
        return FACT[n] * INVERSE_FACT[n - k] % MOD * INVERSE_FACT[k] % MOD;
    }

    private static long fastPow(long x, long y) {
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2) % MOD;
        p = p * p % MOD;
        if (y % 2 == 1) {
            p = p * x % MOD;
        }
        return p;
    }
}
```

In this Java translation of your Python code:
- Arrays are used to represent the factorial and inverse factorial values.
- The modulo arithmetic is identical to the Python version, applying `% MOD` for each operation.
- Methods `inverse`, `comb`, and `fastPow` are translated closely to their Python equivalents.
- The main computation loop is wrapped in a `main` method, as it is the entry point of a Java program.
- A `Scanner` is used for input operations.
- The program uses `System.out.println` to output the result.

Please note that this translated Java code assumes that the necessary values for `n`, `a`, `b`, and `c` are correctly input without validation. Additionally, all integer variable types are presumed big enough to hold the computations. If very large numbers are expected beyond `int` type limits, `long` should be used.
