import java.util.*;
import java.io.*;

public class p01491 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);

    static int M, N, m0, md, n0, nd;
    static long[] S, T;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        m0 = Integer.parseInt(st.nextToken());
        md = Integer.parseInt(st.nextToken());
        n0 = Integer.parseInt(st.nextToken());
        nd = Integer.parseInt(st.nextToken());

        S = new long[M+1];
        S[0] = m0;
        for (int i = 1; i < M; i++) {
            S[i] = (S[i-1] * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 1; i <= M; i++) {
            S[i] += S[i-1];
        }

        T = new long[N+1];
        T[0] = n0;
        for (int i = 1; i < N; i++) {
            T[i] = (T[i-1] * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 1; i <= N; i++) {
            T[i] += T[i-1];
        }

        long ans = Long.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(i, j) > calc(i, j-1)) {
                j--;
            }
            ans = Math.min(ans, calc(i, j));
        }
        pw.println(ans);
        pw.close();
    }

    static long calc(int a, int b) {
        return (M - a)*(N - b) + S[a] + T[b];
    }
}