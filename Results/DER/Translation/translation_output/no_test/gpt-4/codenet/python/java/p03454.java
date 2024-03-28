Sure, here's the Python code translated to Java:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        final int MOD = 1000000007;
        int ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += Integer.toString(r).length();
            }
            if (tot == S) ans++;
            tot -= Integer.toString(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m != 0) ans++;
            else ans = (ans + (powMod(10, d, MOD) - powMod(10, d - 1, MOD) - cnt + 1)) % MOD;
            ans %= MOD;
        }

        System.out.println(ans % MOD);
        sc.close();
    }

    private static int powMod(int base, int exponent, int mod) {
        return BigInteger.valueOf(base).modPow(BigInteger.valueOf(exponent), BigInteger.valueOf(mod)).intValue();
    }
}
```

Please note the following changes:
- Replaced `xrange` with a simple Java for loop since Java doesn't have a direct `xrange` equivalent.
- Java I/O is used for reading input (`Scanner` class).
- The division and modulus operations have been adjusted to regular Java syntax.
- Since Java does not support a native power operation with a modulus, the `BigInteger` class's `modPow` method is used to compute the power under modulo.
- String operations in Java are used to calculate the lengths of numbers as strings.
- Wrapping up with printing to the console with `System.out.println`.
- The `%` operation is applied directly to the result before printing.
- The Java program includes the necessary imports and is wrapped in a class named `Solution` with a `main` method that is the entry point.
- The `Scanner` resource is closed explicitly after it is no longer needed.
