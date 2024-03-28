import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class p01995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] alpha2 = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha2[i] = i;
        }
        List<List<Integer>> memo = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            memo.add(new ArrayList<>());
        }
        for (int i = 0; i < l; i++) {
            memo.get(alpha2[s.charAt(i)]).add(i);
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
                    int x = memo.get(k).indexOf(i);
                    int y = memo.get(k).lastIndexOf(j - 1);
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo.get(k).get(x);
                        int my = memo.get(k).get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % 1000000007;
                    }
                }
                ans = ans % 1000000007;
            }
        }
        ans = (ans + Arrays.stream(dp).mapToInt(i -> Arrays.stream(i).sum()).sum() + 1000000007) % 1000000007;
        System.out.println(ans);
    }
}