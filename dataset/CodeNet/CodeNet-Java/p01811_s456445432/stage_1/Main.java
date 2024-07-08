import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        String s = sc.next();

        System.out.println(dfs(s) ? "Yes" : "No");
    }

    static final char[] ABC = "ABC".toCharArray();

    static boolean dfs(String s) {
var newVariable_0 = s.equals("ABC");        if( newVariable_0 ) return true;
var newVariable_1 = s.length();        if( newVariable_1 <= 2 ) return false;

        int n = s.length();
        for (char x : ABC) {
            StringBuilder t = new StringBuilder();
            int[] cnt = new int[3];
            boolean abc = false;
            for (int i = 0; i < n; i++) {
var newVariable_2 = s.charAt(i);var newVariable_3 = s.charAt(i+1);var newVariable_4 = s.charAt(i+2);                if( i <= n-3 && s.charAt(i) == 'A' && s.charAt(i+1) == 'B' && newVariable_4 == 'C' ) {
                    abc = true;
var newVariable_5 = t.append(x);                    i+=2;
                } else {
                    char c = s.charAt(i);
                    cnt[c - 'A']++;
var newVariable_6 = t.append(c);                }
            }

            if( !abc ) return false;
            if( cnt[x - 'A'] != 0 ) continue;

var newVariable_7 = t.toString();            boolean ok = dfs(newVariable_7);
            if( ok ) {
                return true;
            }
        }
        return false;
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
var newVariable_8 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_8) {
                try {
var newVariable_9 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_9);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_10 = tokenizer.nextToken();            return newVariable_10;
        }

        String nextLine() {
var newVariable_11 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_11) {
                try {
var newVariable_12 = reader.readLine();                    return newVariable_12;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_13 = tokenizer.nextToken("\n");            return newVariable_13;
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

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
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
var newVariable_14 = j.add(Arrays.toString((int[]) arg));var newVariable_15 = Arrays.toString((int[]) arg);            if (arg instanceof int[]) j.add(newVariable_15);
var newVariable_16 = j.add(Arrays.toString((long[]) arg));var newVariable_17 = Arrays.toString((long[]) arg);            else if (arg instanceof long[]) j.add(newVariable_17);
var newVariable_18 = j.add(Arrays.toString((double[]) arg));var newVariable_19 = Arrays.toString((double[]) arg);            else if (arg instanceof double[]) j.add(newVariable_19);
var newVariable_20 = j.add(Arrays.toString((Object[]) arg));var newVariable_21 = Arrays.toString((Object[]) arg);            else if (arg instanceof Object[]) j.add(newVariable_21);
var newVariable_22 = j.add(arg.toString());var newVariable_23 = arg.toString();            else j.add(newVariable_23);
        }
        System.err.println(j.toString());
    }
}

