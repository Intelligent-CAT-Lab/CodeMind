

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = (int)1e9 + 7;
    static final int MAX = 1000000;
    static int N, M;
    static long[] pow2, ipow2;
    static long[] dp;

    static void update(long[] dp) {
        long[] B = dp.clone();
        long[] C = new long[M + 1];
        for (int i = 0; i < M; i++) {
            C[i] = (B[i] * i % MOD * ipow2[i] % MOD) % MOD;
        }
        for (int i = 1; i < M + 1; i++) {
            dp[i] = (dp[i - 1] + C[i - 1]) % MOD;
        }
        for (int i = 0; i < M; i++) {
            dp[i + 1] = (dp[i + 1] * pow2[i] % MOD) % MOD;
        }
        for (int i = 1; i < M + 2; i++) {
            dp[i] = (dp[i] + i * B[i - 1]) % MOD;
        }
    }

    static long[] make_power(long a, int L) {
        int B = Integer.highestOneBit(L);
        long[] x = new long[1 << B];
        x[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = x[i - (1 << n)] * a % MOD;
            }
            a = a * a % MOD;
        }
        return Arrays.copyOf(x, L);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        pow2 = make_power(2, M + 10);
        ipow2 = make_power((1 + MOD) / 2, M + 10);
        dp = pow2.clone();
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }
}
```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        for (int i = 0; i < n / 2; i++) {
            char tmp = c[i];
            c[i] = c[n - i - 1];
            c[n - i - 1] = tmp;
        }
        return new String(c);
    }
}
```

## 3.

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                ans = Math.max(ans, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        ans = Math.max(ans, n - start);
        return ans;
    }
}
```

## 4.

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
```

## 5.

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"

```java
public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
```

## 6.

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of
