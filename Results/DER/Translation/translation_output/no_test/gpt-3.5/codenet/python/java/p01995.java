```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        HashMap<Character, Integer> alpha2 = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            alpha2.put(alpha.charAt(i), i);
        }
        ArrayList<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }

        int mod = 1000000007;

        for (int i = 0; i < l; i++) {
            memo[alpha2.get(s.charAt(i))].add(i);
        }

        int[][] dp = new int[l + 1][l + 1];
        dp[0][l] = 1;

        long ans = 0;

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                int p = dp[i][j];
                if (p == 0) continue;
                for (int k = 0; k < 26; k++) {
                    int x = bl(memo[k], i);
                    int y = br(memo[k], j - 1) - 1;
                    if (x > y) continue;
                    ans += p;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans %= mod;
            }
        }

        ans = (ans + Arrays.stream(dp).mapToInt(row -> Arrays.stream(row).sum() % mod).sum() + mod - 1) % mod;
        System.out.println(ans);
    }

    static int bl(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    static int br(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
```
```
