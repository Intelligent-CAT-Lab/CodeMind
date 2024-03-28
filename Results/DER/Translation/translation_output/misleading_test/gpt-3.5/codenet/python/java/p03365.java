```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        long[] fact = new long[n + 1];
        long[] ifact = new long[n + 1];
        fact[0] = 1;
        ifact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            ifact[i] = pow(fact[i], MOD - 2, MOD);
        }

        System.out.println(solve(n, fact, ifact));
    }

    static long pow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    static long nCk(int n, int k, long[] fact, long[] ifact) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n - k] % MOD * ifact[k] % MOD) % MOD;
    }

    static long solve(int n, long[] fact, long[] ifact) {
        long ans = 0;
        long c0 = 0;
        for (int i = n/2; i < n; i++) {
            long c1 = ((nCk(i - 1, n - 1 - i, fact, ifact) * fact[i] % MOD) * fact[n - i - 1] % MOD - c0 + MOD) % MOD;
            ans = (ans + c1 * i) % MOD;
            c0 = (c0 + c1) % MOD;
        }
        return ans;
    }
}
```

