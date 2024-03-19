import java.util.Scanner;

public class p02634 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int mod = 998244353;
        int[][] dp = new int[c + 2][d + 2];
        for (int i = 0; i < c + 2; i++) {
            for (int j = 0; j < d + 2; j++) {
                dp[i][j] = (j + 2) * (i + 2) * (i + 1) * (j + 1);
            }
        }
        for (int i = a; i <= c; i++) {
            for (int j = b; j <= d; j++) {
                dp[i][j] %= mod;
                dp[i + 1][j] += dp[i][j] * j;
                dp[i][j + 1] += dp[i][j] * i;
                dp[i + 1][j + 1] -= dp[i][j] * i * j;
            }
        }
        System.out.println(dp[c][d]);
    }
}