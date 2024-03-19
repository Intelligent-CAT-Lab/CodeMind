import java.util.*;
import java.io.*;

public class p01491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[1000][1000];
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int m0 = Integer.parseInt(br.readLine());
        int md = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int nd = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
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
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                long val = (long) (M - i) * (N - j) + S[i] + T[j];
                gen.add(val);
            }
        }
        Collections.sort(gen);
        out.println(gen.get(0));
        out.flush();
    }
}