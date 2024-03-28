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
            bw.write(a * b % mod + "\n");
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
                                ndyn[nj][njj] = (ndyn[nj][njj] + dyn[j][jj]) % mod;
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
                    ans = (ans + dyn[i][j]) % mod;
                }
            }
            bw.write(ans + "\n");
        }

        bw.close();
        br.close();
    }

    public static int solve(int n, int k, int m) {
        if (n == 0) {
            return 1;
        }
        if (dp[n][k]!= 0) {
            return dp[n][k];
        }
        int ans = 0;
        for (int i = 0; i <= k; i++) {
            int a = (i & 1)!= 0? Math.min(i + 1, k) : 0;
            int b = (i & 2)!= 0? Math.max(i - 1, 0) : 0;
            int c = (i & 4)!= 0? Math.max(k - i, 0) : 0;
            int d = (i & 8)!= 0? Math.min(k - i + 1, k) :