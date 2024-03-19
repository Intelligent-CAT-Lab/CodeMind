import java.util.*;
import java.io.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int M = in.nextInt();
        int L = (N+1)/2+1;
        int[][][] dp = new int[N+1][L+1][L+1];
        dp[0][0][L] = 1;
        for (int i = 0; i < N; i++) {
            int[][][] dp1 = new int[N+1][L+1][L+1];
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    for (int z = Math.max(x, y); z <= L; z++) {
                        if (dp[i][x][y] == 0) continue;
                        dp1[i+1][y][x+1] += dp[i][x][y];
                        dp1[i+1][y][x+1] %= M;
                        if (y > x) {
                            dp1[i+1][y][z] += dp[i][x][y];
                            dp1[i+1][y][z] %= M;
                        } else {
                            dp1[i+1][y][Math.min(z, 1+y-x+K/2)] += dp[i][x][y];
                            dp1[i+1][y][Math.min(z, 1+y-x+K/2)] %= M;
                        }
                    }
                }
            }
            dp = dp1;
        }
        int ans = 0;
        for (int x = 0; x <= L; x++) {
            for (int y = 0; y <= L; y++) {
                for (int z = Math.max(x, y); z <= L; z++) {
                    ans += dp[N][x][y];
                    ans %= M;
                }
            }
        }
        System.out.println(ans);
    }
}