import java.io.*;
import java.util.*;

public class p01491 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // Reading the input values
        String[] input = reader.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        // Generating sequence S
        long[] S = new long[M+1];
        long mi = m0;
        S[0] = mi;
        for (int i = 1; i < M; i++) {
            S[i] = mi = (mi * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i+1] += S[i];
        }

        // Generating sequence T
        long[] T = new long[N+1];
        long ni = n0;
        T[0] = ni;
        for (int i = 1; i < N; i++) {
            T[i] = ni = (ni * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i+1] += T[i];
        }

        // Calculating minimum value
        long result = Long.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(i, j, M, N, S, T) > calc(i, j-1, M, N, S, T)) {
                j--;
            }
            result = Math.min(result, calc(i, j, M, N, S, T));
        }

        // Writing result to the output
        writer.write(result + "\n");
        writer.flush();
    }

    private static long calc(int a, int b, int M, int N, long[] S, long[] T) {
        return (M - a) * (long) (N - b) + S[a] + T[b];
    }
}