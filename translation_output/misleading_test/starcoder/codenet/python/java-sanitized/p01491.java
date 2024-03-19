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
        int[] dp = new int[M+1];
        for (int i = 0; i < M; i++) {
            dp[i] = 1000000000;
        }
        dp[0] = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                dp[i+1] = Math.min(dp[i+1], dp[i] + (M - i) * (N - j) + S[i] + T[j]);
            }
        }
        System.out.println(dp[M]);
    }
}