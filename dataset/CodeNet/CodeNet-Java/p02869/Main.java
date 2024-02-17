import java.io.*;
import java.util.*;

public class Main {

    static int N, K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        int[][] ans = solve();
        if( ans != null ) {
            PrintWriter pw = new PrintWriter(System.out);
            for (int[] each : ans) {
                pw.print(each[0]);
                pw.print(" ");
                pw.print(each[1]);
                pw.print(" ");
                pw.print(each[2]);
                pw.println();
            }
            pw.flush();
        } else {
            System.out.println(-1);
        }
    }

    static int[][] solve() {
        // とりあえず平均的に割り振る
        int avg = K + K+N+N-1;
        int[][] abi = new int[N][3];
        for (int i = 0; i < N; i++) {
            int a = K+i;
            int b = avg - a;
            abi[i][0] = a;
            abi[i][1] = b;
        }

        // a+bが+1ずつされていくように加工する
        // N=7(8)の場合 -2, 0, +2, -3, -1, +1, +3 みたいな気持ち
        //    (0, 13) (1, 12) (2, 11) (3, 10) (4, 9) (5, 8) (6, 7)
        // -> (3, 10) (0, 13) (4, 9) (1, 12) (5, 8) (2, 11) (6, 7)
        // -> (3, 7) (0, 11) (4, 8) (1, 12) (5, 9) (2, 13) (6, 10)
        // -> 10, 11, 12, 13, 14, 15, 16
        int n;
        if( N % 2 == 1 ) {
            n = N;
        } else {
            n = N-1;
            abi[N-1][2] = Integer.MAX_VALUE;
        }

        // debug("n", n);

        if( (n/2)%2 == 0) {
            // n=9に対して
            // -4 -2 0 2 4
            int eve = -(n/2); // n=9に対して-4
            int eveTime = n/2+1;
            for (int i = 0; i < eveTime; i++) {
                abi[i][2] = eve;
                eve += 2;
            }
            // -3 -1 1 3
            int odd = -(n/2) + 1;
            int oddTime = n/2;
            for (int i = 0; i < oddTime; i++) {
                abi[i+eveTime][2] = odd;
                odd += 2;
            }

        } else {
            // n=11にたいして
            // -4 -2 0 2 4
            int eve = -(n/2) + 1;
            int eveTime = n/2;
            for (int i = 0; i < eveTime; i++) {
                abi[i][2] = eve;
                eve += 2;
            }
            // -5 -3 1 1 3 5
            int odd = -n/2;
            int oddTime = n/2+1;
            for (int i = 0; i < oddTime; i++) {
                abi[i+eveTime][2] = odd;
                odd += 2;
            }
        }

        Arrays.sort(abi, Comparator.comparingInt(a -> a[2]) );
        for (int i = 0; i < n; i++) {
            abi[i][1] += abi[i][2];
        }

        int[][] ans = new int[N][3];
        for (int i = 0; i < N; i++) {
            int c = K+N+N+i;
            ans[i][0] = abi[i][0];
            ans[i][1] = abi[i][1];
            ans[i][2] = c;
        }

        // debug(ans);

        // 全部満たしていたらok
        for (int i = 0; i < N; i++) {
            if( ans[i][0] + ans[i][1] > ans[i][2] ) {
                return null;
            }
        }
        return ans;
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
