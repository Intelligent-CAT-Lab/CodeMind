import java.util.Arrays;
import java.util.Scanner;

public class p03832 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int MOD = (int) Math.pow(10, 9) + 7;
        int[] fact = new int[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        int[] frev = new int[N + 1];
        frev[0] = 1;
        for (int i = 1; i <= N; i++) {
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }

        int[] dp = new int[N + 1];
        dp[0] = 1;

        int[] Y = new int[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            Arrays.fill(Y, p, Math.min(q, N) + 1, y);
            for (int i = p; i <= N; i++) {
                dp[i] = (dp[i] + frev[N - i] * Arrays.stream(Y, p, Math.min(q, i) + 1).map(j -> (int) (pow(y, j, MOD) * frev[j] * fact[N - i + j])).sum()) % MOD;
            }
        }

        System.out.println(dp[N] % MOD);
    }

    public static