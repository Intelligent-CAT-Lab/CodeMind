import java.util.*;
import java.io.*;

public class p01781 {
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

    void run() {
        FastReader in = new FastReader();
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int N = in.nextInt();
        int[] S = new int[Math.max(2*(X+Y+Z+1), 2*N+2)];
        for (int k = 0; k < N; k++) {
            S[k] = k*(k+1)/2;
        }
        for (int k = N; k < X+Y+Z+1; k++) {
            S[k] = k*(k+1)/2 + S[k-N];
        }
        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X+Y+Z - b - 1) / N * N + b;
            ans[b] = (
                    S[k+1] - S[k-X+A] - S[k-Y+B] - S[k-Z+C] + S[k-(X+Y)-A-B] + S[k-(Y+Z)-B-C] + S[k-(Z+X)-C-A] - S[k-(X+Y+Z)-A-B-C]
            );
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}