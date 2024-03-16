import java.util.*;
import java.io.*;

public class p01883 {
    public static void main(String[] args) {
        new Main().run();
    }

    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null ||!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    int[] a = new int[50000];

    void run() {
        FastReader in = new FastReader();
        int n = in.nextInt();
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
        int t = Arrays.binarySearch(a, n);
        int[] r = new int[t * 2];
        for (int i = 0; i < t; i++) {
            r[i] = 1;
        }
        for (int i = t; i < t * 2; i++) {
            r[i] = 0;
        }
        for (int i = t - 1; i >= 0; i--) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = r[ti - ts];
                r[ti - ts] = 1;
                n -= t - ts;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t * 2; i++) {
            sb.append(r[i] == 1? "(" : ")");
        }
        System.out.println(sb);
    }
}