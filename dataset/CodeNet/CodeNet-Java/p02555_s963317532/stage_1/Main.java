import java.util.*;

public class Main {

    static int mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        long[] dp = new long[s+1];
        dp[0] = 1;
        for (int i = 0; i < s; i++) {
            for (int j = 3; j <= s; j++) {
                if(s < i + j) break;
                dp[i+j] = (dp[i+j] + dp[i]) %mod;
            }
        }
        System.out.println(dp[s]);
        sc.close();

    }

}
