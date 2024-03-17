
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        int K = Integer.parseInt(input[2]);
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        int[] C = new int[A.length];
        System.out.println(solve(A, B, K, A.length - 1, 0));
    }

    public static int solve(int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(A).replaceAll("[^0-9]", ""));
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
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
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last[s.charAt(i)] >= start) {
                max = Math.max(max, i - start);
                start = last[s.charAt(i)] + 1;
            }
            last[s.charAt(i)] = i;
        }
        return Math.max(max, s.length() - start);
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
            if (last[s.charAt(i)] == -1) {
                last[s.charAt(i)] = i;
            } else {
                last[s.charAt(i)] = -2;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < last.length; i++) {
            if (last[i] >= 0) {
                min = Math.min(min, last[i]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
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
        int max = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last[s.charAt(i)] == -1) {
                count++;
            }
            last[s.charAt(i)] = i;
            if (count > k) {
                max = Math.max(max, i - start);
                while (count > k) {
                    if (last[s.charAt(start)] == start) {
                        count--;
                    }
                    last[s.charAt(start)] = -1;
                    start++;
                }
            }
        }
        return Math.max(max, s.length() - start);
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
        int max = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (last[s.charAt(i)] == -1) {
                count++;
            }
            last[s.charAt(i)] = i;
            if (count > 2) {
                max = Math.max(max, i - start);
                while (count > 2) {
                    if (last[s.charAt(start)] == start) {
                        count--;
                    }
                    last[s.charAt(start)] = -1;
                    start++;
                }
            }
        }
        return Math.max(max, s.length() - start);
    }
}
```

## 6.

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
