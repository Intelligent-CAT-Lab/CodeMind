Below is the Java translation of the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int mod = 998244353;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        solve(sc);
    }

    public static void solve(FastReader sc) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n < k) {
            System.out.println(0);
            return;
        }
        if(m < k) {
            System.out.println(0);
            return;
        }
        long ans = pow(m, n, mod);
        long[] p = new long[k+1];
        for(int i = 0; i <= k; i++) {
            p[i] = pow(i, n, mod);
        }

        long c = m;
        long[][] comb = new long[k+1][k+1];
        for (long[] row : comb)
            Arrays.fill(row, 0);
        comb[0][0] = 1;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] += comb[i][j] % mod;
                comb[i+1][j+1] += comb[i][j] % mod;
            }
        }
        for(int i = 1; i < k; i++) {
            long k_temp = 0;
            for(int j = i; j >= 1; j--) {
                if ((i + j) % 2 == 1) {
                    k_temp -= comb[i][j] * p[j] % mod;
                } else {
                    k_temp += comb[i][j] * p[j] % mod;
                }
                k_temp = (k_temp + mod) % mod; // Ensure non-negative
            }
            k_temp *= c;
            k_temp %= mod;
            c *= (m - i);
            c *= pow(i + 1, mod - 2, mod);
            c %= mod;
            ans -= k_temp;
            ans = (ans + mod) % mod; // Ensure non-negative
        }
        System.out.println(ans);
    }

    public static long pow(long base, long exp, long mod) {
        long res = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }

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
}
```

Please note that I've used a `FastReader` class to replace the Python `sys.stdin` functionality for reading inputs, which uses a `BufferedReader` and a `StringTokenizer` for efficient input reading in Java.

To run the test case with this Java program, you would need to provide the input (2 10 1) via the console (either manually or by using input redirection if you are using a shell that supports it). The expected output would be `1024`, as the Python code calculates.
