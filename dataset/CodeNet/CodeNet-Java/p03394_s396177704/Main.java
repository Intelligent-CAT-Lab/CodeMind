import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        int[] answer = solve();
        for (int i = 0; i < N; i++) {
            if( i != 0 ) {
                pw.print(" ");
            }
            pw.print(answer[i]);
        }
        pw.println();
        pw.flush();
    }

    static int[] solve() {

        int maxOdd = 0;
        for (int n = 3; n <= 30000; n++) {
            if( n % 2 != 0 && ( n % 3 == 0 || n % 5 == 0) ) maxOdd++;
        }

        maxOdd = maxOdd / 2 * 2; // 二つペアにしたい

        int odd;
        int even;
        if( N > maxOdd ) {
            odd = maxOdd;
            even = N - maxOdd;

        } else {
            if( N % 2 == 0 ) {
                odd = N - 2;
                even = 2;
            } else {
                odd = N - 1;
                even = 1;
            }
        }

        int[] ans = new int[N];
        long all = 0;
        int i = 0;

        for (int n = 2; n <= 30000; n++) {
            if( n % 2 != 0 && (n % 3 == 0 || n % 5 == 0) ) {
                ans[i++] = n;
                all += n;

                odd--;
                if( odd == 0 ) break;
            }
        }

        for (int n = 2; n <= 30000; n+=2) {
            ans[i++] = n;
            all += n;

            even--;
            if( even == 0 ) break;
        }

        while(true) {
            if( all % 3 == 0 && all % 5 == 0 ) {
                break;

            } else {
                all+=2;
                ans[N-1]+=2;
            }
        }

        // 意味はない
        Arrays.sort(ans);

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
