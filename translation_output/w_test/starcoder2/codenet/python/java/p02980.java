

```java
import java.util.*;

public class Main {
    static int mod = 998244353;
    static int N, M;
    static long[] fact;
    static long[] powm;
    static long[] pown;
    static long[] inv_fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        if (N > M) {
            int tmp = N;
            N = M;
            M = tmp;
        }
        fact = new long[M + 1];
        powm = new long[M + 1];
        pown = new long[M + 1];
        inv_fact = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % mod;
            powm[i] = powm[i - 1] * (M + 1) % mod;
            pown[i] = pown[i - 1] * (N + 1) % mod;
            inv_fact[M - i] = inv_fact[M - i + 1] * (M - i + 1) % mod;
        }
        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans += pow(-1, i) * C(N, i) * C(M, i) * fact[i] * powm[N - i] * pown[M - i];
            ans = ans % mod;
        }
        System.out.println(ans);
    }

    static long pow(long n, long m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            return pow(n, m / 2) * pow(n, m / 2) % mod;
        } else {
            return pow(n, m / 2) * pow(n, m / 2) % mod * n % mod;
        }
    }

    static long C(int n, int r) {
        return fact[n] * inv_fact[r] % mod * inv_fact[n - r] % mod;
    }
}
```

## 2. 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
