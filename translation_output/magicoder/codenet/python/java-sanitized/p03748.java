import java.util.*;

public class p03748 {
    static final long MOD = 1000000007;
    static long[] dp_T, dp_F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        dp_T = new long[N + 1];
        dp_F = new long[N + 1];
        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = Arrays.copyOf(dp_T, dp_T.length);
            long[] prev_F = Arrays.copyOf(dp_F, dp_F.length);
            dp_T = new long[prev_T.length];
            dp_F = new long[prev_F.length];

            for (int j = 1; j < prev_T.length; j++) {
                dp_T[j - 1] += prev_T[j];
                dp_F[j - 1] += prev_F[j];
            }
            dp_T[0] += prev_F[1];

            for (int j = 2; j < prev_T.length; j++) {
                dp_T[j] += prev_T[j];
                dp_F[j] += prev_F[j];
            }
            dp_T[1] += prev_F[1];

            for (int j = 0; j < prev_T.length - 1; j++) {
                dp_T[j] += prev_T[j];
                dp_F[j] += prev_F[j];
            }

            for (int j = 0; j < prev_T.length - 1; j++) {
                dp_T[j + 1] += prev_T[j];
                dp_F[j + 1] += prev_F[j];
            }

            for (int j = 0; j < dp_T.length; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }

        long answer = 0;
        for (long num : dp_T) {
            answer += num;
            answer %= MOD;
        }
        System.out.println(answer);
    }
}