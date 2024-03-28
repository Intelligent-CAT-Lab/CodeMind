
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int left = 0;
        int right = 1000000000;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (calc(mid) <= s - 1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int idx = calc(left);
        int num = left + 1;
        String ans = "";
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += String.valueOf(num);
            }
            num++;
        }
        System.out.println(ans.substring(s - idx - 1, s - idx + 19));
    }

    public static int calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) (Math.log10(m) + 1);
        int fr = (int) (Math.pow(10, c - 1) - 1);
        int to = m;
        return ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
    }

    static int D = 20;
    static int[] ds = new int[D];

    static {
        for (int i = 1; i < D; i++) {
            int fr = (int) (Math.pow(10, i - 1) - 1);
            int to = (int) (Math.pow(10, i) - 1);
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }
    }
}
```

## 2. 2018-09-10

### 2.1. 题目

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

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

## 3. 2018-09-11

### 3.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 3.2. 解答

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int[] first = new int[256];
        Arrays.fill(first, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (first[c] == -1) {
                first[c] = i;
            }
            last[c] = i;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (first[i] != -1 && first[i] == last[i]) {
                min = Math.min(min, first[i]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
```

## 4. 2018-09-12

### 4.1. 题目

Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

### 4.2. 解答

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int max = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] == -1) {
                count++;
            }
            last[c] = i;
            while (count >
