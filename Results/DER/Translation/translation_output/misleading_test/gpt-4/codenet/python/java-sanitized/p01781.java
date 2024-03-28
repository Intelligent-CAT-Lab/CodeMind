import java.io.*;

public class p01781 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        solve();
    }
    
    private static void solve() throws IOException {
        String[] parts = reader.readLine().split(" ");
        int X = Integer.parseInt(parts[0]);
        int Y = Integer.parseInt(parts[1]);
        int Z = Integer.parseInt(parts[2]);
        int A = Integer.parseInt(parts[3]);
        int B = Integer.parseInt(parts[4]);
        int C = Integer.parseInt(parts[5]);
        int N = Integer.parseInt(parts[6]);

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
        for (int value : ans) {
            writer.write(value + " ");
        }
        writer.write("\n");
        writer.flush();
    }
    
    private static int calc(int[] S, int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }
}