```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        Map<Character, Integer> alphaMap = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            alphaMap.put(alpha.charAt(i), i);
        }
        List<List<Integer>> memo = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            memo.add(new ArrayList<>());
        }
        int mod = 1000000007;
        for (int i = 0; i < l; i++) {
            memo.get(alphaMap.get(s.charAt(i))).add(i);
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
                    List<Integer> memoK = memo.get(k);
                    int x = Collections.binarySearch(memoK, i);
                    int y = Collections.binarySearch(memoK, j - 1);
                    if (x < 0) {
                        x = -x - 1;
                    }
                    if (y < 0) {
                        y = -y - 1 - 1;
                    }
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memoK.get(x);
                        int my = memoK.get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans = ans % mod;
            }
        }
        ans = (ans + sum2DArray(dp) + mod - 1) % mod;
        System.out.println(ans);
    }

    public static int sum2DArray(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum = (sum + num) % 1000000007;
            }
        }
        return sum;
    }
}
```

