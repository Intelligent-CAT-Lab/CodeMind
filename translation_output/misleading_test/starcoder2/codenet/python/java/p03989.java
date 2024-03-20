
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 924844033;
        int rng = 2010;
        long[] fctr = new long[rng];
        long[] finv = new long[rng];
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
        for (int i = 1; i < rng; i++) {
            finv[i] = pow(fctr[i], mod - 2, mod);
        }
        long ans = 0;
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i] % mod;
                } else {
                    ans -= cmb(x, i) * fctr[n - i] % mod;
                }
                ans %= mod;
            }
            System.out.println(ans);
            return;
        }
        Map<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j <= k; j++) {
            int a = j;
            int b = k + j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b) {
                    b += 2 * k;
                } else {
                    a += 2 * k;
                }
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }
        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (Map.Entry<Integer, Integer> entry : dc.entrySet()) {
            for (int j = 0; j < entry.getValue(); j++) {
                cpp += entry.getKey();
                cp.add(cpp);
            }
        }
        cp.add(1);
        long[][] dp = new long[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            dp[i] = Arrays.copyOf(dp[i - 1], n + 1);
            if (!cp.contains(i)) {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= mod;
                }
            } else {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= mod;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i] % mod;
            } else {
                ans -= fctr[n - i] * dp[nn][i] % mod;
            }
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    public static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv[n - k] % mod * finv[k] % mod;
        }
    }
}
```

## 2. 2019-09-15

### 2.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

### 2.2. 题解

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
```

## 3. 2019-09-16

### 3.1. 题目

给定一个字符串，请
