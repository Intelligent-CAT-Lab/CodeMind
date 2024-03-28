import java.io.*;
import java.util.*;

public class Main {
    static int mod = 1000000007;
    static int[][] dp = new int[1001][1001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if (k % 2 == 0) {
            int a = solve(n / 2, k / 2 + 1, m);
            int b = solve((n + 1) / 2, k / 2 + 1, m);
            bw.write(String.valueOf(mul(a, b)));
        } else {
            int[][] dyn = new int[k + 2][k + 2];
            dyn[0][0] = 1;
            int[][] ndyn = new int[k + 2][k + 2];
            for (int i = 0; i < (n | 1) / 2 + k / 2 + 2; i++) {
                for (int[] a : ndyn) {
                    Arrays.fill(a, 0);
                }
                int mask = (i < (n + 1) / 2? 1 : 0) + (i >= k / 2 + 2? 2 : 0);
                for (int m1 = mask; m1!= 0; m1 = (m1 - 1) & mask) {
                    for (int j = 0; j < k + 2; j++) {
                        for (int jj = 0; jj < k + 2; jj++) {
                            int nj = (m1 & 1)!= 0? Math.min(j + 1, k + 1) : 0;
                            int njj = (m1 & 2)!= 0 && (j!= 0 || jj!= 0)? Math.max(j, jj) + 1 : 0;
                            if (nj < k + 2 && njj < k + 2) {
                                ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj]);
                            }
                        }
                    }
                }
                int[][] t = dyn;
                dyn = ndyn;
                ndyn = t;
            }
            int ans = 0;
            for (int i = 0; i < k + 2; i++) {
                for (int j = 0; j < k + 2; j++) {
                    ans = add(ans, dyn[i][j]);
                }
            }
            bw.write(String.valueOf(ans));
        }

        bw.close();
        br.close();
    }

    static int solve(int n, int k, int m) {
        if (n == 0) {
            return 1;
        }
        if (dp[n][k]!= 0) {
            return dp[n][k];
        }
        int ans = 0;
        for (int i = 0; i <= k; i++) {
            int a = solve(n - 1, i, m);
            int b = mul(dp[n - 1][i], pow(m, k - i));
            ans = add(ans, mul(a, b));
        }
        dp[n][k] = ans;
        return ans;
    }

    static int mul(int a, int b) {
        return (int) ((long) a * b % mod);
    }

    static int add(int a, int b) {
        return (a + b) % mod;
    }