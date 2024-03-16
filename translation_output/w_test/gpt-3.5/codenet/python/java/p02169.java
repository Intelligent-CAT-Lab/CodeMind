```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int mod = 998244353;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        solve(fs);
    }

    public static void solve(FastScanner fs) {
        int m = fs.nextInt();
        int n = fs.nextInt();
        int k = fs.nextInt();

        if (n < k || m < k) {
            System.out.println(0);
            return;
        }

        long ans = pow(m, n, mod);
        long[] p = new long[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = pow(i, n, mod);
        }

        long c = m;
        long[][] comb = new long[k + 1][k + 1];
        comb[0][0] = 1;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i + 1; j++) {
                comb[i + 1][j] += comb[i][j];
                comb[i + 1][j + 1] += comb[i][j];
            }
        }

        for (int i = 1; i < k; i++) {
            long mult = 0;
            for (int j = i; j >= 1; j--) {
                if ((i + j) % 2 == 1) {
                    mult -= comb[i][j] * p[j] % mod;
                } else {
                    mult += comb[i][j] * p[j] % mod;
                }
            }

            mult = (mult % mod + mod) % mod;
            mult *= c;
            c *= (m - i);
            c %= mod;
            c *= pow(i + 1, mod - 2, mod);
            c %= mod;
            ans -= mult;
            ans = (ans % mod + mod) % mod;
        }

        System.out.println(ans);
    }

    public static long pow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
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

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
```

