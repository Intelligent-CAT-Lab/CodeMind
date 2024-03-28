```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int mod = 998244353;

        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }

        long[] fact = new long[M + 1];
        long[] powm = new long[M + 1];
        long[] pown = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;

        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % mod;
            powm[i] = powm[i - 1] * (M + 1) % mod;
            pown[i] = pown[i - 1] * (N + 1) % mod;
        }

        long[] inv_fact = new long[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2, mod);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = inv_fact[i + 1] * (i + 1) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans += Math.pow(-1, i) * C(N, i, fact, inv_fact, mod) * C(M, i, fact, inv_fact, mod) * fact[i] * powm[N - i] * pown[M - i];
            ans %= mod;
        }

        System.out.println(ans);
    }

    private static long pow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }

    private static long C(int n, int r, long[] fact, long[] inv_fact, int mod) {
        return fact[n] * inv_fact[r] % mod * inv_fact[n - r] % mod;
    }
}
```
```
