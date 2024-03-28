

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int first_d = String.valueOf(a).length();
        int tail = a + b * (l - 1);
        int lo = -1;
        int[][] state = {{0, a % m, 1}};
        for (int d = first_d; d < 19; d++) {
            int hi = Math.min((int) Math.pow(10, d) - 1 - a / b, l - 1);
            int cnt = hi - lo;
            int[][] coe = {{(int) Math.pow(10, d, m), 0, 0}, {1, 1, 0}, {0, b % m, 1}};
            coe = exp_np(coe, cnt, m);
            state = dot(state, coe);
            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }
        System.out.println(state[0][0]);
    }

    public static int[][] exp_np(int[][] a, int e, int m) {
        int[][] r = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] t = copy(a);
        while (e != 0) {
            if (e % 2 == 1) {
                r = dot(r, t);
            }
            t = dot(t, t);
            e >>= 1;
        }
        return r;
    }

    public static int[][] dot(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                c[i][j] %= 10007;
            }
        }
        return c;
    }

    public static int[][] copy(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[i][j];
            }
        }
        return b;
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

### 2.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                max = Math.max(max, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        return Math.max(max, s.length() - start);
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

### 3.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                max = Math.max(max, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        return Math.max(max, s.length() - start);
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

### 4.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill
