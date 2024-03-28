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
        // Create the dp array, with the dimensions being (c + 2) x (d + 2)
        long[][] dp = new long[c + 2][d + 2];
        
        // Initialize the starting point
        dp[a][b] = 1;
        
        // Fill in the dp array
        for (int i = a; i <= c; i++) {
            for (int j = b; j <= d; j++) {
                dp[i][j] %= mod;
                dp[i + 1][j] += (dp[i][j] * j) % mod;
                dp[i + 1][j] %= mod;
                dp[i][j + 1] += (dp[i][j] * i) % mod;
                dp[i][j + 1] %= mod;
                dp[i + 1][j + 1] -= (dp[i][j] * i * j) % mod;
                if (dp[i + 1][j + 1] < 0) dp[i + 1][j + 1] += mod;
            }
        }
        
        // Print the result
        System.out.println(dp[c][d]);
    }
}