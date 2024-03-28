

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();
        sc.close();

        long[][] B = new long[N+1][N+1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            for (int l = 1; l <= n; l++) {
                B[n][l] = B[n-1][l-1] + B[n-1][l] * l % MOD;
                B[n][l] %= MOD;
            }
        }

        long[][] pow_2 = new long[N+1][N+1];
        pow_2[1][1] = 2;
        for (int n = 2; n <= N; n++) {
            pow_2[n][1] = pow_2[n-1][1] * 2 % MOD;
        }
        for (int n = 1; n <= N; n++) {
            for (int l = 2; l <= n; l++) {
                pow_2[n][l] = pow_2[n][l-1] * pow_2[1][l] % MOD;
            }
        }

        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }

        long[] A = new long[N+1];
        for (int n = 1; n <= N; n++) {
            for (int l = 1; l <= n; l++) {
                A[n] += B[n][l] * (pow_2[n][l] + pow_2[n][l-1] * l) % MOD;
                A[n] %= MOD;
            }
        }
        for (int n = 1; n <= N; n++) {
            A[n] *= pow_pow[n];
            A[n] %= MOD;
        }

        long[] fact = new long[N+1];
        long[] fact_inv = new long[N+1];
        fact[0] = 1;
        fact_inv[N] = pow(fact[N], MOD-2, MOD);
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
            fact_inv[N-n] = fact_inv[N-n+1] * n % MOD;
        }
        long[] comb = new long[N+1];
        for (int n = 0; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[N-n] % MOD * fact[N] % MOD;
        }

        for (int n = 1; n <= N; n += 2) {
            A[n] *= -1;
            A[n] %= MOD;
        }
        for (int n = 0; n <= N; n++) {
            A[n] *= comb[n];
            A[n] %= MOD;
        }
        long answer = pow(2, pow(2, N, MOD-1), MOD);
        for (int n = 0; n <= N; n++) {
            answer -= A[n];
            answer %= MOD;
        }
        System.out.println(answer);
    }

    public static long pow(long a, long b, long MOD) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return ans;
    }
}
```

## 2. 2019-09-25

### 2.1. 問題

[ABC142 D - Disjoint Set of Common Divisors](https://
