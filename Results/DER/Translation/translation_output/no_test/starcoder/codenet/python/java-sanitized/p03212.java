import java.util.*;

public class p03212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                int num = i * 10 + j;
                if (num > n) {
                    break;
                }
                if (num % 7 == 0 && num % 5 == 0 && num % 3 == 0) {
                    dp[num] += dp[i];
                }
            }
        }

        System.out.println(dp[n]);
    }
}