```java
import java.util.Scanner;

public class Main {
    static int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        long[] X = new long[2 * K - 1];
        long[] frac = new long[N + K + 1];
        long[] invf = new long[N + K + 1];

        for (int i = 0; i < 2 * K - 1; i++) {
            X[i] = 0;
        }
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i]);
        }

        for (int k = 2; k <= K + 1; k++) {
            long S = 0;
            long sign = 1;
            int l = k / 2;
            for (int m = 0; m <= Math.min(l, N / 2); m++) {
                long prod = (sign * (frac[l] * frac[N + K - 2 * m - 1])) % mod;
                prod *= (invf[m] * invf[l - m]) % mod;
                prod %= mod;
                prod *= (invf[N - 2 * m] * invf[K - 1]) % mod;
                prod %= mod;
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }

        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long temp = k / l;
            long t = x - u * temp;
            x = u;
            u = t;
            t = y - v * temp;
            y = v;
            v = t;
            temp = k % l;
            k = l;
            l = temp;
        }
        return x % mod;
    }
}
```
