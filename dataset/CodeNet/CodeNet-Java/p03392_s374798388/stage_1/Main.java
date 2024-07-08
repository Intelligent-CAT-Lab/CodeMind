import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();

        System.out.println(solve());
    }

    static int MOD = 998244353;

    static int solve() {
var newVariable_0 = S.length();        if( newVariable_0 == 1 ) return 1;
var newVariable_1 = S.length();        if( newVariable_1 <= 3 ) return count();
        if( isAllSame(S) ) return 1;

        // j = 連続(1) or not
        // k = 最後の文字
        // l = sum
var newVariable_2 = S.length();        int[][][][] dp = new int[newVariable_2+1][2][3][3];
        dp[1][0][0][0] = 1;
        dp[1][0][1][1] = 1;
        dp[1][0][2][2] = 1;
var newVariable_3 = S.length();        for (int i = 1; i < newVariable_3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        // m = 追加する文字
                        for (int m = 0; m < 3; m++) {
                            boolean aa = j == 1 || k == m;
                            dp[i+1][aa?1:0][m][(l+m)%3] += dp[i][j][k][l];
                            dp[i+1][aa?1:0][m][(l+m)%3] %= MOD;
                        }
                    }
                }
            }
        }

        // 対称じゃね？と思ったけど違うっぽい
        int sum = calcSum(S);

        int ans = 0;
        for (int k = 0; k < 3; k++) {
var newVariable_4 = S.length();            ans += dp[newVariable_4][1][k][sum];
            ans %= MOD;
        }

        if( is_abc(S) ) {
            ans += 1;
            ans %= MOD;
        }
        return ans;
    }

    static boolean isAllSame(String s) {
        char c = s.charAt(0);
var newVariable_5 = s.length();        for (int i = 1; i < newVariable_5; i++) {
var newVariable_6 = s.charAt(i);            if( newVariable_6 != c ) return false;
        }
        return true;
    }

    static int calcSum(String s) {
        int sum = 0;
var newVariable_7 = s.length();        for (int i = 0; i < newVariable_7; i++) {
var newVariable_8 = s.charAt(i);            sum += (newVariable_8 - 'a');
        }
        return sum % 3;
    }

    static boolean is_abc(String s) {
var newVariable_9 = s.length();        for (int i = 0; i < newVariable_9-1; i++) {
var newVariable_10 = s.charAt(i);var newVariable_11 = s.charAt(i+1);            if( s.charAt(i) == newVariable_11 ) return false;
        }
        return true;
    }

    static int count() {
        Set<String> set = new HashSet<>();
        ArrayDeque<String> q = new ArrayDeque<>();
var newVariable_12 = q.add(S);var newVariable_13 = set.add(S);var newVariable_14 = q.isEmpty();        while(!newVariable_14) {
            String s = q.poll();

var newVariable_15 = s.length();            for (int i = 0; i < newVariable_15-1; i++) {
var newVariable_16 = s.charAt(i);var newVariable_17 = s.charAt(i+1);                if( s.charAt(i) != newVariable_17 ) {
var newVariable_18 = s.charAt(i);var newVariable_19 = s.charAt(i+1);                    char c = not(s.charAt(i), newVariable_19);
                    char[] chars = s.toCharArray();
                    chars[i] = c;
                    chars[i+1] = c;
                    String t = new String(chars);
var newVariable_20 = set.contains(t);                    if( !newVariable_20 ) {
var newVariable_21 = set.add(t);var newVariable_22 = q.add(t);                    }
                }
            }
        }
//        List<String> list = new ArrayList<>(set);
//        list.sort(Comparator.naturalOrder());
//        System.out.println( list );
var newVariable_23 = set.size();        return newVariable_23;
    }

    static char not(char a, char b) {
        if( a == 'a' && b == 'b' || a == 'b' && b == 'a' ) return 'c';
        else if( a == 'a' && b == 'c' || a == 'c' && b == 'a' ) return 'b';
        else return 'a';
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
var newVariable_24 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_24) {
                try {
var newVariable_25 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_25);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_26 = tokenizer.nextToken();            return newVariable_26;
        }

        String nextLine() {
var newVariable_27 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_27) {
                try {
var newVariable_28 = reader.readLine();                    return newVariable_28;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_29 = tokenizer.nextToken("\n");            return newVariable_29;
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
var newVariable_30 = j.add(Arrays.toString((int[]) arg));var newVariable_31 = Arrays.toString((int[]) arg);            if (arg instanceof int[]) j.add(newVariable_31);
var newVariable_32 = j.add(Arrays.toString((long[]) arg));var newVariable_33 = Arrays.toString((long[]) arg);            else if (arg instanceof long[]) j.add(newVariable_33);
var newVariable_34 = j.add(Arrays.toString((double[]) arg));var newVariable_35 = Arrays.toString((double[]) arg);            else if (arg instanceof double[]) j.add(newVariable_35);
var newVariable_36 = j.add(Arrays.toString((Object[]) arg));var newVariable_37 = Arrays.toString((Object[]) arg);            else if (arg instanceof Object[]) j.add(newVariable_37);
var newVariable_38 = j.add(arg.toString());var newVariable_39 = arg.toString();            else j.add(newVariable_39);
        }
        System.err.println(j.toString());
    }
}
