import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int A;
    static int B;
    static int C;
    static int D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        System.out.println(solve());
    }

    static int MOD = 1_000_000_007;
    static int INF = -1;
    static int EMP = -2;

    static FermatCombination COMB;
    static long[][] MEMO;
    static int[][] MEMOCOMB;

    static long solve() {
        COMB = new FermatCombination(1000, MOD);
        MEMO = new long[N+2][N+2];
        for (long[] arr : MEMO) {
            Arrays.fill(arr, EMP);
        }
        MEMOCOMB = new int[N+2][N+2];

        long ans = dfs(N, A);
        return ans == INF ? 0 : ans;
    }

    static int comb(int n, int k) {
        if ( MEMOCOMB[n][k] == 0 ) {
            int r = COMB.comb(n, k);
            MEMOCOMB[n][k] = r;
        }
        return MEMOCOMB[n][k];
    }

    static int inverse(int n) {
        return COMB.inverse[n];
    }

    static long dfs(int n, int g) {
        if ( MEMO[n][g] != EMP ) return MEMO[n][g];

        long r = _dfs(n, g);
        MEMO[n][g] = r;
        return r;
    }

    static long _dfs(int n, int g) {
        if( n == 0 ) return 1;
        if( g > B ) return INF;

        long ans_g;

        if( n >= g * C ) {
            long sum = 0;
            int nn = n;
            long q = 1;
            for (int i = 0; i < C-1; i++) {
                q = q * comb(nn, g) % MOD;
                nn -= g;
            }
            for (int i = C; i <= D; i++) {
                if( nn < g ) break;
                q = q * comb(nn, g) % MOD;
                nn -= g;

                long ret = dfs(nn, g+1);
                if( ret == INF ) continue;

                ret = ret * q % MOD;
                ret = ret * inverse(i) % MOD;
                sum += ret;
            }

            if( sum > 0 ) {
                ans_g = sum;
            } else {
                ans_g = INF;
            }

        } else {
            ans_g = INF;
        }

        long ans_h = dfs(n, g+1);

        if( ans_g != INF && ans_h != INF ) {
            return (ans_g + ans_h) % MOD;
        } else if( ans_g != INF ) {
            return ans_g;
        } else if( ans_h != INF ) {
            return ans_h;
        } else {
            return INF;
        }
    }

    static class FermatCombination {

        private final int size;
        private final int mod;
        private final int[] factorial; // n -> factorial(n)
        private final int[] inverse;   // n -> inverse(factorial(n))

        public FermatCombination(int size, int mod) {
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
