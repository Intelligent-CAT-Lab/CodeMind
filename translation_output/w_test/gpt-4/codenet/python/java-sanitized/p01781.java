import java.io.*;
import java.util.StringTokenizer;

public class p01781 {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int N = in.nextInt();

        int[] S = new int[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
        for (int k = 0; k < N; k++) {
            S[k] = k * (k + 1) / 2;
        }
        for (int k = N; k < X + Y + Z + 1; k++) {
            S[k] = k * (k + 1) / 2 + S[k - N];
        }

        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            ans[b] = (
                    calc(S, k + 1, X - A, Y - B, Z - C)
                            + calc(S, k, A, Y - B, Z - C)
                            + calc(S, k, X - A, B, Z - C)
                            + calc(S, k, X - A, Y - B, C)
                            + calc(S, k - 1, A, B, Z - C)
                            + calc(S, k - 1, X - A, B, C)
                            + calc(S, k - 1, A, Y - B, C)
                            + calc(S, k - 2, A, B, C)
            );
        }

        for (int num : ans) {
            out.print(num + " ");
        }
        out.println();

        out.close();
    }

    private static int calc(int[] S, int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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
    }
}