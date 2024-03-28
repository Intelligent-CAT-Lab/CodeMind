import java.io.*;
import java.util.*;

public class p01491 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");
        int M = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int m0 = Integer.parseInt(inputs[2]);
        int md = Integer.parseInt(inputs[3]);
        int n0 = Integer.parseInt(inputs[4]);
        int nd = Integer.parseInt(inputs[5]);

        int[] S = new int[M + 1];
        S[0] = m0;
        int mi = m0;
        for (int i = 1; i < M; i++) {
            mi = (mi * 58 + md) % (N + 1);
            S[i] = mi;
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i + 1] += S[i];
        }

        int[] T = new int[N + 1];
        T[0] = n0;
        int ni = n0;
        for (int i = 1; i < N; i++) {
            ni = (ni * 58 + nd) % (M + 1);
            T[i] = ni;
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i + 1] += T[i];
        }

        long result = Long.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(i, j, M, N, S, T) > calc(i, j - 1, M, N, S, T)) {
                j--;
            }
            result = Math.min(result, calc(i, j, M, N, S, T));
        }

        writer.write(result + "\n");
        writer.flush();
    }
    
    private static long calc(int a, int b, int M, int N, int[] S, int[] T) {
        return (long) (M - a) * (N - b) + S[a] + T[b];
    }
}