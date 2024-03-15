import java.util.*;

public class p02635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);
        long mod = 998244353;
        List<Integer> a = new ArrayList<>();
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a.add(val);
                val = 0;
            } else {
                val++;
            }
        }
        if (val != 0) {
            a.add(val);
        }
        int m = a.size();
        K = Math.min(a.stream().mapToInt(i -> i).sum(), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            for (int i = 0; i <= K; i++) {
                dp[m][j][i] = 1;
            }
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 1; i < m; i++) {
            b[i] = b[i - 1] + b[i - 2];
            b[i] %= mod;
        }
        b[0] = 0;
        for (int i = m - 1; i >= 0; i--) {
            c[i] = c[i + 1] + c[i + 2];
            c[i] %= mod;
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= K; k++) {
                for (int j = 0; j <= k; j++) {
                    int M = Math.max(k - j, -a.get(i));
                    dp[i][j][k] = (dp[i + 1][j + M][k] + dp[i + 1][j][k + M]) % mod;
                }
            }
        }
        System.out.println(dp[0][0][0]);
    }
}