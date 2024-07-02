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
        for (Map.Entry<Long, Integer> entry : primeFactors2.entrySet()) {
System.out.println("[INST]36;None;primeFactors2.entrySet();"+primeFactors2.entrySet());
            a1 *= entry.getValue() + 1;
System.out.println("[INST]37;None;entry.getValue();"+entry.getValue());
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
                primeFactors.put(i, count);
System.out.println("[INST]62;None;primeFactors.put(i, count);"+primeFactors.put(i, count));
            }
        }
        if (c > 1) {
            primeFactors.put(c, 1);
System.out.println("[INST]66;None;primeFactors.put(c, 1);"+primeFactors.put(c, 1));
        }
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
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]83;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]84;None;reader.readLine();"+reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
System.out.println("[INST]88;None;tokenizer.nextToken();"+tokenizer.nextToken());
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
            joiner.add(String.valueOf(obj));
System.out.println("[INST]147;None;joiner.add(String.valueOf(obj));"+joiner.add(String.valueOf(obj)));
System.out.println("[INST]147;None;String.valueOf(obj);"+String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
System.out.println("[INST]158;None;joiner.add(Integer.toString(i));"+joiner.add(Integer.toString(i)));
System.out.println("[INST]158;None;Integer.toString(i);"+Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
System.out.println("[INST]169;None;joiner.add(Long.toString(i));"+joiner.add(Long.toString(i)));
System.out.println("[INST]169;None;Long.toString(i);"+Long.toString(i));
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
