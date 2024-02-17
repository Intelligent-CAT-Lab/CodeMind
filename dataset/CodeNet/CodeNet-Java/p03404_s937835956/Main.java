import java.io.*;
import java.util.*;

public class Main {

    static int A;
    static int B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        boolean[][] ans = solve();
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("100 100");
        for (int i = 0; i < 100; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < 100; j++) {
                b.append(ans[i][j] ? "#" : ".");
            }
            pw.println(b.toString());
        }
        pw.flush();
    }

    static boolean[][] solve() {
        // 上半分が白
        // 下半分が黒
        boolean[][] ans = new boolean[100][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ans[i][j] = true;
            }
        }

        int aq = (A-1)/50;
        int ar = (A-1)%50;
        for (int i = 0; i < aq; i++) {
            int h = i * 2;
            for (int j = 0; j < 50; j++) {
                int w = j*2;
                ans[h][w] = false;
            }
        }
        for (int i = 0; i < ar; i++) {
            int h = aq * 2;
            int w = i *2;
            ans[h][w] = false;
        }

        int bq = (B-1)/50;
        int br = (B-1)%50;
        for (int i = 0; i < bq; i++) {
            int h = i * 2 + 51;
            for (int j = 0; j < 50; j++) {
                int w = j*2;
                ans[h][w] = true;
            }
        }
        for (int i = 0; i < br; i++) {
            int h = bq * 2 + 51;
            int w = i * 2;
            ans[h][w] = true;
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

