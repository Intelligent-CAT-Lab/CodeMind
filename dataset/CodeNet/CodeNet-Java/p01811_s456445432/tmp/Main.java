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
System.out.println("[INST]15;ABC;'ABC'.toCharArray();"+ABC);

    static boolean dfs(String s) {
        if( s.equals("ABC") ) return true;
System.out.println("[INST]18;None;s.equals('ABC');"+s.equals("ABC"));
        if( s.length() <= 2 ) return false;
System.out.println("[INST]19;None;s.length();"+s.length());

        int n = s.length();
System.out.println("[INST]21;n;s.length();"+n);
        for (char x : ABC) {
            StringBuilder t = new StringBuilder();
            int[] cnt = new int[3];
            boolean abc = false;
            for (int i = 0; i < n; i++) {
                if( i <= n-3 && s.charAt(i) == 'A' && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C' ) {
System.out.println("[INST]27;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]27;None;s.charAt(i+1);"+s.charAt(i+1));
System.out.println("[INST]27;None;s.charAt(i+2);"+s.charAt(i+2));
                    abc = true;
                    t.append(x);
System.out.println("[INST]29;None;t.append(x);"+t.append(x));
                    i+=2;
                } else {
                    char c = s.charAt(i);
System.out.println("[INST]32;c;s.charAt(i);"+c);
                    cnt[c - 'A']++;
                    t.append(c);
System.out.println("[INST]34;None;t.append(c);"+t.append(c));
                }
            }

            if( !abc ) return false;
            if( cnt[x - 'A'] != 0 ) continue;

            boolean ok = dfs(t.toString());
System.out.println("[INST]41;None;t.toString();"+t.toString());
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
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]60;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]62;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]67;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]71;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    return reader.readLine();
System.out.println("[INST]73;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
System.out.println("[INST]78;None;tokenizer.nextToken('\n');"+tokenizer.nextToken("\n"));
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
System.out.println("[INST]116;None;pw.flush();"+pw.flush());
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
System.out.println("[INST]122;None;pw.flush();"+pw.flush());
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
System.out.println("[INST]128;None;pw.flush();"+pw.flush());
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
System.out.println("[INST]146;None;j.add(Arrays.toString((int[]) arg));"+j.add(Arrays.toString((int[]) arg)));
System.out.println("[INST]146;None;Arrays.toString((int[]) arg);"+Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
System.out.println("[INST]147;None;j.add(Arrays.toString((long[]) arg));"+j.add(Arrays.toString((long[]) arg)));
System.out.println("[INST]147;None;Arrays.toString((long[]) arg);"+Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
System.out.println("[INST]148;None;j.add(Arrays.toString((double[]) arg));"+j.add(Arrays.toString((double[]) arg)));
System.out.println("[INST]148;None;Arrays.toString((double[]) arg);"+Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
System.out.println("[INST]149;None;j.add(Arrays.toString((Object[]) arg));"+j.add(Arrays.toString((Object[]) arg)));
System.out.println("[INST]149;None;Arrays.toString((Object[]) arg);"+Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
System.out.println("[INST]150;None;j.add(arg.toString());"+j.add(arg.toString()));
System.out.println("[INST]150;None;arg.toString();"+arg.toString());
        }
        System.err.println(j.toString());
    }
}

