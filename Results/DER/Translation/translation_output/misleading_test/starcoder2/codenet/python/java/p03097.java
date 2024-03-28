
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (pop_count(a^b) % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(Arrays.toString(f(n, a, b)));
        }
    }

    public static int pop_count(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x>>i)%2 == 1) ? 1 : 0;
        }
        return res;
    }

    public static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
            }
        }

        int[] res = new int[1<<m];
        res[0] = x;
        for (int i = 0; i < m; i++) {
            if ((x>>i) % 2  != (y>>i) % 2) {
                int diff = i;
                break;
            }
        }
        int s = (x % (2**diff)) + (((x // (2**(diff+1))) * 2**(diff+1)) >> 1);
        int t = (y % (2**diff)) + (((y // (2**(diff+1))) * 2**(diff+1)) >> 1);
        int u = s^1;
        int[] left = f(m-1, s, u);
        int[] right = f(m-1, u, t);
        int x_bit = (x>>diff) % 2;
        int y_bit = (y>>diff) % 2;
        for (int i = 0; i < left.length; i++) {
            left[i] = left[i] % (2**diff) + (2**diff * x_bit) + (((left[i] // (2**diff)) * 2**diff) << 1);
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = right[i] % (2**diff) + (2**diff * y_bit) + (((right[i] // (2**diff)) * 2**diff) << 1);
        }
        return left + right;
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

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j-i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
```

## 3. 
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

```
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R-L-1;
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

```
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count[c-'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
```

## 5. 
Given a string, find the length of the longest substring T that contains at
