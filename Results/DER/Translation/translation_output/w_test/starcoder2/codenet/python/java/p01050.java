

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] abc = new int[28];
        int[] num = new int[12];
        int abc_cnt = 0;
        int num_cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                abc[c - 'a' + 1]++;
                abc_cnt++;
            } else if (c >= '0' && c <= '9') {
                num[c - '0' + 1]++;
                num_cnt++;
            }
        }
        int ans = 0;
        while (abc_cnt > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc[current - 1] == 0 && abc[current] > 0) {
                    start = Math.min(start, current);
                }
                if (abc[current + 1] == 0 && abc[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abc[current]--;
                    abc_cnt--;
                    break;
                }
                if (abc[current] > 0) {
                    abc[current]--;
                    abc_cnt--;
                }
                current++;
            }
        }
        while (num_cnt > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num[current - 1] == 0 && num[current] > 0) {
                    start = Math.min(start, current);
                }
                if (num[current + 1] == 0 && num[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    num[current]--;
                    num_cnt--;
                    break;
                }
                if (num[current] > 0) {
                    num[current]--;
                    num_cnt--;
                }
                current++;
            }
        }
        System.out.println(ans);
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

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] >= start) {
                ans = Math.max(ans, i - start);
                start = last[c] + 1;
            }
            last[c] = i;
        }
        ans = Math.max(ans, s.length() - start);
        return ans;
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
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (last[i] >= 0) {
                ans = Math.min(ans, last[i]);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
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

```java
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0;
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last[c] == -1) {
                cnt++;
            }
            last[c] = i;
            while (cnt > k) {
                char c2 = s.charAt(start);
                if (last[c2] == start) {
                    cnt--;
                }
                start++;
            }
            ans = Math
