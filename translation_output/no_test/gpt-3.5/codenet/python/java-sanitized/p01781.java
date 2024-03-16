import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p01781 {
    public static void solve() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st;
        try {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int Z = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

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
                    calc(k+1, X-A, Y-B, Z-C, S)
                    + calc(k, A, Y-B, Z-C, S)
                    + calc(k, X-A, B, Z-C, S)
                    + calc(k, X-A, Y-B, C, S)
                    + calc(k-1, A, B, Z-C, S)
                    + calc(k-1, X-A, B, C, S)
                    + calc(k-1, A, Y-B, C, S)
                    + calc(k-2, A, B, C, S)
                );
            }

            for (int i = 0; i < N; i++) {
                out.print(ans[i] + " ");
            }
            out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }

    public static int calc(int k, int x, int y, int z, int[] S) {
        return S[k] - S[k-x] - S[k-y] - S[k-z] + S[k-(x+y)] + S[k-(y+z)] + S[k-(z+x)] - S[k-(x+y+z)];
    }

    public static void main(String[] args) {
        solve();
    }
}