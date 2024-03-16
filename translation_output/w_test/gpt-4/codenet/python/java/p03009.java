Here's the translated code from Python to Java. This code assumes that you are entering from the standard input, for example, through the command line:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();
        int D = input.nextInt();
        final int MOD = 1000000007;

        long[] fact = new long[N + 1];
        long[] fact_cum = new long[N + 1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }

        long[] ap = new long[H + 1];
        long[] ap_cum = new long[H + 1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
                if (x < 0) {
                    x += MOD;
                }
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n - 1] + x) % MOD;
        }

        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= modInverse(fact_cum[N], MOD);
        ans %= MOD;

        System.out.println(ans);
        input.close();
    }

    // Function to compute modular multiplicative inverse using Fermat's little theorem
    public static long modInverse(long a, int m) {
        return power(a, m - 2, m);
    }

    // Function to compute a^b mod m
    public static long power(long a, long b, int m) {
        a %= m;
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }
}
```

Please note that the `modInverse` function uses Fermat's little theorem, which only works when `m` is prime, for finding the modular multiplicative inverse of `fact_cum[N]` in the modulo `MOD`. The `power` method implements modular exponentiation.
