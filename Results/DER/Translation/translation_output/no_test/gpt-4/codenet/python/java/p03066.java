Here is the equivalent Java code for the provided Python solution:

```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final int MOD = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();
        
        long[] fac = new long[N + 11];
        long[] inv = new long[N + 11];
        
        // Precompute factorials and inverses modulo MOD
        fac[0] = 1;
        for (int i = 1; i <= N + 10; i++) {
            fac[i] = fac[i - 1] * i % MOD;
        }
        
        // Fermat's Little Theorem for inverse: a^(MOD-2) is the inverse of a in modulo MOD space
        inv[N + 10] = BigInteger.valueOf(fac[N + 10]).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int i = N + 10; i > 0; i--) {
            inv[i - 1] = inv[i] * i % MOD;
        }
        
        long ans = 0;
        
        for (int two = 0; two <= N; two++) {
            for (int one = 0; one + two <= N; one++) {
                int dist = one + two * 2;
                long zero = modnCr(N, one + two, fac, inv);
                long now = 0;

                if (dist < X) {
                    now = modnCr(one + two, one, fac, inv) * zero % MOD;
                } else if (dist == X) {
                    continue;
                } else if (dist < 2 * X) {
                    if ((dist - X) % 2 == 0) {
                        continue;
                    }
                    int dtwo = two - (dist - X + 1);
                    if (dtwo >= 0) {
                        now = modnCr(one + dtwo, one, fac, inv) * zero % MOD;
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }

                ans = (ans + now) % MOD;
            }
        }

        System.out.println(ans);
    }
    
    // Helper function to compute nCr mod MOD using precomputed factorials and inverses
    public static long modnCr(int n, int r, long[] fac, long[] inv) {
        return fac[n] * inv[n - r] % MOD * inv[r] % MOD;
    }
}
```

This code uses the `BigInteger` class from the `java.math` package to calculate the modular inverse with `modInverse()` method, which is not achievable using the in-built arithmetic operators. Ensure to import the necessary Java libraries when compiling the code.
