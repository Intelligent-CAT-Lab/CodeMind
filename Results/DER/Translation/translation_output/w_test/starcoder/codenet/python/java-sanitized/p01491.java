import java.util.*;
import java.io.*;
public class p01491 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int m0 = sc.nextInt();
        int md = sc.nextInt();
        int n0 = sc.nextInt();
        int nd = sc.nextInt();
        int[] S = new int[M+1];
        int[] T = new int[N+1];
        S[0] = m0;
        for (int i = 1; i < M; i++) {
            S[i] = (S[i-1] * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 1; i < M; i++) {
            S[i] += S[i-1];
        }
        T[0] = n0;
        for (int i = 1; i < N; i++) {
            T[i] = (T[i-1] * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 1; i < N; i++) {
            T[i] += T[i-1];
        }
        int ans = 1000000000;
        for (int i = 0; i <= M; i++) {
            int j = N;
            for (; j > 0 && (M - i) * (N - j) + S[i] + T[j] > (M - i) * (N - j - 1) + S[i] + T[j - 1]);
            ans = Math.min(ans, (M - i) * (N - j) + S[i] + T[j]);
        }
        System.out.println(ans);
    }
}