import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class p02782 {

    static int R1, C1, R2, C2;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        R1 = sc.nextInt();
        C1 = sc.nextInt();
        R2 = sc.nextInt();
        C2 = sc.nextInt();

        System.out.println(solve());
    }

    static int solve() {
        // 10^6なのでうっとなるがまぁ大丈夫だろう...
        // 使うinverseの数は少ないのでinverseは全部出さない(遅い)
        int[] factorial = new int[R2+C2+11];
        factorial[0] = 1;
        factorial[1] = 1;
        for (int i = 2; i <= R2+C2+10; i++) {
            factorial[i] = mul(factorial[i-1], i);
        }

        int a = f(R2, C2, factorial);
        int b = f(R2, C1-1, factorial);
        int c = f(R1-1, C2, factorial);
        int d = f(R1-1, C1-1, factorial);
        // debug(a, b, c, d);
        return add(sub(sub(a, b), c), d);
    }

    static int f(int r, int c, int[] factorial) {
        // k(0, c) + k(1, c) + ...k(r, c) = k(r, c+1) らしい
        // で、これを各列に対して行ったものが一行をなすと考えるとさらにその和を考えることができる(-1する)
        // ということで k(r+1, c+1) - 1 になる

        int ret = factorial[r+c+2];
        ret = div(ret, factorial[r+1]);
        ret = div(ret, factorial[c+1]);
        ret = sub(ret, 1);
        return ret;
    }

    static int MOD = 1_000_000_007;

    static int pow(int base, long exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c < 0 ) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD-2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) c %= MOD;
        return (int)c;
    }

    static class FermatCombination {
        private final int size;
        private final int[] factorial; // n -> factorial(n)
        private final int[] inverse;   // n -> inverse(factorial(n))

        FermatCombination(int size) {
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
                inverse[i] = pow(factorial[i], MOD - 2);
            }
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
