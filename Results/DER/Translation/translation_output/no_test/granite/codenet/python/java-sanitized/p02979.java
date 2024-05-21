import java.util.*;

public class p02979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        int L = (N+1)/2 + 1;

        int[][][] dp = new int[N+1][L+1][L+1];
        dp[0][0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    if (2*x >= K+1 && 2*y >= K+3) {
                        continue;
                    }
                    for (int z = Math.max(x, y)+1; z <= L; z++) {
                        dp[i+1][y][x+1] += dp[i][x][y];
                        dp[i+1][y][x+1] %= M;
                        if (2*y >= K+3 && x > 0) {
                            int new_z = Math.min(z, 1+y-x+K/2);
                            dp[i+1][0][0] += dp[i][x][y];
                            dp[i+1][0][0] %= M;
                        }
                    }
                }
            }
        }

        int ans = 0;
        if (K % 2 == 0) {
            ans = (int)((long)dp[N/2][0][0] * dp[(N+1)/2][0][0] % M);
        } else {
            int[][][][] dp2 = new int[L+1][L+1][L+1][L+1][2];
            dp2[0][0][0][L] = 1;
            for (int i = 0; i < N; i++) {
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        for (int z = 0; z <= L; z++) {
                            for (int w = 0; w <= L; w++) {
                                if (2*x >= K+1 && 2*y >= K+3) {
                                    continue;
                                }
                                if (2*z >= K+1 && 2*w >= K+3) {
                                    continue;
                                }
                                dp2[y][x+1][z][w][0] += dp2[x][y][z][w][1];
                                dp2[y][x+1][z][w][0] %= M;
                                if (2*y >= K+3 && x > 0) {
                                    int new_z = Math.min(z, 1+y-x+K/2);
                                    dp2[0][0][0][L][0] += dp2[x][y][z][w][1];
                                    dp2[0][0][0][L][0] %= M;
                                }
                                dp2[y][x+1][z][w][1] += dp2[x][y][z][w][1];
                                dp2[y][x+1][z][w][1] %= M;
                                if (2*y >= K+3 && x > 0) {
                                    int new_z = Math.min(z, 1+y-x+K/2);
                                    dp2[0][0][0][L][1] += dp2[x][y][z][w][1];
                                    dp2[0][0][0][L][1] %= M;
                                }
                            }
                        }
                    }
                }
                for (int x = 0; x <= L; x++) {
                    for (int y = 0; y <= L; y++) {
                        for (int z = 0; z <= L; z++) {
                            for (int w = 0; w <= L; w++) {
                                dp2[x][y][z][w][1] = dp2[x][y][z][w][0];
                                dp2[x][y][z][w][0] = 0;
                            }
                        }
                    }
                }
            }
            for (int x = 0; x <= L; x++) {
                for (int y = 0; y <= L; y++) {
                    for (int z = 0; z <= L; z++) {
                        for (int w = 0; w <= L; w++) {
                            ans += dp2[x][y][z][w][0];
                            ans %= M;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}