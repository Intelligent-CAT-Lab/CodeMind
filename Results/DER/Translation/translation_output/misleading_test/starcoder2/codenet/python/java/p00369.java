

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(min(checkEqual(S), check12(S)));
    }

    public static int sub(String maxs, String mins) {
        for (int i = 0; i < maxs.length(); i++) {
            if (maxs.charAt(i) != mins.charAt(i)) {
                if (i == maxs.length() - 1) {
                    return Integer.parseInt(maxs.substring(i, i + 1)) - Integer.parseInt(mins.substring(i, i + 1));
                }
                if (i == maxs.length() - 2) {
                    return Integer.parseInt(maxs.substring(i, i + 2)) - Integer.parseInt(mins.substring(i, i + 2));
                }
                return 10;
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 1; k < S.length(); k++) {
            if (S.length() % k != 0) {
                continue;
            }
            String mins = S.substring(0, k);
            String maxs = S.substring(0, k);
            for (int s = 0; s < S.length(); s += k) {
                maxs = max(maxs, S.substring(s, s + k));
                mins = min(mins, S.substring(s, s + k));
            }
            ans = min(ans, sub(maxs, mins));
        }
        return ans;
    }

    public static int check12(String S) {
        int maxv = 0;
        int minv = 10;
        int p = 0;
        while (p < S.length()) {
            int v = Integer.parseInt(S.substring(p, p + 1));
            if (S.charAt(p) == '1' && p + 1 < S.length()) {
                v = 10 + Integer.parseInt(S.substring(p + 1, p + 2));
                p += 1;
            }
            maxv = max(maxv, v);
            minv = min(minv, v);
            p += 1;
        }
        return maxv - minv;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static String max(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static String min(String a, String b) {
        return a.compareTo(b) < 0 ? a : b;
    }
}

```

## 2. 
Given a string S, find the longest substring T that contains at most 2 distinct characters.

For example,
Given S = “eceba”,

T is "ece" which its length is 3.

```
public class Solution {
    public String longestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int[] map = new int[256];
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int maxStart = 0;
        while (end < s.length()) {
            if (map[s.charAt(end)] == 0) {
                map[s.charAt(end)] = 1;
            } else {
                map[s.charAt(end)]++;
            }
            end++;
            while (end - start > 2) {
                map[s.charAt(start)]--;
                if (map[s.charAt(start)] == 0) {
                    break;
                }
                start++;
            }
            if (end - start > maxLen) {
                maxLen = end - start;
                maxStart = start;
            }
        }
        return s.substring(maxStart, maxStart + maxLen);
    }
}
```

## 3. 
Given a string S and a string T, count the number of distinct subsequences of T in S.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, “ACE” is a subsequence of “ABCDE” while “AEC” is not).

Here is an example:
S = "rabbbit", T = "rabbit"

Return 3.

```
public class Solution {
    public int numDistinct(String S, String T) {
        if (S == null || T == null || S.length() < T.length()) {
            return 0;
        }
        int[][] dp = new int[S.length() + 1][T.length() + 1];
        for (int i = 0; i <= S.length(); i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[S.length()][T.length()];
    }
}
```

## 4. 
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the emtpy string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.

```
public class Solution {
    public String minWindow(String S, String T) {
        if (S == null || T == null || S.length() < T.length()) {
            return "";
        }
        int[] map = new int[256];
        for (int i = 0; i < T.length(); i++) {
            map[T.charAt(i)]++;
        }
        int start = 0;
        int end = 0;
        int count = T.length();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        while (end < S.length()) {
            if (map[S.charAt(end)] > 0) {
                count--;
            }
            map[S.charAt(end)]--;
            end++;
            while (count == 0) {
