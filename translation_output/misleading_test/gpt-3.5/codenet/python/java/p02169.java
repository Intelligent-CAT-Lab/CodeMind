```java
import java.io.*;
import java.util.*;

public class Main {
    static int mod = 998244353;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        solve(sc);
    }

    public static void solve(FastScanner sc) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n < k || m < k) {
            System.out.println(0);
            return;
        }

        long ans = modPow(m, n, mod);
        long[] p = new long[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = modPow(i, n, mod);
        }

        long c = m;
        long[][] comb = new long[k + 1][k + 1];
        comb[0][0] = 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i + 1][j] += comb[i][j];
                comb[i + 1][j + 1] += comb[i][j];
            }
        }

        for (int i = 1; i < k; i++) {
            long kVal = 0;
            for (int j = i; j >= 1; j--) {
                if ((i + j) % 2 != 0) {
                    kVal -= comb[i][j] * p[j];
                } else {
                    kVal += comb[i][j] * p[j];
                }
            }
            kVal *= c;
            c *= (m - i);
            c *= modPow(i + 1, mod - 2, mod);
            c %= mod;
            ans -= kVal;
            ans %= mod;
        }

        System.out.println((ans + mod) % mod);
    }

    public static long modPow(long x, long y, int mod) {
        long res = 1;
        x %= mod;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % mod;
            }
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
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

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```
```
