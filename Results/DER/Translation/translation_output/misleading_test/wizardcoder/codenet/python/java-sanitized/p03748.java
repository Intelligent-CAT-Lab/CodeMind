import java.util.*;

public class p03748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        long MOD = (long) Math.pow(10, 9) + 7;

        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];

        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T;
            long[] prev_F = dp_F;
            dp_T = new long[N+1];
            dp_F = new long[N+1];

            // èµ¤èµ¤
            for (int j = 0; j < N-1; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j+1]) % MOD;
                dp_F[j+1] = (dp_F[j+1] + prev_F[j+2]) % MOD;
            }
            dp_T[0] = (dp_T[0] + prev_F[1]) % MOD;

            // èµ¤é
            for (int j = 1; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j+1]) % MOD;
                dp_F[j+1] = (dp_F[j+1] + prev_F[j+2]) % MOD;
            }
            dp_T[1] = (dp_T[1] + prev_F[1]) % MOD;

            // éèµ¤
            for (int j = 0; j < N-1; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j]) % MOD;
            }

            // éé
            for (int j = 1; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j]) % MOD;
            }
        }

        long answer = 0;
        for (int i = 0; i < N+1; i++) {
            answer = (answer + dp_T[i]) % MOD;
        }

        System.out.println(answer);
    }
}