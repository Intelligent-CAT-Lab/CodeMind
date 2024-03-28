

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int mod = 1000000007;
    static int cms = 1000000;
    static long[] cm = new long[cms];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = cm[i-1] * i % mod;
        }
    }

    static long comb(int a, int b) {
        return cm[a] * inv(cm[a-b]) % mod * inv(cm[b]) % mod;
    }

    static long inv(long x) {
        return pow(x, mod - 2, mod);
    }

    static long pow(long x, long y, long m) {
        if (y == 0) {
            return 1;
        }
        long z = pow(x, y / 2, m);
        if (y % 2 == 0) {
            return z * z % m;
        } else {
            return x * z * z % m;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> rr = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0) {
                break;
            }
            rr.add(f(n, m, k));
        }

        for (long r : rr) {
            System.out.println(r);
        }
    }

    static long f(int n, int m, int k) {
        comb_init();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n + m + k * 2, n + i * 2);
            long lk = 1;
            if (i > 0) {
                lk = (comb(n + i * 2, i) - comb(n + i * 2, i - 1)) % mod;
            }
            long rk = 1;
            if (j > 0) {
                rk = (comb(m + j * 2, j) - comb(m + j * 2, j - 1)) % mod;
            }
            r += mt * lk * rk % mod;
            r %= mod;
        }
        return r;
    }
}

```

## 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
