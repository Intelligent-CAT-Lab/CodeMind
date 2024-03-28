import java.util.*;
public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            int ans = 0;
            if (i > 9) {
                ans = dp[i - 1];
            } else {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    ans = dp[i - 1];
                }
            }
            for (int j = 0; j < 3; j++) {
                int num = i + j * 7;
                if (num > N) {
                    break;
                }
                ans += dp[num];
            }
            dp[i] = ans;
        }
        System.out.println(dp[N]);
    }
}