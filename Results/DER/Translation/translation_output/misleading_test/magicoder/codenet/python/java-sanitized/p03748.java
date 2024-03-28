import java.util.*;

public class p03748 {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] dp_T;
    static long[] dp_F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        dp_T = new long[N + 1];
        dp_F = new long[N + 1];
        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = Arrays.copyOf(dp_T, dp_T.length);
            long[] prev_F = Arrays.copyOf(dp_F, dp_F.length);
            dp_T = new long[prev_T.length];
            dp_F = new long[prev_F.length];
            // 1st transition
            System.arraycopy(prev_T, 1, dp_T, 0, prev_T.length - 1);
            System.arraycopy(prev_F, 2, dp_F, 1, prev_F.length - 2);
            dp_T[0] += prev_F[1];
            // 2nd transition
            System.arraycopy(prev_T, 1, dp_T, 1, prev_T.length - 1);
            System.arraycopy(prev_F, 2, dp_F, 2, prev_F.length - 2);
            dp_T[1] += prev_F[1];
            // 3rd transition
            System.arraycopy(prev_T, 0, dp_T, 0, prev_T.length - 1);
            System.arraycopy(prev_F, 0, dp_F, 0, prev_F.length - 1);
            // 4th transition
            System.arraycopy(prev_T, 0, dp_T, 1, prev_T.length - 1);
            System.arraycopy(prev_F, 0, dp_F, 1, prev_F.length - 1);

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