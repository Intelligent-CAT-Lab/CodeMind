import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        int L = (N+1)/2+1;

        if (K % 2 == 0) {
            int[][] dp = new int[N+1][K+1];
            dp[0][0] = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= K; j++) {
                    dp[i+1][0] = (dp[i+1][0] + dp[i][j]) % M;
                    if (j!= K) {
                        dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % M;
                    }
                }
            }
            int ans = 1;
            for (int i = 0; i <= N/2; i++) {
                ans = (ans * dp[i][K/2]) % M;
            }
            for (int i = N/2+1; i <= N; i++) {
                ans = (ans * dp[i][K/2]) % M;
            }
            System.out.println(ans);
        } else {
            int[][][] dp = new int[L+1][L+1][L+1];
            dp[0][0][L] = 1;
            for (int i = 0; i < N; i++) {
                int[][][] dp1 = new int[L+1][L+1][L+1];
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        for (int z = Math.max(x, y)+1; z <= L; z++) {
                            if (dp[x][y][z] == 0) continue;
                            if (loop(x, y)) continue;
                            int zz = z;
                            if (y > x) {
                                zz = z;
                            } else {
                                zz = L;
                            }
                            if (2*y >= K+3 && x > 0) {
                                zz = Math.min(zz, 1+y-x+K/2);
                            }
                            dp1[y][x+1][zz] = (dp1[y][x+1][zz] + dp[x][y][z]) % M;
                            dp1[y][0][zz] = (dp1[y][0][zz] + dp[x][y][z]) % M;
                        }
                    }
                }
                dp = dp1;
            }
            int ans = 0;
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    for (int z = Math.max(