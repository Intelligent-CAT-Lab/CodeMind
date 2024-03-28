import java.util.Scanner;

public class p01486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        boolean[][] dp = new boolean[len + 1][len + 1];
        for (int i = 0; i < len + 1; i++) {
            dp[i][i] = true;
        }
        for (int w = 3; w <= len; w += 3) {
            for (int left = 0; left <= len - w; left++) {
                int right = left + w;
                if (s.charAt(left) != 'm' || s.charAt(right - 1) != 'w') {
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
        System.out.println(dp[0][len] ? "Cat" : "Rabbit");
    }
}