import java.io.*;
import java.util.*;

public class Main {

    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();

        System.out.println( solve() );
    }

    static int solve() {
var newVariable_0 = S.length();        if( newVariable_0 == 1 ) {
            return 1;
        }

        int mid = -1;
var newVariable_1 = S.length();        for (int border = 1; border < newVariable_1; border++) {
            char prev = S.charAt(border-1);
            char post = S.charAt(border);

            if( prev != post ) {
                mid = moreMid(border, mid);
            }
        }

        if( mid == -1 ) {
var newVariable_2 = S.length();            return newVariable_2;

        } else {
var newVariable_3 = S.length();            return newVariable_3-mid;
        }
    }

    static int moreMid(int border, int mid) {
        if( mid == -1 ) return mid(border);

        return Math.max(mid(border), mid);
    }

    static int mid(int border) {
var newVariable_4 = S.length();        int bm = (newVariable_4+1) / 2;
        if( border < bm ) return border;
var newVariable_5 = S.length();        else return newVariable_5 - border;
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
var newVariable_6 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_6) {
                try {
var newVariable_7 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_7);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_8 = tokenizer.nextToken();            return newVariable_8;
        }

        String nextLine() {
var newVariable_9 = tokenizer.hasMoreTokens();            if (tokenizer == null || !newVariable_9) {
                try {
var newVariable_10 = reader.readLine();                    return newVariable_10;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

var newVariable_11 = tokenizer.nextToken("\n");            return newVariable_11;
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

