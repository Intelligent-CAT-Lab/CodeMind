Here is the translated Java code for the given Python script. Please make sure to provide the necessary input and output mechanisms when integrating this into your Java application, as the code expects to be provided with the input in a manner similar to how Python's `sys.stdin.readline()` works.

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    private static final int MOD = 1000000007;
    private static final int CMS = 1000000;
    private static long[] cm = new long[CMS];

    // Fast input reader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    private static long inverse(long x) {
        return BigInteger.valueOf(x).modInverse(BigInteger.valueOf(MOD)).longValue();
    }

    private static void combInit() {
        cm[0] = 1;
        for (int i = 1; i < CMS; i++) {
            cm[i] = (cm[i - 1] * i) % MOD;
        }
    }

    private static long comb(int a, int b) {
        return ((cm[a] * inverse(cm[a - b]) % MOD) * inverse(cm[b]) % MOD);
    }

    private static long f(int n, int m, int k) {
        combInit();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n + m + k * 2, n + i * 2);
            long lk = 1, rk = 1;
            if (i > 0) {
                lk = (comb(n + i * 2, i) - comb(n + i * 2, i - 1) + MOD) % MOD;
            }
            if (j > 0) {
                rk = (comb(m + j * 2, j) - comb(m + j * 2, j - 1) + MOD) % MOD;
            }
            r += mt * lk * rk % MOD;
            r %= MOD;
        }
        return r;
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        List<Long> results = new LinkedList<>();

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (n == 0) {
                break;
            }
            results.add(f(n, m, k));
            break;
        }

        for (Long result : results) {
            System.out.println(result);
        }
    }
}
```

This Java program follows the algorithm of the Python script, including creating the factorials for `comb` in advance with `combInit()`, and calculating the inverse modulo with BigInteger's `modInverse` method. The code uses a `FastReader` class to provide similar fast input reading capabilities like in Python. Please ensure the input format is compatible with the expected format of `FastReader`.
