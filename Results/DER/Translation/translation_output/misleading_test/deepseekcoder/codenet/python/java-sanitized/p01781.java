import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p01781 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int nextInt() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) {
        int X = nextInt(), Y = nextInt(), Z = nextInt(), A = nextInt(), B = nextInt(), C = nextInt(), N = nextInt();

        long[] S = new long[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
        for (int k = 0; k < N; k++) {
            S[k] = k * (k + 1) / 2;
        }
        for (int k = N; k < X + Y + Z + 1; k++) {
            S[k] = k * (k + 1) / 2 + S[k - N];
        }

        long calc(int k, int x, int y, int z) {
            return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
        }

        long[] ans = new long[N];
        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            ans[b] = calc(k + 1, X - A, Y - B, Z - C) + calc(k, A, Y - B, Z - C) + calc(k, X - A, B, Z - C) + calc(k, X - A, Y - B, C) + calc(k - 1, A, B, Z - C) + calc(k - 1, X - A, B, C) + calc(k - 1, A, Y - B, C) + calc(k - 2, A, B, C);
        }

        for (long num : ans) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}