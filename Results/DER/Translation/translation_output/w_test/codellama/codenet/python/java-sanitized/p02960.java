import java.util.Scanner;

public class p02960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int l = S.length();
        int mod = 1000000007;
        int[][] dp = new int[l+1][13];
        dp[0][0] = 1;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < 13; j++) {
                if (S.charAt(i) == '?') {
                    for (int k = 0; k < 10; k++) {
                        dp[i+1][((j*10)+k)%13] += dp[i][j];
                        dp[i+1][((j*10)+k)%13] %= mod;
                    }
                } else {
                    dp[i+1][((j*10)+Integer.parseInt(S.substring(i, i+1)))%13] += dp[i][j];
                    dp[i+1][((j*10)+Integer.parseInt(S.substring(i, i+1)))%13] %= mod;
                }
            }
        }

        System.out.println(dp[l][5]);
    }
}