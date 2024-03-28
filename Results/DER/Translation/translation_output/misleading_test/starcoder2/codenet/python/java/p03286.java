

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }
        int[] l = new int[100];
        int i = 0;
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l[i++] = r;
                N -= (int) Math.pow(2, r);
            } else {
                int r = minus(N);
                l[i++] = r;
                N += (int) Math.pow(2, r);
            }
        }
        int[] s = new int[i];
        for (int j = 0; j < i; j++) {
            s[j] = l[j];
        }
        for (int j = 0; j < i; j++) {
            System.out.print(s[j]);
        }
        System.out.println();
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += (int) Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }

    public static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= (int) Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}

```

## 2. 2019-09-10

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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] m = new int[256];
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m[c] > start) {
                start = m[c];
            }
            m[c] = i + 1;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 3. 2019-09-11

### 3.1. 题目

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

### 3.2. 解答

```
class Solution {
    public int firstUniqChar(String s) {
        int[] m = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m[c] == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 4. 2019-09-12

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

```
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] m = new int[256];
        int max = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m[c] == 0) {
                count++;
            }
            m[c]++;
            while (count > k) {
                char c2 = s.charAt(start);
                m[c2]--;
                if (m[c2] == 0) {
                    count--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 5. 2019-09-13

### 5.1. 题目

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: T is "ece" which its length is 3.

Example 2:

Input: "ccaabbb"
Output: 5
Explanation: T is "aabbb" which its length is 5.

### 5.2. 解答

```
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] m = new int[256];
        int max = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m[c] == 0) {
                count++;
            }
            m[c]++;
            while (count > 2) {
                char c2 = s.charAt(start);
                m[c2]--;
                if (m[c2] == 0) {
                    count--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
```

## 6. 2019-09-14

### 6.1. 题目

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:
