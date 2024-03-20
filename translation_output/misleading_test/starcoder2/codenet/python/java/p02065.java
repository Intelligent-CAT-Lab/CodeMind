

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        int[][] dp = new int[2 * N][];
        for (int i = 0; i < 2 * N; i++) {
            dp[i] = new int[N + 1];
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j <= N; j++) {
                if (j > K + 1) {
                    continue;
                }
                if (j == 0) {
                    if (i + 1 - j <= K) {
                        dp[i + 1][i + 1] = (dp[i + 1][i + 1] + dp[i][j]) % mod;
                    }
                } else if (i + 1 - j <= K && i + 1 - dp[i][j] <= K) {
                    dp[i + 1][dp[i][j]] = (dp[i + 1][dp[i][j]] + dp[i][j]) % mod;
                }
                if (i + 1 - dp[i][j] <= K) {
                    dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % mod;
                }
            }
        }
        int res = 0;
        for (int i = 0; i <= N; i++) {
            if (i == 1) {
                res = (res + dp[2 * N - 1][i]) % mod;
            }
        }
        System.out.println(res);
    }
}
```

## 2. 2020-09-07

### 2.1. 题目

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

### 2.2. 思路

1. 动态规划
2. 马拉车算法

### 2.3. 代码

```java
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
```

## 3. 2020-09-08

### 3.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest palindromic subsequence is "bb".

### 3.2. 思路

1. 动态规划

### 3.3. 代码

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 4. 2020-09-09

### 4.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest palindromic subsequence is "bb".

### 4.2. 思路

1. 动态规划

### 4.3. 代码

```java
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
```

## 5. 2020-09-10

### 5.1. 题目

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:


