import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p03365 {

    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        FastReader f = new FastReader(System.in);
        System.out.println(solve(f));
    }

    static int solve(FastReader f) {
        int n = f.nextInt();

        long[] fact = new long[n+1];
        long[] ifact = new long[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            ifact[i] = BigInteger.valueOf(fact[i])
                            .modInverse(BigInteger.valueOf(MOD))
                            .longValue();
        }

        long ans = 0;
        long c0 = 0;
        for (int i = n/2; i < n; i++) {
            long c1 = (nCk(i-1, n-1-i, fact, ifact) * fact[i] % MOD * fact[n-i-1] % MOD - c0 + MOD) % MOD;
            ans = (ans + c1 * i) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        return (int)ans;
    }

    static long nCk(int n, int k, long[] fact, long[] ifact) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] % MOD * ifact[k] % MOD) % MOD;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
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
        
        // Other input methods can be added below for reading different types of input, if needed.
    }
}