import java.util.*;

public class p03748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = 1000000007;
        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T;
            long[] prev_F = dp_F;
            dp_T = new long[N+1];
            dp_F = new long[N+1];
            // 11
            dp_T[0] += prev_T[1];
            dp_F[1] += prev_F[2];
            dp_T[1] += prev_F[1];
            // 10
            dp_T[0] += prev_F[1];
            dp_F[1] += prev_T[1];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            // 01
            dp_T[0] += prev_F[1];
            dp_F[1] += prev_T[1];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            // 00
            dp_T[0] += prev_T[1];
            dp_F[1] += prev_F[2];
            dp_T[1] += prev_T[1];
            dp_F[2] += prev_F[2];
            for (int j = 0; j < N+1; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i < N+1; i++) {
            answer += dp_T[i];
            answer %= MOD;
        }
        System.out.println(answer);
    }
}