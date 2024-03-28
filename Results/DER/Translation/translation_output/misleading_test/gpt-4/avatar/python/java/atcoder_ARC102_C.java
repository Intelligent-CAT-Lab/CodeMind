Here's the provided Python code translated to Java:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final int mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        long[] frac = new long[N + K + 1];
        long[] invf = new long[N + K + 1];
        long[] X = new long[2 * K - 1];
        frac[0] = 1;

        for (int i = 0; i < N + K; i++)
            frac[i + 1] = ((i + 1) * frac[i]) % mod;

        for (int i = 0; i <= N + K; i++)
            invf[i] = inved(frac[i]);

        for (int k = 2; k < K + 2; k++) {
            long S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 0; m < Math.min(l + 1, N / 2 + 1); m++) {
                long prod = sign * frac[l] * frac[N + K - 2 * m - 1] % mod;
                prod = prod * invf[m] % mod * invf[l - m] % mod;
                prod = prod * invf[N - 2 * m] % mod * invf[K - 1] % mod;
                S = (S + prod + mod) % mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }

        for (int i = 0; i < 2 * K - 1; i++)
            System.out.println(X[i]);
    }

    private static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long q = k / l;
            x = x - u * q;
            y = y - v * q;
            long tmp = u;
            u = x;
            x = tmp;
            tmp = v;
            v = y;
            y = tmp;
            tmp = l;
            l = k % l;
            k = tmp;
        }
        x = (x % mod + mod) % mod;
        return x;
    }
}
```

Given the Python code assumes the input on the same line, this Java code assumes the input format similar to the Python code's example, which is two space-separated integers on a single line. Use the following command to compile and run the Java program:

```shell
javac Main.java && java Main
``` 

Then provide the sample test input:
```
1 200000
```

Expect the output to be `"-47"`.
