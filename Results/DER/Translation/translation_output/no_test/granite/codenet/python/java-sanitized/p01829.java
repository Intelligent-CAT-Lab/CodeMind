import java.io.*;
import java.util.*;

class Main {
    static String S;
    static int L;
    static int N;
    static int M;
    static int R;
    static int T;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();
        L = S.length();
        N = Integer.parseInt(S);
        M = Integer.MAX_VALUE;
        R = 0;
        T = (int)Math.pow(10, L);

        permute(new ArrayList<Integer>(), 0);
        System.out.println(R);
    }

    static void permute(List<Integer> list, int index) {
        if (index == L) {
            int b = 0;
            for (int i = 0; i < L; i++) {
                b = b * 10 + list.get(i);
            }
            int tm = Math.max(Math.abs(N - b), T - Math.abs(N - b));
            if (M > tm) {
                M = tm;
                R = b;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            list.add(i);
            permute(list, index + 1);
            list.remove(list.size() - 1);
        }
    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}