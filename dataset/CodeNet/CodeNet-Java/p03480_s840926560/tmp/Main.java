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
        if( S.length() == 1 ) {
System.out.println("[INST]15;None;S.length();"+S.length());
            return 1;
        }

        int mid = -1;
        for (int border = 1; border < S.length(); border++) {
System.out.println("[INST]20;None;S.length();"+S.length());
            char prev = S.charAt(border-1);
System.out.println("[INST]21;prev;S.charAt(border-1);"+prev);
            char post = S.charAt(border);
System.out.println("[INST]22;post;S.charAt(border);"+post);

            if( prev != post ) {
                mid = moreMid(border, mid);
            }
        }

        if( mid == -1 ) {
            return S.length();
System.out.println("[INST]30;None;S.length();"+S.length());

        } else {
            return S.length()-mid;
System.out.println("[INST]33;None;S.length();"+S.length());
        }
    }

    static int moreMid(int border, int mid) {
        if( mid == -1 ) return mid(border);

        return Math.max(mid(border), mid);
    }

    static int mid(int border) {
        int bm = (S.length()+1) / 2;
System.out.println("[INST]44;None;S.length();"+S.length());
        if( border < bm ) return border;
        else return S.length() - border;
System.out.println("[INST]46;None;S.length();"+S.length());
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
System.out.println("[INST]61;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]63;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
System.out.println("[INST]68;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]72;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                try {
                    return reader.readLine();
System.out.println("[INST]74;None;reader.readLine();"+reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
System.out.println("[INST]80;None;tokenizer.nextToken('\n');"+tokenizer.nextToken("\n"));
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

