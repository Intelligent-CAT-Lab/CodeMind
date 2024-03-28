
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.valueOf(7 + i).factorial().divide(BigInteger.valueOf(i).factorial()).divide(BigInteger.valueOf(7).factorial());
            a[i] = val.intValue();
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }
        for (int i = 0; i < n; i++) {
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
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
        int n = s.length();
        int ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
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
        int n = s.length();
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (cnt[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
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
        int n = s.length();
        int ans = 0;
        int[] cnt = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            cnt[s.charAt(j)]++;
            while (i <= j && Arrays.stream(cnt).filter(x -> x > 0).count() > k) {
                cnt[s.charAt(i)]--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
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
        int n = s.length();
        int ans = 0;
        int[] cnt = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            cnt[s.charAt(j)]++;
            while (i <= j && Arrays.stream(cnt).filter(x -> x > 0).count() > 2) {
                cnt[s.charAt(i)]--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
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

```java
class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] cnt = new int[128];
        for (int i = 0; i < m; i++) {
            cnt[t.charAt(i)]++;
        }
        int ans = Integer.MAX_VALUE;
        String res = "";
        for (int j = 0, i = 0; j < n; j++) {
            cnt[s.charAt(j)]--;
            while (i <= j && Arrays.stream(cnt).filter(x -> x > 0).count() == 0) {
                if (j - i + 1 < ans) {
                    ans = j - i + 1;
                    res = s.substring(i, j + 1);
                }
                cnt[s.charAt(i)]++;
                i++;
            }
        }
        return res;
    }
}
```

## 7. 
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
        int n = s.length();
        int ans = 0;
        int[] cnt = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            cnt[s.charAt(j)]++;
            while (i <= j && Arrays.stream(cnt).filter(x -> x > 0).count() > k) {
                cnt[
