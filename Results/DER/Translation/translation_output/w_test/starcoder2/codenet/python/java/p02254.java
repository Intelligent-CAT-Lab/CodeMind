

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        Map<Character, Integer> dict_string = new HashMap<>();
        Map<Character, Integer> dict_depth = new HashMap<>();

        for (char s : S.toCharArray()) {
            if (dict_string.containsKey(s)) {
                dict_string.put(s, dict_string.get(s) + 1);
            } else {
                dict_string.put(s, 1);
                dict_depth.put(s, 0);
            }
        }

        Map<Character, Integer> dict_string_calc = new HashMap<>(dict_string);

        while (dict_string_calc.size() != 1) {
            Character x = null;
            Character y = null;

            for (Map.Entry<Character, Integer> entry : dict_string_calc.entrySet()) {
                if (x == null) {
                    x = entry.getKey();
                    int x_cnt = entry.getValue();
                    continue;
                }

                if (y == null) {
                    y = entry.getKey();
                    int y_cnt = entry.getValue();
                    break;
                }
            }

            for (char s : (x + y).toCharArray()) {
                if (dict_depth.containsKey(s)) {
                    dict_depth.put(s, dict_depth.get(s) + 1);
                } else {
                    throw new RuntimeException();
                }
            }

            dict_string_calc.remove(x);
            dict_string_calc.remove(y);
            dict_string_calc.put(x + y, dict_string.get(x) + dict_string.get(y));
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> entry : dict_depth.entrySet()) {
            ans += dict_string.get(entry.getKey()) * entry.getValue();
        }

        if (dict_string.size() == 1) {
            ans = S.length();
        }

        System.out.println(ans);
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
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;
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

```java
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }

        return R - L - 1;
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
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
```

## 5.

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
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0) {
            return 0;
        }

        int ans = 0;
        int i = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            if (map.size() <= k) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                j++;
            }

            if (map.size() > k) {
                char c = s.charAt(i);
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
                i++;
            }

            ans = Math.max(ans, j - i);
        }

        return ans;
    }
}
```

## 6.

Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: T
