
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 998244353;
    static int[] frac = new int[1000001];
    static int[] invf = new int[1000001];
    static int[] X = new int[2000001];

    static int inved(int a) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            int t = x - u * (k / l);
            x = u;
            u = t;
            t = y - v * (k / l);
            y = v;
            v = t;
            t = k % l;
            k = l;
            l = t;
        }
        return x % mod;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (int) ((long) i * frac[i - 1] % mod);
        }
        invf[N + K] = inved(frac[N + K]);
        for (int i = N + K - 1; i >= 0; i--) {
            invf[i] = (int) ((long) invf[i + 1] * (i + 1) % mod);
        }
        for (int k = 2; k <= K + 1; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 0; m <= Math.min(l, N / 2); m++) {
                int prod = (int) ((long) sign * frac[l] % mod * frac[N + K - 2 * m - 1] % mod);
                prod = (int) ((long) prod * invf[m] % mod * invf[l - m] % mod);
                prod = (int) ((long) prod * invf[N - 2 * m] % mod * invf[K - 1] % mod);
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = X[2 * K - k] = S;
        }
        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }
}
```

## 2. 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
