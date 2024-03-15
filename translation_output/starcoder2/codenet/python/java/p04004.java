
```java
import java.io.*;
import java.util.*;

public class Main {
    static int MOD = (int)1e9 + 7;
    static int U = (int)1e6;
    static long[] power2, power2_inv, power3, power3_inv, fact, fact_inv;
    static long[] x;

    static void make_power() {
        int B = Integer.highestOneBit(U);
        power2 = new long[U];
        power2_inv = new long[U];
        power3 = new long[U];
        power3_inv = new long[U];
        power2[0] = power2_inv[0] = power3[0] = power3_inv[0] = 1;
        power2[1] = 2;
        power3[1] = 3;
        for (int n = 1; n < B; n++) {
            for (int i = 1 << (n - 1); i < 1 << n; i++) {
                power2[i] = power2[i - 1] * power2[1 << (n - 1)] % MOD;
                power3[i] = power3[i - 1] * power3[1 << (n - 1)] % MOD;
            }
        }
        for (int i = 1; i < U; i++) {
            power2_inv[i] = power2_inv[MOD % i] * (MOD - MOD / i) % MOD;
            power3_inv[i] = power3_inv[MOD % i] * (MOD - MOD / i) % MOD;
        }
    }

    static void make_fact() {
        fact = new long[U];
        fact_inv = new long[U];
        fact[0] = 1;
        fact_inv[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            fact_inv[i] = fact_inv[MOD % i] * (MOD - MOD / i) % MOD;
        }
        for (int i = 1; i < U; i++) {
            fact_inv[i] = fact_inv[i] * fact_inv[i - 1] % MOD;
        }
    }

    static void cumprod() {
        int Lsq = (int)Math.sqrt(U) + 1;
        long[] arr = new long[Lsq * Lsq];
        for (int i = 0; i < U; i++) {
            arr[i] = fact[i];
        }
        for (int n = 1; n < Lsq; n++) {
            for (int i = n; i < U; i += Lsq) {
                arr[i] = arr[i] * arr[i - Lsq] % MOD;
            }
        }
        for (int n = 1; n < Lsq; n++) {
            for (int i = n * Lsq; i < U; i++) {
                arr[i] = arr[i] * arr[i - 1] % MOD;
            }
        }
        for (int i = 0; i < U; i++) {
            fact[i] = arr[i];
        }
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        make_power();
        make_fact();
        cumprod();
        x = new long[N + M];
        x[0] = 3 * (1 - power3_inv[K + 1]) % MOD * power2_inv[1] % MOD;
        for (int i = 1; i < N + M; i++) {
            x[i] = (-1) * power2[i - 1] * power3_inv[K + i] % MOD;
            x[i] = x[i] * fact[K + i] % MOD * fact_inv[K] % MOD * fact_inv[i] % MOD;
            x[i] = (x[i] + x[i - 1]) % MOD;
        }
        for (int i = 0; i < N + M; i++) {
            x[i] = x[i] * power3[i] % MOD * power2_inv[i] % MOD;
        }
        long[] coef = new long[M + 1];
        for (int i = 0; i < M + 1; i++) {
            coef[i] = fact[N - 1 + i] * fact_inv[i] % MOD * fact_inv[N - 1] % MOD;
            coef[i] = coef[i] * power3[K + i] % MOD;
        }
        long answer = 0;
        for (int i = 0; i < M + 1; i++) {
            answer = (answer + coef[i] * x[N - 1 + i]) % MOD;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        solve();
    }
}
```

## 解説

### 問題の解き方

まず、$N$ 個のボールを $M$ 個の箱に入れる方法の数を $f(N,M)$ とおく。

$N$ 個のボールを $
