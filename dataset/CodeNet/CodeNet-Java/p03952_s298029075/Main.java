import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int X;
    static int LEN;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        N = sc.nextInt();
        X = sc.nextInt();
        LEN = 2*N-1;

        int[] ans = solve();
        if( ans != null ) {
            pw.println("Yes");
            for (int each : ans) {
                pw.println( each );
            }
        } else {
            pw.println("No");
        }
        pw.flush();
    }

    private static int[] solve() {
        if( N == 2 ) {
            return case_2();
        }

        if( X <= 2*N-2 &&  X >= 2 ) {
            int[] ans = new int[LEN];

            if( X == 2 ) {
                //   2 2
                // 3 2 1 4
                ans[N-2] = 3;
                ans[N-1] = 2;
                ans[N] = 1;
                ans[N+1] = 4;

                int v = 5;
                for (int i = 0; i < LEN; i++) {
                    if( N-2 <= i && i <= N+1 ) continue;
                    
                    ans[i] = v;
                    v++;
                }

            } else {
                //     X  X
                // X-2 X X+1 X-1
                ans[N-2] = X-2;
                ans[N-1] = X;
                ans[N] = X+1;
                ans[N+1] = X-1;

                int v = 1;
                for (int i = 0; i < LEN; i++) {
                    if( N-2 <= i && i <= N+1 ) continue;

                    if( X-2 <= v && v <= X+1 ) v = X+2;
                    ans[i] = v;
                    v++;
                }
                
            }
            return ans;

        } else {
            return null;
        }
    }

    static int[] case_2() {
        if( X == 2 ) {
            return new int[]{1, 2, 3};
        } else {
            return null;
        }
    }

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

        double nextDouble() {
            return Double.parseDouble(next());
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

