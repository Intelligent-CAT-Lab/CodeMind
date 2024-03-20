
```java
import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int lS = S.length();
        int[] d = new int[26];
        for (int i = 0; i < lS; i++) {
            d[S.charAt(i) - 'a']++;
        }
        int dd = 0;
        for (int i = 0; i < 26; i++) {
            if (d[i] % 2 == 1) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i = 0; i < 26; i++) {
                dnm *= factorial(d[i] / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
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
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = temp;
        }
        return new String(chars);
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
        int len = s.length();
        int max = 0;
        int[] map = new int[256];
        for (int i = 0, j = 0; i < len; i++) {
            if (map[s.charAt(i)] > 0) {
                j = Math.max(j, map[s.charAt(i)]);
            }
            max = Math.max(max, i - j + 1);
            map[s.charAt(i)] = i + 1;
        }
        return max;
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
        return null;
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
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int max = 0;
        int start = 0;
        for (int i = 0; i < len; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len3 = Math.max(len1, len2);
            if (len3 > max) {
                max = len3;
                start = i - (len3 - 1) / 2;
            }
        }
        return s.substring(start, start + max);
    }

    private int expand(String s, int left, int right) {
        int len = s.length();
        while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
```

## 6.

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

```java
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int len = s.length();
        int i = 0;
        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) {
                sb[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j >= 1 && i < len; j--) {
                sb[j].append(s.charAt(i++));
            }
        }
        for (int j = 1; j < numRows; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}
```

## 7.

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

```java
public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
```

## 8.

Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be
