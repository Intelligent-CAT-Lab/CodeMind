import java.util.Scanner;

public class p02636 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();
        int[][][] dp = new int[N + 1][N + 2][N + 2];
        int[][][] dpf = new int[N + 1][N + 2][N + 2];
        int[][] g1 = new int[N + 1][N + 2];
        int[][] g2 = new int[N + 1][N + 2];
        int[] inverse = new int[N + 1];
        int mod = 998244353;

        for (int i = 2; i <= N; i++) {
            g1[i][i] = (g1[i - 1][i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i)) % mod;
            g2[i][i] = (g2[i - 1][i - 1] * inverse[i]) % mod;
        }

        dp[0][0][0] = 1;
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
        int Zero = 1 - Integer.parseInt(S.charAt(0)) + 1 - Integer.parseInt(S.charAt(1));
        int One = Integer.parseInt(S.charAt(0)) + Integer.parseInt(S.charAt(1));
        for (int i = 2; i <= N; i++) {
            Zero += 1 - Integer.parseInt(S.charAt(i));
            One += Integer.parseInt(S.charAt(i));
            for (int j = Zero + 1; j >= 0; j--) {
                for (int k = One + 1; k >= 0; k--)