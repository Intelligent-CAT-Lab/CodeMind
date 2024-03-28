

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);
        String s_sorted = new String(s_arr);
        int l = s_sorted.length();
        int res = l * (l - 1) / 2 + 1;
        int i = 0;
        while (i < l) {
            int j = i + 1;
            while (j < l && s_sorted.charAt(j) == s_sorted.charAt(i)) {
                j++;
            }
            int p = j - i;
            res -= p * (p - 1) / 2;
            i = j;
        }
        System.out.println(res);
    }
}
```

## 2. 
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

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                res = Math.max(res, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        res = Math.max(res, s.length() - start);
        return res;
    }
}
```

## 3. 
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] == -1) {
                last[c] = i;
            } else {
                last[c] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (last[i] >= 0) {
                res = Math.min(res, last[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
```

## 4. 
Given a string, find the length of the longest substring T that contains at most k distinct characters.

Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: T is "aa" which its length is 2.

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] == -1) {
                count++;
            }
            last[c] = i;
            if (count > k) {
                res = Math.max(res, i - start);
                while (count > k) {
                    char c_start = s.charAt(start);
                    if (last[c_start] == start) {
                        count--;
                    }
                    start++;
                }
            }
        }
        res = Math.max(res, s.length() - start);
        return res;
    }
}
```

## 5. 
Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: T is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: T is "aabbb" which its length is 5.

```java
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] == -1) {
                count++;
            }
            last[c] = i;
            if (count > 2) {
                res = Math.max(res, i - start);
                while (count > 2) {
                    char c_start = s.charAt(start);
                    if (last[c_start] == start) {
                        count--;
                    }
                    start++;
                }
            }
        }
        res = Math.max(res, s.length() - start);
        return res;
    }
}
```
 1;
        }
        return res;
    }
}
```

## 3. 
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

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                res = Math.max(res, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        res = Math.max(res, s.length() - start);
        return res;
    }
}
```

## 4. 
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

```java
class Solution {
    public int firstUniqChar(String s) {
        int[] last = new
