import java.util.*;

public class p02636 {
    static int mod = 998244353;
    static int N = 2 * 10 ** 3;
    static int[] g1 = new int[N + 1];
    static int[] g2 = new int[N + 1];
    static int[] inverse = new int[N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Zero = 1 - Integer.parseInt(S.charAt(0)) + 1 - Integer.parseInt(S.charAt(1));
        int One = Integer.parseInt(S.charAt(0)) + Integer.parseInt(S.charAt(1));

        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
        inverse[0] = 0;

        int[] dp = new int[N + 1][N + 2][N + 2];
        int[] dpf = new int[N + 1][N + 2][N + 2];

        Arrays.fill(dp[0], Arrays.fill(dp[0][0], -10 ** 15), Arrays.fill(dp[0][N + 1], -10 ** 15));
        Arrays.fill(dpf[0], Arrays.fill(dpf[0][0], -10 ** 15), Arrays.fill(dpf[0][N + 1], -10 ** 15));

        dpf[0][0][0] = 1;
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

        int ans = 0;
        for (int i = 2; i <= N; i++) {
            Zero += 1 - Integer