import java.util.*;
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
        int mi = m0;
        S[0] = mi;
        for (int i = 1; i < M; i++) {
            mi = (mi * 58 + md) % (N + 1);
            S[i] = mi;
        }
        Arrays.sort(S);
        for (int i = 1; i < M; i++) {
            S[i] += S[i-1];
        }
        int[] T = new int[N+1];
        int ni = n0;
        T[0] = ni;
        for (int i = 1; i < N; i++) {
            ni = (ni * 58 + nd) % (M + 1);
            T[i] = ni;
        }
        Arrays.sort(T);
        for (int i = 1; i < N; i++) {
            T[i] += T[i-1];
        }
        int[] dp = new int[M+1];
        Arrays.fill(dp, 1000000000);
        dp[0] = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                dp[i+1] = Math.min(dp[i+1], dp[i] + (M - i) * (N - j) + S[i] + T[j]);
            }
        }
        System.out.println(dp[M]);
    }
}