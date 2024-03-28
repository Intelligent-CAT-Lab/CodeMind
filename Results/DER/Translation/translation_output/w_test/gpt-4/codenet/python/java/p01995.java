Here is the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int l = s.length();
        int[] alpha2 = new int[26];
        for (int i = 0; i < alpha.length(); i++) {
            alpha2[alpha.charAt(i) - 'a'] = i;
        }
        List<List<Integer>> memo = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            memo.add(new ArrayList<>());
        }
        long mod = 1000000007;
        for (int i = 0; i < l; i++) {
            memo.get(alpha2[s.charAt(i) - 'a']).add(i);
        }
        long[][] dp = new long[l + 1][l + 1];
        dp[0][l] = 1;
        long ans = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                long p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    List<Integer> list = memo.get(k);
                    int x = Collections.binarySearch(list, i);
                    int y = Collections.binarySearch(list, j - 1);
                    if (x < 0) x = -x - 1;
                    if (y < 0) y = -y - 2;
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = list.get(x), my = list.get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % mod;
                    }
                }
                ans = ans % mod;
            }
        }
        for (long[] row : dp) {
            for (long val : row) {
                ans = (ans + val) % mod;
            }
        }
        ans = (ans + mod - 1) % mod;
        System.out.println(ans);
        scanner.close();
    }
}
```

The Java code uses `Scanner` for input, `ArrayList` instead of the dynamic Python lists, and `Collections.binarySearch` to replicate the behaviour of `bisect_left` and `bisect_right`. Note that Java's binary search will return a negative value `(insertion point - 1)` if the key is not present, therefore we've added logic to convert these negative return values into indices equivalent to Python's `bisect`'s left and right variants (with some additional adjustments). Please ensure that you run this code into a Java environment with at least Java 7, since `Collections.binarySearch` is used, which is part of the standard library from Java 7 onward.
