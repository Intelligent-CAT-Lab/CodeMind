import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p01781 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int X, Y, Z, A, B, C, N;
    static long[] S;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
    }

    static void process() {
        int max = Math.max(2 * (X + Y + Z + 1), 2 * N + 2);
        S = new long[max];
        for (int k = 0; k < N; k++) {
            S[k] = k * (k + 1) / 2;
        }
        for (int k = N; k < X + Y + Z + 1; k++) {
            S[k] = k * (k + 1) / 2 + S[k - N];
        }

        long[] ans = new long[N];
        for (int b = 0; b < N; b++) {
            int k = ((X + Y + Z - b - 1) / N) * N + b;
            ans[b] = calc(k + 1, X - A, Y - B, Z - C)
                    + calc(k, A, Y - B, Z - C)
                    + calc(k, X - A, B, Z - C)
                    + calc(k, X - A, Y - B, C)
                    + calc(k - 1, A, B, Z - C)
                    + calc(k - 1, X - A, B, C)
                    + calc(k - 1, A, Y - B, C)
                    + calc(k - 2, A, B, C);
        }
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]).append(" ");
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }

    static long calc(int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }

    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}