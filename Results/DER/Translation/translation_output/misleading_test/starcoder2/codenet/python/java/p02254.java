

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

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[len - i - 1];
            chars[len - i - 1] = tmp;
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
        if (len == 0) {
            return 0;
        }
        int max = 1;
        int start = 0;
        int end = 1;
        while (end < len) {
            int i = start;
            for (; i < end; i++) {
                if (s.charAt(i) == s.charAt(end)) {
                    break;
                }
            }
            if (i == end) {
                end++;
                max = Math.max(max, end - start);
            } else {
                start = i + 1;
            }
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
        if (len == 0) {
            return "";
        }
        int max = 1;
        int start = 0;
        int end = 1;
        while (end < len) {
            int i = start;
            for (; i < end; i++) {
                if (s.charAt(i) == s.charAt(end)) {
                    break;
                }
            }
            if (i == end) {
                end++;
                max = Math.max(max, end - start);
            } else {
                start = i + 1;
            }
        }
        return max;
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

For the purpose of this problem, we define empty string as valid palindrome.

```java
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int len = s.length();
        int start = 0;
        int end = len - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start < end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

## 7.

Given a string, find the first non-repeating character in it and
