import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        long n = in.nextLong();
        long ans = 0;
        Map<Long, Integer> primeFactors2 = getPrimeFactors(n - 1);
        for (long p = 2; p * p <= n; p++) {
            if (p * p == n) {
                ans++;
                continue;
            }
            if (n % p == 0) {
                if (check(p, n)) {
                    ans++;
                }
                if (check(n / p, n)) {
                    ans++;
                }
            }
        }
        long a1 = 1;
var newVariable_0 = primeFactors2.entrySet();        for (Map.Entry<Long, Integer> entry : newVariable_0) {
var newVariable_1 = entry.getValue();            a1 *= newVariable_1 + 1;
        }
        out.println(a1 + ans);
    }

    static boolean check(long p, long n) {
        while (n % p == 0) {
            n /= p;
            if (n % p == 1) {
                return true;
            }
        }
        return false;
    }

    static Map<Long, Integer> getPrimeFactors(long n) {
        Map<Long, Integer> primeFactors = new HashMap<>();
        long c = n;
        for (long i = 2; i * i <= n && 1 < c; i++) {
            int count = 0;
            while (c % i == 0) {
                count++;
                c /= i;
            }
            if (count > 0) {
var newVariable_2 = primeFactors.put(i, count);            }
        }
        if (c > 1) {
var newVariable_3 = primeFactors.put(c, 1);        }
        return primeFactors;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
var newVariable_4 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_4) {
var newVariable_5 = reader.readLine();                tokenizer = new StringTokenizer(newVariable_5);
            }
        } catch (IOException ignored) {
        }
var newVariable_6 = tokenizer.nextToken();        return newVariable_6;
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
var newVariable_7 = joiner.add(String.valueOf(obj));var newVariable_8 = String.valueOf(obj);            joiner.add(newVariable_8);
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
var newVariable_9 = joiner.add(Integer.toString(i));var newVariable_10 = Integer.toString(i);            joiner.add(newVariable_10);
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
var newVariable_11 = joiner.add(Long.toString(i));var newVariable_12 = Long.toString(i);            joiner.add(newVariable_12);
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
