Here's the Python code converted to Java:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();
        int D = input.nextInt();
        final int MOD = 1000000007;

        BigInteger[] fact = new BigInteger[N + 1];
        BigInteger[] fact_cum = new BigInteger[N + 1];
        fact[0] = BigInteger.ONE;
        fact_cum[0] = BigInteger.ZERO;

        for (int i = 1; i <= N ; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            fact_cum[i] = fact_cum[i-1].add(fact[i]).mod(BigInteger.valueOf(MOD));
        }

        long[] ap = new long[H + 1];
        long[] ap_cum = new long[H + 1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n-1];
            if (n > D) {
                x -= ap_cum[n-D-1];
                x += MOD;
            }
            x = (x * fact_cum[N].longValue()) % MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n-1] + x) % MOD;
        }

        long ans = ap[H];
        ans = (ans * fact[N].longValue()) % MOD;
        ans = (ans * fact_cum[N].modInverse(BigInteger.valueOf(MOD)).longValue()) % MOD;

        System.out.println(ans);
        input.close();
    }
}
```

Several considerations had to be taken into account:

1. We need to import `Scanner` to read the input from the user.
2. Java doesn't have a direct equivalent to Python's `pow` with a modulus, a functionality which is provided by `BigInteger`'s `modInverse` for calculating the modular inverse and `mod` for the modular operation.
3. Since we are working with big numbers and modular arithmetic, we need to use `BigInteger` for the factorial array to avoid integer overflow and precision loss.
4. Arrays in Java need to be initialized explicitly, compared to Python's dynamic list handling.
5. Java needs explicit handling of the remainder operation to ensure it doesn't go below zero, while in Python the `%` operation inherently assures that the result will always be non-negative.
