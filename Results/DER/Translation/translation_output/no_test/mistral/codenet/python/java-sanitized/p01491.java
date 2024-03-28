import java.util.*;
import java.io.*;

public class p01491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int m0 = Integer.parseInt(br.readLine());
        int md = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int nd = Integer.parseInt(br.readLine());

        int[] S = new int[M+1];
        S[0] = m0;
        for (int i = 1; i <= M; i++) {
            S[i] = (S[i-1] * 58 + md) % (N+1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i+1] += S[i];
        }

        int[] T = new int[N+1];
        T[0] = n0;
        for (int i = 1; i <= N; i++) {
            T[i] = (T[i-1] * 58 + nd) % (M+1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i+1] += T[i];
        }

        List<Long> gen = new ArrayList<>();
        long calc(int a, int b) {
            return (M - a)*(N - b) + S[a] + T[b];
        }
        for (int i = 1; i <= 10000000000000000000L; i++) {
            long res = calc(i, N);
            if (res > calc(i, N-1)) {
                break;
            }
            gen.add(res);
        }
        out.println(gen.get(0));
    }
}