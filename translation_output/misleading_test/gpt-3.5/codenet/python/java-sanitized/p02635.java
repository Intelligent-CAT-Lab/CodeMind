import java.util.*;

public class p02635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        String S = inputs[0];
        int K = Integer.parseInt(inputs[1]);
        K = Math.min(K, 300);
        int mod = 998244353;
        List<Integer> a = new ArrayList<>();
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a.add(val);
                val = 0;
            } else {
                val += 1;
            }
        }
        if (val != 0) {
            a.add(val);
        }
        int m = a.size();
        K = Math.min(a.stream().mapToInt(Integer::intValue).sum(), K);
        
        int[][][] dp = new int[m + 1][K + 1][K + 1];
        
        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = a.get(i) + (i > 0 ? b[i - 1] : 0);
        }
        for (int i = m - 2; i >= 0; i--) {
            c[i] = a.get(i) + c[i + 1];
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(b[i], K); k++) {
                for (int j = 0; j <= Math.min(K, k + c[i]); j++) {
                    int M = Math.max(k - j, -a.get(i));
                    dp[i][j][k] = 0;
                    for (int l = Math.max(0, M); l <= K - j; l++) {
                        dp[i][j][k] += dp[i + 1][j + l][k];
                    }
                    for (int l = 1; l <= Math.min(K - k, -M); l++) {
                        dp[i][j][k] += dp[i + 1][j][k + l];
                    }
                    dp[i][j][k] %= mod;
                }
            }
        }

        System.out.println(dp[0][0][0]);
    }
}