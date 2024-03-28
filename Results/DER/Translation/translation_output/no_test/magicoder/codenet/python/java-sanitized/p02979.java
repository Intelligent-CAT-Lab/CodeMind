import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        int L = (N+1)/2+1;

        int[][] dp = new int[N+1][K+1];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i+1][0] = (dp[i+1][0] + dp[i][j]) % M;
                if (j != K) {
                    dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % M;
                }
            }
        }

        int even = sum(dp[N]);

        if (K % 2 == 0) {
            System.out.println(even * even % M);
        } else {
            int[][][] dp0 = new int[L+1][L+1][L+1];
            dp0[0][0][L] = 1;

            for (int i = 0; i < N; i++) {
                int[][][] dp1 = new int[L+1][L+1][L+1];
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        if (loop(x, y)) continue;
                        for (int z = Math.max(x, y)+1; z <= L; z++) {
                            if (dp0[x][y][z] == 0) continue;
                            dp1[y][x+1][z] += dp0[x][y][z];
                            dp1[y][x+1][z] %= M;
                            if (y > x) {
                                int zz = z;
                                if (2*y >= K+3 && x > 0) {
                                    zz = Math.min(zz, 1+y-x+K/2);
                                }
                                dp1[y][0][zz] += dp0[x][y][z];
                                dp1[y][0][zz] %= M;
                            }
                        }
                    }