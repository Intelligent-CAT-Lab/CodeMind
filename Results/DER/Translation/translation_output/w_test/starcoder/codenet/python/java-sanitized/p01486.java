import java.util.*;
public class p01486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean[][] dp = new boolean[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][i] = true;
        }
        for (int w = 3; w <= n; w += 3) {
            for (int left = 0; left + w <= n; left++) {
                int right = left + w;
                if (s.charAt(left)!='m' || s.charAt(right - 1)!= 'w') {
                    continue;
                }
                for (int mid = left + 1; mid < right; mid++) {
                    if (s.charAt(mid) == 'e' && dp[left + 1][mid] && dp[mid + 1][right - 1]) {
                        dp[left][right] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(dp[0][n]? "Cat" : "Rabbit");
    }
}