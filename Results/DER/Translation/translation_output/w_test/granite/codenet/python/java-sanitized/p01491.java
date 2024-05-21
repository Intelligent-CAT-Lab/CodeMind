import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        long[] S = new long[M+1];
        long mi = m0;
        S[0] = mi;
        for (int i = 1; i < M; i++) {
            mi = (mi * 58 + md) % (N + 1);
            S[i] = mi;
        }
        Arrays.sort(S);
        for (int i = 1; i < M; i++) {
            S[i] += S[i-1];
        }

        long[] T = new long[N+1];
        long ni = n0;
        T[0] = ni;
        for (int i = 1; i < N; i++) {
            ni = (ni * 58 + nd) % (M + 1);
            T[i] = ni;
        }
        Arrays.sort(T);
        for (int i = 1; i < N; i++) {
            T[i] += T[i-1];
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i <= M; i++) {
            int j = Arrays.binarySearch(T, (M - i) * (N + 1) - S[i]);
            if (j < 0) {
                j = -j - 1;
            }
            min = Math.min(min, (M - i) * (N - j) + S[i] + T[j]);
        }
        System.out.println(min);
    }
}