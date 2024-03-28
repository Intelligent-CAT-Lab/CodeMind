import java.util.Scanner;

public class p03748 {
    static final long MOD = (long)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];

        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T.clone();
            long[] prev_F = dp_F.clone();
            dp_T = new long[N+1];
            dp_F = new long[N+1];

            for (int j = 1; j < N; j++) {
                dp_T[j] = (prev_T[j-1] + prev_F[j+1]) % MOD;
                dp_F[j] = (prev_T[j] + prev_F[j-1]) % MOD;
            }

            dp_T[0] = prev_F[1];
            dp_F[1] = prev_T[0];
        }

        long answer = 0;
        for (int i = 0; i <= N; i++) {
            answer = (answer + dp_T[i]) % MOD;
        }

        System.out.println(answer);
    }
}