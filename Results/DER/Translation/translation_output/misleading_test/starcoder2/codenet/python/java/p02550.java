
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = x;
        int[] s = new int[m];
        s[x] = 1;
        int h = -1;
        int r = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = (arr[i - 1] * arr[i - 1]) % m;
            if (s[arr[i]] == 0) {
                s[arr[i]] = 1;
            } else {
                h = i;
                r = arr[i];
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
        }
        if (h != -1) {
            int[] new_arr = new int[n - h - 1];
            for (int i = 0; i < n - h - 1; i++) {
                new_arr[i] = arr[h + 1 + i];
            }
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum += new_arr[i];
            }
            ssum *= q;
            int r1 = rest % c;
            for (int i = 0; i < r1; i++) {
                ssum += new_arr[i];
            }
            res += ssum;
        }
        System.out.println(res);
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
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = tmp;
        }
        return new String(arr);
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
        int n = s.length();
        int[] arr = new int[256];
        int res = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(arr[s.charAt(j)], i);
            res = Math.max(res, j - i + 1);
            arr[s.charAt(j)] = j + 1;
        }
        return res;
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
        return new int[0];
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
        int n = s.length();
        int max = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > max) {
                max = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + max);
    }
    
    private int expand(String s, int i, int j) {
        int n = s.length();
        while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
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
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
```

## 7.

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
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
