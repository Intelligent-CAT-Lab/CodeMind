```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        HashMap<Character, Integer> alpha2 = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            alpha2.put(alpha.charAt(i), i);
        }
        int[][] memo = new int[26][l];
        int mod = (int) Math.pow(10, 9) + 7;
        for (int i = 0; i < l; i++) {
            memo[alpha2.get(s.charAt(i))][i]++;
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
                    int x = findLeft(memo[k], i);
                    int y = findRight(memo[k], j - 1);
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k][x];
                        int my = memo[k][y - 1];
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans %= mod;
            }
        }
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l; j++) {
                ans += dp[i][j];
                ans %= mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        System.out.println(ans);
    }

    private static int findLeft(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private static int findRight(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
```

