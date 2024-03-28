import java.util.*;

public class p03832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
        int[] fact = new int[N + 1];
        int[] frev = new int[N + 1];
        int[] dp = new int[N + 1];

        Arrays.fill(fact, 1);
        Arrays.fill(frev, 1);

        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = (int) Math.pow(fact[i], MOD - 2, MOD);
        }

        int[] Y = new int[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            int y = frev[g];
            for (int i = p; i <= Math.min(q, N); i++) {
                Y[i] = (int) Math.pow(y, i - p, MOD) * frev[i - p];
            }
            for (int j = p; j <= Math.min(q, N); j += g) {
                dp[j] = (dp[j] + frev[N - j] * Arrays.stream(fact).skip(j).limit(N - j).mapToInt(i -> Y[i]).sum()) % MOD;
            }
        }

        System.out.println(dp[N] % MOD);
    }
}