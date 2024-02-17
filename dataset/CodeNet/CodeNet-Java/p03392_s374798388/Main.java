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
        if( S.length() == 1 ) return 1;
        if( S.length() <= 3 ) return count();
        if( isAllSame(S) ) return 1;

        // j = 連続(1) or not
        // k = 最後の文字
        // l = sum
        int[][][][] dp = new int[S.length()+1][2][3][3];
        dp[1][0][0][0] = 1;
        dp[1][0][1][1] = 1;
        dp[1][0][2][2] = 1;
        for (int i = 1; i < S.length(); i++) {
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
            ans += dp[S.length()][1][k][sum];
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
        for (int i = 1; i < s.length(); i++) {
            if( s.charAt(i) != c ) return false;
        }
        return true;
    }

    static int calcSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - 'a');
        }
        return sum % 3;
    }

    static boolean is_abc(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if( s.charAt(i) == s.charAt(i+1) ) return false;
        }
        return true;
    }

    static int count() {
        Set<String> set = new HashSet<>();
        ArrayDeque<String> q = new ArrayDeque<>();
        q.add(S);
        set.add(S);
        while(!q.isEmpty()) {
            String s = q.poll();

            for (int i = 0; i < s.length()-1; i++) {
                if( s.charAt(i) != s.charAt(i+1) ) {
                    char c = not(s.charAt(i), s.charAt(i+1));
                    char[] chars = s.toCharArray();
                    chars[i] = c;
                    chars[i+1] = c;
                    String t = new String(chars);
                    if( !set.contains(t) ) {
                        set.add(t);
                        q.add(t);
                    }
                }
            }
        }
//        List<String> list = new ArrayList<>(set);
//        list.sort(Comparator.naturalOrder());
//        System.out.println( list );
        return set.size();
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
