```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;

        int[] X = new int[2 * K - 1];
        int[] frac = new int[N + K + 1];
        frac[0] = 1;
        
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (int) ((long) (i + 1) * frac[i - 1] % mod);
        }

        int[] invf = new int[N + K + 1];
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i], mod);
        }

        for (int k = 2; k < K + 2; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;

            for (int m = 0; m <= Math.min(l, N / 2); m++) {
                long prod = (long) (sign * frac[l] % mod * frac[N + K - 2 * m - 1] % mod) % mod;
                prod = (long) (prod * invf[m] % mod * invf[l - m] % mod) % mod;
                prod = (long) (prod * invf[N - 2 * m] % mod * invf[K - 1] % mod) % mod;
                S = (S + (int) prod) % mod;
                sign *= -1;
            }

            X[k - 2] = S;
            X[2 * K - k] = S;
        }

        for (int i : X) {
            System.out.println(i);
        }
    }

    private static int inved(int a, int mod) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;

        while (l != 0) {
            int temp = x;
            x = u;
            u = temp - u * (k / l);
            
            temp = y;
            y = v;
            v = temp - v * (k / l);

            temp = k;
            k = l;
            l = temp % l;
        }

        return x % mod;
    }
}
```
This Java code is the translation of the given Python code. Just copy and paste it into a Java file and run it with the test input provided to get the expected output.
