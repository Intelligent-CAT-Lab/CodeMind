```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] fact = new int[n+1];
        int[] ifact = new int[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (int)(((long)fact[i-1] * i) % MOD);
            ifact[i] = pow(fact[i], MOD-2);
        }

        int ans = 0;
        int c0 = 0;
        for (int i = n/2; i < n; i++) {
            int c1 = (int)((((long)nCk(i-1, n-1-i, fact, ifact) * fact[i] % MOD) * fact[n-i-1] % MOD - c0 + MOD) % MOD);
            ans = (ans + (int)(((long)c1 * i) % MOD)) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        System.out.println(ans);
    }

    static int nCk(int n, int k, int[] fact, int[] ifact) {
        if (k < 0 || k > n) return 0;
        return (int)(((((long)fact[n] * ifact[n-k]) % MOD * ifact[k]) % MOD);
    }

    static int pow(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (int)(((long)result * base) % MOD);
            }
            base = (int)((long)base * base % MOD);
            exp >>= 1;
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
                } catch (Exception e) {
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

        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }

        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

