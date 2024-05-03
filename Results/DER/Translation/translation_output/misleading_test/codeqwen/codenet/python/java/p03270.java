Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 998244353;
    static final int U = 10000;
    static int[] fact = new int[U + 1];
    static int[] fact_inv = new int[U + 1];

    static {
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (int) ((long) fact[n - 1] * n % MOD);
        }
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U - 1; n >= 0; n--) {
            fact_inv[n] = (int) ((long) fact_inv[n + 1] * (n + 1) % MOD);
        }
    }

    static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % MOD;
    }

    static int pow(int base, int exp, int mod) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (int) ((long) result * base % mod);
            }
            base = (int) ((long) base * base % mod);
            exp >>= 1;
        }
        return result;
    }

    static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = (int) ((long) sum + comb(x, i) * pow(2, i, MOD) * comb(N + y - 1, i + y - 1) % MOD);
            sum %= MOD;
        }
        return sum;
    
