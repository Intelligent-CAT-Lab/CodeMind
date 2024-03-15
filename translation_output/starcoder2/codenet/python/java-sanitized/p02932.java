import java.util.*;
import java.io.*;

public class p02932 {
    static long MOD = 1000000007;
    static long[] fact;
    static long[] fact_inv;
    static long[] P;
    static long[] Q;
    static int N, M, L, R;

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();

        int U = 600000 + 100;
        fact = new long[U + 1];
        fact_inv = new long[U + 1];
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        P = new long[R + 1];
        for (int i = M; i <= U; i++) {
            P[i - M] = fact[i] * fact_inv[i - M] % MOD * fact_inv[M] % MOD;
        }
        for (int i = 1; i <= R; i++) {
            P[i] = (P[i] + P[i - 1]) % MOD;
        }

        Q = new long[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = fact[N + i] * fact_inv[i] % MOD * fact_inv[N] % MOD;
        }

        System.out.println(f(R) - f(L - 1));
    }

    static long f(int R) {
        long total = fact[R + N] * fact_inv[R] % MOD * fact_inv[N] % MOD;
        long x = 0;
        for (int i = 0; i <= R; i++) {
            x = (x + Q[i] * P[i] % MOD) % MOD;
        }
        long coef = fact[N] * fact_inv[M] % MOD * fact_inv[N - M] % MOD;
        return (total - x * coef % MOD + MOD) % MOD;
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
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