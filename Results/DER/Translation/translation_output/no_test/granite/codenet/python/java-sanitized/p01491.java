import java.io.*;
import java.util.*;

class Main {
    static long M, N, m0, md, n0, nd;
    static long[] S, T;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");
        M = Long.parseLong(arr[0]);
        N = Long.parseLong(arr[1]);
        m0 = Long.parseLong(arr[2]);
        md = Long.parseLong(arr[3]);
        n0 = Long.parseLong(arr[4]);
        nd = Long.parseLong(arr[5]);
        in.close();

        S = new long[(int)M+1];
        S[0] = m0;
        long mi = m0;
        for (int i = 1; i < M; i++) {
            mi = (mi * 58 + md) % (N + 1);
            S[i] = mi;
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i+1] += S[i];
        }

        T = new long[(int)N+1];
        T[0] = n0;
        long ni = n0;
        for (int i = 1; i < N; i++) {
            ni = (ni * 58 + nd) % (M + 1);
            T[i] = ni;
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i+1] += T[i];
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i <= M; i++) {
            int j = Arrays.binarySearch(T, (M - i)*(N - 1) + S[i]);
            if (j < 0) j = -j - 1;
            ans = Math.min(ans, (M - i)*(N - j) + S[i] + T[j]);
        }
        System.out.println(ans);
    }
}