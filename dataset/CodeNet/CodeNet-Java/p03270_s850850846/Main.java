import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int K;
    static int N;
    static final int MOD = 998244353;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        long[] ans = solve();
        for (int i = 2; i <= 2*K; i++) {
            pw.println(ans[i]);
        }
        pw.flush();
    }

    static FermatCombination fc;
    static int ALL_HCOMB;
    static int[][] COMB;

    static long[] solve() {
        fc = new FermatCombination(4010, MOD);
        COMB = new int[4010][4010];
        for (int[] arr : COMB) {
            Arrays.fill(arr, -1);
        }

        long[] ans = new long[2*K+1];
        for (int i = 2; i <= 2*K; i++) {

            if( i <= K + 1 ) {
                ans[i] = calc(i);

            } else {
                ans[i] = ans[(2*(K+1) - i)];
            }
        }
        return ans;
    }

    static int comb(int n, int k) {
        if( COMB[n][k] != -1 ) {
            return COMB[n][k];
        }

        int ret = fc.comb(n, k);
        COMB[n][k] = ret;
        return ret;
    }

    static int hcomb(int k, int n) {
        return comb(k+n-1, n);
    }

    static long calc(int i) {
        int g;
        if( i <= K + 1 ) {
            g = i / 2;

        } else {
            // (K+1)からの距離が同じ前半のものと同じと考えると
            // (K+1) - (i - (K+1))
            g = (2*(K+1) - i) / 2;
        }

        if( i % 2 == 0 ) {
            // gのうち一つは (a, a)みたいなやつ
            // 0と1の場合を両方やる
            int r = K-(g-1)*2-1;
            return add(f(N, r, g-1), f(N-1, r, g-1));

        } else {
            return f(N, K-g*2, g);
        }
    }

    static long f(int n, int r, int g) {
        long ret = 0;
        int gn = Math.min(g, n);
        for (int i = 1; i <= gn; i++) {
            int c = comb(g, i);      // グループの選び方
            int p = fc.pow(2, i);       // 各グループからの数値の選び方
            int h = hcomb(r+i, n-i); // 残りの重複組み合わせ
            ret = add(mul(mul(c, p), h), ret);
        }
        if( r > 0 ) {
            ret = add(hcomb(r, n), ret);
        }
        return ret;
    }

    static long mul(long a, long b) {
        return a * b % MOD;
    }

    static long add(long a, long b) {
        return (a + b) % MOD;
    }

    static class FermatCombination {

        private final int size;
        private final int mod;
        private final int[] factorial; // n -> factorial(n)
        private final int[] inverse;   // n -> inverse(factorial(n))

        FermatCombination(int size, int mod) {
            this.mod = mod;
            this.size = size;
            factorial = new int[size + 1];
            inverse = new int[size + 1];

            init();
        }

        private void init() {
            factorial[0] = 1;
            factorial[1] = 1;
            inverse[0] = 1;
            inverse[1] = 1;
            for (int i = 2; i <= size; i++) {
                factorial[i] = mul(factorial[i-1], i);
                inverse[i] = pow(factorial[i], mod - 2);
            }
        }

        private int pow(int base, int exp) {
            if( exp == 0 ) return 1;

            int ans = 1;
            base %= mod;
            while( exp > 0 ) {
                if( (exp & 1) == 1 ) {
                    ans = mul(ans, base);
                }

                base = mul(base, base);
                exp = exp >> 1;
            }
            return ans;
        }

        private int mul(int a, int b) {
            return (int)((long)a * b % mod);
        }

        int comb(int n, int k) {
            if( n > size ) throw new RuntimeException("wtf : size=" + size + " n=" + n);
            return mul(mul(factorial[n], inverse[k]), inverse[n - k]);
        }

        // 重複組み合わせ
        // k種類からn個選ぶ場合の数
        int hcomb(int k, int n) {
            return comb(k+n-1, n);
        }

        int group(int n, int g, int k) {
            // C(n, g) * C(n-g, g)... / k!
            // n! / (n-gk)! / g! ^ k / k!
            int ret = factorial[n];             // n!
            ret = mul(ret, inverse[n - g*k]);   // 1 / (n-gk)!
            ret = mul(ret, pow(inverse[g], k)); // 1 / (g! ^ k)
            ret = mul(ret, inverse[k]);         // 1 / k!
            return ret;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
