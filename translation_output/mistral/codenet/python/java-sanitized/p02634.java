import java.util.*;

public class p02634 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int mod = 998244353;
        int[][] dp = new int[c + 2][d + 2];
        Arrays.fill(dp[a], Arrays.fill(dp[a][b], 1, d + 2, 0));
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