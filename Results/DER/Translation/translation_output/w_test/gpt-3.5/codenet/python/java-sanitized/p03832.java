import java.util.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int MOD = (int) Math.pow(10, 9) + 7;
        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];

        long[] dp = new long[N + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            int v = fact[i] = (int) ((long) fact[i - 1] * i % MOD);
            frev[i] = pow(v, MOD - 2, MOD);
        }

        int[] Y = new int[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                Y[p + g*j] = (int) ((long) pow(y, j, MOD) * frev[j] % MOD);
            }
            for (int i = p; i <= N; i++) {
                long sum = 0;
                for (int j = p; j <= Math.min(q, i); j += g) {
                    sum += (long) dp[i - j] * fact[N - i + j] % MOD * Y[j] % MOD;
                }
                dp[i] = (dp[i] + frev[N - i] * sum) % MOD;
            }
        }

        System.out.println(dp[N] % MOD);
    }

    public static int pow(int base, int exponent, int MOD) {
        int result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (int) ((long) result * base % MOD);
            }
            base = (int) ((long) base * base % MOD);
            exponent /= 2;
        }
        return result;
    }
}