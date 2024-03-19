import java.util.*;
import java.io.*;

public class p01491 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        long[] S = new long[M+1];
        S[0] = m0;
        for (int i = 1; i < M; i++) {
            S[i] = (S[i-1] * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 1; i <= M; i++) {
            S[i] += S[i-1];
        }

        long[] T = new long[N+1];
        T[0] = n0;
        for (int i = 1; i < N; i++) {
            T[i] = (T[i-1] * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 1; i <= N; i++) {
            T[i] += T[i-1];
        }

        long min = Long.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(i, j, M, N, S, T) > calc(i, j-1, M, N, S, T)) {
                j--;
            }
            min = Math.min(min, calc(i, j, M, N, S, T));
        }
        pr.println(min);
        pr.close();
    }

    static long calc(int a, int b, int M, int N, long[] S, long[] T) {
        return (M - a)*(N - b) + S[a] + T[b];
    }
}