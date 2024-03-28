

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = sc.nextInt();
        int[][] dp = new int[2*N][];
        for (int i = 0; i < 2*N; i++) {
            dp[i] = new int[2*N];
        }
        dp[0][0] = 1;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < 2*N; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }
                if (j == 0) {
                    if (i+1 - j <= K) {
                        dp[i+1][i+1] = (dp[i+1][i+1] + dp[i][j]) % mod;
                    }
                } else {
                    if (i+1 - j <= K) {
                        dp[i+1][i+1] = (dp[i+1][i+1] + dp[i][j]) % mod;
                    }
                    if (i+1 - dp[i][j] <= K) {
                        dp[i+1][dp[i][j]] = (dp[i+1][dp[i][j]] + dp[i][j]) % mod;
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 2*N; i++) {
            if (dp[2*N-1][i] == 1) {
                res = (res + dp[2*N-1][i]) % mod;
            }
        }
        System.out.println(res);
    }
}
```

## 2. 2019-09-10

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

### 2.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，每次移动right，如果窗口内没有重复字符，则right右移，否则left右移，直到窗口内没有重复字符，记录窗口的最大长度。

### 2.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
```

## 3. 2019-09-11

### 3.1. 题目

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

### 3.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，每次移动right，如果窗口内没有重复字符，则right右移，否则left右移，直到窗口内没有重复字符，记录窗口的最大长度。

### 3.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
```

## 4. 2019-09-12

### 4.1. 题目

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

### 4.2. 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left=right=0，每次移动right，如果窗口内没有重复字符，则right右移，否则left右移，直到窗口内没有重复字符，记录窗口的最大长度。

### 4.3. 代码

```java
class Solution {
    public int lengthOfLon
