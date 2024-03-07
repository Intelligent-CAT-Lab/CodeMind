import java.util.Scanner;
import java.util.Arrays;

public class p01995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = i;
        }
        int[][] memo = new int[26][l];
        for (int i = 0; i < l; i++) {
            memo[alpha[s.charAt(i) - 'a']][i] = i;
        }
        int[][] dp = new int[l + 1][l + 1];
        dp[0][l] = 1;
        int ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = Arrays.binarySearch(memo[k], i);
                    int y = Arrays.binarySearch(memo[k], j - 1) - 1;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k][x];
                        int my = memo[k][y];
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % 1000000007;
                    }
                }
                ans = ans % 1000000007;
            }
        }
        ans = (ans + Arrays.stream(dp).mapToInt(Arrays::stream).sum() + 1000000007) % 1000000007;
        System.out.println(ans);
    }
}