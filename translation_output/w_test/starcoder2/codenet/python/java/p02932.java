

```java
import java.util.*;
import java.io.*;

public class Main {
    static long MOD = 1000000007;
    static long[] fact;
    static long[] fact_inv;
    static long[] P;
    static long[] Q;
    static int N, M, L, R;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        L = Integer.parseInt(str[2]);
        R = Integer.parseInt(str[3]);

        int U = 600000 + 100;
        fact = new long[U + 1];
        fact_inv = new long[U + 1];
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        int U2 = N - M;
        long[] comb = new long[U2 + 1];
        for (int i = 0; i <= U2; i++) {
            comb[i] = fact[U2] * fact_inv[i] % MOD * fact_inv[U2 - i] % MOD;
        }
        for (int i = 1; i <= U2; i += 2) {
            comb[i] *= -1;
        }

        P = new long[R + 1];
        for (int i = 0; i <= U2; i++) {
            for (int j = M; j <= R; j += i) {
                P[j] += comb[i];
            }
        }

        for (int i = M; i <= R; i++) {
            P[i] = (P[i] - P[i - M] + MOD) % MOD;
        }

        Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD;
        }

        long answer = (f(R) - f(L - 1) + MOD) % MOD;
        System.out.println(answer);
    }

    static long f(int R) {
        long total = fact[R + N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
        long x = 0;
        for (int i = 0; i <= R; i++) {
            x = (x + Q[R - i] * P[i] % MOD) % MOD;
        }
        long coef = fact[N] * fact_inv[M] % MOD * fact_inv[N - M] % MOD;
        return (total - x * coef % MOD + MOD) % MOD;
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }
}
```

## 参考

[https://atcoder.jp/contests/abc189/tasks/abc189_f](https://atcoder.jp/contests/abc189/tasks/abc189_f)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008800)

[https://atcoder.jp/contests/abc189/submissions/20008800](https://atcoder.jp/contests/abc189/submissions/20008
