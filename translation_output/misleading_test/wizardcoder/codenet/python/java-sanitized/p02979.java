import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        int L = (N+1)/2+1;

        int[][][] dp = new int[N+1][L+1][L+1];
        dp[0][0][L] = 1;

        for (int i = 0; i < N; i++) {
            int[][][] dp1 = new int[N+1][L+1][L+1];
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    for (int z = Math.max(x, y)+1; z <= L; z++) {
                        if (dp[i][x][y] == 0) continue;
                        dp1[i+1][y][x+1] = (dp1[i+1][y][x+1] + dp[i][x][y]) % M;
                        if (y!= x) {
                            dp1[i+1][x+1][y+1] = (dp1[i+1][x+1][y+1] + dp[i][x][y]) % M;
                        }
                        if (2*y >= K+3 && x > 0) {
                            dp1[i+1][0][z] = (dp1[i+1][0][z] + dp[i][x][y]) % M;
                        } else {
                            dp1[i+1][y-x+K/2+1][z] = (dp1[i+1][y-x+K/2+1][z] + dp[i][x][y]) % M;
                        }
                    }
                }
            }
            dp = dp1;
        }

        int ret = 0;
        for (int x = 0; x <= L; x++) {
            for (int y = 0; y <= L; y++) {
                for (int z = Math.max(x, y)+1; z <= L; z++) {
                    ret = (ret + dp[N][x][y]) % M;
                }
            }
        }

        System.out.println(ret);
    }
}