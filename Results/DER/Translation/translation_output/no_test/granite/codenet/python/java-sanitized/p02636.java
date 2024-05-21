import java.util.*;

public class p02636 {
    static int MOD = 998244353;
    static int N = 2000;
    static int[][][] dp = new int[N+1][N+1][N+1];
    static int[][][] dpf = new int[N+1][N+1][N+1];
    static int[] g1 = new int[N+1];
    static int[] g2 = new int[N+1];
    static int[] inverse = new int[N+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        if (N == 1) {
            System.out.println(1);
            return;
        }
        long start = System.currentTimeMillis();
        g1[0] = 1;
        g2[0] = 1;
        inverse[0] = 0;
        for (int i = 1; i <= N; i++) {
            g1[i] = (int) (((long) g1[i - 1] * i) % MOD);
            inverse[i] = (int) (((long) -inverse[MOD % i] * (MOD / i)) % MOD);
            g2[i] = (int) (((long) g2[i - 1] * inverse[i]) % MOD);
        }
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    dp[i][j][k] = -100000;
                    dpf[i][j][k] = -100000;
                }
            }
        }
        dp[0][0][0] = 1;
        dpf[0][0][0] = 0;
        if (S.charAt(0) == '0') {
            dp[1][1][0] = 0;
        }
        if (S.charAt(1) == '0') {
            dp[1][1][0] = 0;
        }
        if (S.charAt(0) == '1') {
            dp[1][0][1] = 0;
        }
        if (S.charAt(1) == '1') {
            dp[1][0][1] = 0;
        }
        dpf[1][0][0] = 2;
        int Zero = 1 - Integer.parseInt(S.charAt(0) + "");
        int One = Integer.parseInt(S.charAt(0) + "") + Integer.parseInt(S.charAt(1) + "");
        for (int i = 2; i < N; i++) {
            Zero += 1 - Integer.parseInt(S.charAt(i) + "");
            One += Integer.parseInt(S.charAt(i) + "");
            for (int j = Zero + 1; j >= 0; j--) {
                for (int k = One + 1; k >= 0; k--) {
                    int a = 1 - Integer.parseInt(S.charAt(i) + "");
                    int b = Integer.parseInt(S.charAt(i) + "");
                    dp[i][j][k] = Math.max(dp[i - 1][j - a][k - b] - 2, dpf[i - 1][j - a][k - b] - 1);
                    a = 1 - Integer.parseInt(S.charAt(i - 1) + "");
                    b = Integer.parseInt(S.charAt(i - 1) + "");
                    dpf[i][j][k] = Math.max(dpf[i - 1][j][k] + 1, dp[i - 1][j][k] + 1 - dp[i - 1][j][k] % 2);
                    dp[i][j][k] = Math.max(dp[i][j][k], 2 * (dpf[i - 2][j - a][k - b] / 2), 2 * (dp[i - 2][j - a][k - b] / 2));
                    if (dp[i][j][k] < 0) {
                        dp[i][j][k] = -100000;
                    }
                    if (dpf[i][j][k] < 0) {
                        dpf[i][j][k] = -100000;
                    }
                }
            }
            dpf[i][0][0] = i + 1;
        }
        String S2 = "";
        for (int i = N - 1; i >= 0; i--) {
            S2 += S.charAt(i);
        }
        Zero = 0;
        One = 0;
        int ans = 1;
        Set<Integer> check = new HashSet<>();
        int one = S.replaceAll("0", "").length();
        int zero = S.replaceAll("1", "").length();
        for (int i = 0; i < N; i++) {
            Zero += (S.charAt(i) == '1')? 1 : 0;
            One += (S.charAt(i) == '0')? 1 : 0;
            for (int j = zero + 1; j >= 0; j--) {
                for (int k = one + 1; k >= 0; k--) {
                    if (dp[N - 1 - i][j][k] >= 0 || dpf[N - 1 - i][j][k] >= 0 && (j, k)!= (0, 0)) {
                        check.add(j * 100000 + k);
                    }
                }
            }
            Set<Integer> ncheck = new HashSet<>();
            for (int j : check) {
                int a = 1;
                int b = 1;
                if (j!= 0) {
                    a = cmb(Zero + j / 100000 - 1, j / 100000, MOD);
                }
                if (j!= 0) {
                    b = cmb(One + j % 100000 - 1, j % 100000, MOD);
                }
                ans += a * b;
                ans %= MOD;
                a = 1 - (S.charAt(i) == '0')? 1 : 0;
                b = (S.charAt(i) == '1')? 1 : 0;
                if (j >= a * 100000 + b) {
                    ncheck.add(j - a * 100000 - b);
                }
            }
            check = ncheck;
            zero -= (S.charAt(i) == '0')? 1 : 0;
            one -= (S.charAt(i) == '1')? 1 : 0;
        }
        System.out.println(ans);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (int) (((long) g1[n] * g2[r]) % mod * g2[n - r]) % mod);
    }
}