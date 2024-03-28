```java
import java.util.Scanner;

public class Main {
    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solve(N, A, B, K));
    }

    public static long[] getInv(int N) {
        long[] inv = new long[N + 1];
        inv[1] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = -((MOD / i) * inv[MOD % i]) % MOD;
            if (inv[i] < 0) {
                inv[i] += MOD;
            }
        }
        return inv;
    }

    public static long[] getCmb(int N) {
        long[] inv = getInv(N);
        long[] nCr = new long[N + 1];
        nCr[0] = 1;
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) % MOD) * inv[i] % MOD;
        }
        return nCr;
    }

    public static long solve(int N, int A, int B, int K) {
        long ans = 0;
        long[] nCr = getCmb(N);
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if ((A * a + B * b == K) && (b >= 0 && b <= N)) {
                ans += (nCr[a] * nCr[b]) % MOD;
                ans %= MOD;
            }
        }
        return ans;
    }
}
```

