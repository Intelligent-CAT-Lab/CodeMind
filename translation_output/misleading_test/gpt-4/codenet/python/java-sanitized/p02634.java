import java.util.Scanner;

public class p02634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int mod = 998244353;
        long[][] dp = new long[c + 2][d + 2];
        dp[a][b] = 1;

        for (int i = a; i <= c; i++) {
            for (int j = b; j <= d; j++) {
                dp[i][j] %= mod;
                dp[i + 1][j] += dp[i][j] * j;
                dp[i][j + 1] += dp[i][j] * i;
                dp[i + 1][j + 1] -= dp[i][j] * i * j;

                // Ensuring the values are within the modulus after each operation
                dp[i + 1][j] = ((dp[i + 1][j] % mod) + mod) % mod;
                dp[i][j + 1] = ((dp[i][j + 1] % mod) + mod) % mod;
                dp[i + 1][j + 1] = ((dp[i + 1][j + 1] % mod) + mod) % mod;
            }
        }

        System.out.println(dp[c][d]);
    }
}