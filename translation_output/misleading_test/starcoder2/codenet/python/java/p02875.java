
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        int P = 998244353;
        int[] fa = new int[nn + 1];
        int[] fainv = new int[nn + 1];
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i] * (i + 1) % P;
        }
        fainv[nn] = pow(fa[nn], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        }
        int C = (int) (fa[N] * fainv[N] % P * fainv[N - N] % P);
        int ans = (int) (pow(3, N, P) % P);
        for (int i = N / 2 + 1; i < N + 1; i++) {
            ans = (int) ((ans - 2 * C * pow(2, N - i, P)) % P);
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long P) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = ans * a % P;
            }
            a = a * a % P;
            b >>= 1;
        }
        return ans;
    }
}
```

## 2. 2019-09-16

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

使用滑动窗口，记录窗口内的字符，如果窗口内有重复的字符，则将窗口左边的字符移除，直到窗口内没有重复的字符。

### 2.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
```

## 3. 2019-09-17

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

使用滑动窗口，记录窗口内的字符，如果窗口内有重复的字符，则将窗口左边的字符移除，直到窗口内没有重复的字符。

### 3.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
```

## 4. 2019-09-18

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

使用滑动窗口，记录窗口内的字符，如果窗口内有重复的字符，则将窗口左边的字符移除，直到窗口内没有重复的字符。

### 4.3. 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
```

## 5. 2019-09-19

### 5.1. 题目

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1
