import java.util.*;

public class p02635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);
        int mod = 998244353;
        ArrayList<Integer> a = new ArrayList<>();
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
        K = Math.min(a.stream().mapToInt(Integer::intValue).sum(), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];
        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        ArrayList<Integer> b = new ArrayList<>(a);
        ArrayList<Integer> c = new ArrayList<>(a);
        for (int i = 1; i < m; i++) {
            b.set(i, b.get(i) + b.get(i - 1));
        }
        b.add(0, 0);
        for (int i = m - 2; i >= 0; i--) {
            c.set(i, c.get(i) + c.get(i + 1));
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(b.get(i), K); k++) {
                for (int j = 0; j <= Math.min(K, k + c.get(i)); j++) {
                    int M = Math.max(k - j, -a.get(i));
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