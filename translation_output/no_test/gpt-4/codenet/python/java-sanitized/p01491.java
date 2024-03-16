import java.io.*;
import java.util.Arrays;

public class p01491 {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
        writer.flush();
    }

    public static void solve() throws IOException {
        String[] input = reader.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        long[] S = new long[M + 1];
        long mi = m0;
        S[0] = mi;
        for (int i = 1; i < M; i++) {
            S[i] = mi = (mi * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i + 1] += S[i];
        }

        long[] T = new long[N + 1];
        long ni = n0;
        T[0] = ni;
        for (int i = 1; i < N; i++) {
            T[i] = ni = (ni * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i + 1] += T[i];
        }

        long min = Long.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(i, j, S, T, M, N) > calc(i, j - 1, S, T, M, N)) {
                j--;
            }
            min = Math.min(min, calc(i, j, S, T, M, N));
        }
        writer.write(min + "\n");
    }

    private static long calc(int a, int b, long[] S, long[] T, int M, int N) {
        return (long) (M - a) * (N - b) + S[a] + T[b];
    }
}