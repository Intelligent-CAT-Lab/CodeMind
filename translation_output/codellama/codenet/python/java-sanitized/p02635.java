import java.util.Scanner;

public class p02635 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int K = scanner.nextInt();
        scanner.close();

        K = Math.min(K, 300);
        int mod = 998244353;
        int[] a = new int[S.length()];
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a[i] = val;
                val = 0;
            } else {
                val++;
            }
        }

        if (val != 0) {
            a[S.length()] = val;
        }

        int m = a.length;
        K = Math.min(sum(a), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 1; i < m; i++) {
            b[i] = b[i - 1] + a[i];
        }
        b[0] = 0;
        for (int i = m - 2; i >= 0; i--) {
            c[i] = c[i + 1] + a[i];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = Math.min(b[i], K); k >= 0; k--) {
                for (int j = Math.min(K, k + c[i]); j >= 0; j--) {
                    int M = Math.max(k - j, -a[i]);
                    dp[i][j][k] = sum(dp[i + 1][j + l][k] for l in range(max(0, M), K - j + 1)) + sum(dp[i + 1][j][k + l] for l in range(1, min(K - k, -M) + 1));
                    dp[i][j][k] %= mod;
                }
            }
        }

        System.out.println(dp[0][0][0]);
    }

    private static int sum(int[][][] dp) {
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                for (int k = 0; k < dp[i][j].length; k++) {
                    result += dp[i][j][k];
                }
            }
        }
        return result;
    }
}