

```java
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    static int bp(int a, int n) {
        int r = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                r = r * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = x * (2 * n - 1 - i) % mod;
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = y * (i + 1) % mod;
            }
            System.out.println((x * bp(y, mod - 2)) % mod);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = t * (i + 1) % mod;
                y = y * (n - 1 - i) % mod;
                y = y * (n - i) % mod;
                int c = bp(t, mod - 2);
                x = (x + y * c * c % mod) % mod;
            }
            System.out.println(x);
        }
    }
}
```

## 2. 
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java
public String reverseString(String s) {
    char[] c = s.toCharArray();
    int i = 0, j = c.length - 1;
    while (i < j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
        i++;
        j--;
    }
    return new String(c);
}
```
/2017-09-25.md
# 2017-09-25

## 1. 
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public int lengthOfLongestSubstring(String s) {
    int[] m = new int[256];
    int i = 0, j = 0, max = 0;
    while (j < s.length()) {
        if (m[s.charAt(j)] == 0) {
            m[s.charAt(j)]++;
            j++;
            max = Math.max(max, j - i);
        } else {
            m[s.charAt(i)]--;
            i++;
        }
    }
    return max;
}
```

## 2. 
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

```java
public boolean isPalindrome(String s) {
    if (s == null || s.length() == 0) {
        return true;
    }
    int i = 0, j = s.length() - 1;
    while (i < j) {
        while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
            i++;
        }
        while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
            j--;
        }
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}
```
  }
    }
    return max;
}
```
/2017-09-26.md
# 2017-09-26

## 1. 
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (set.contains(num)) {
            return true;
        }
        set.add(num);
    }
    return false;
}
```

## 2. 
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

```java
public int lengthOfLongestSubstring(String s) {
    int[] m = new int[256];
    int i = 0, j = 0, max = 0;
    while (j < s.length()) {
        if (m[s.charAt(j)] == 0) {
            m[s.charAt(j)]++;
            j++;
            max = Math.max(max, j - i);
        } else {
            m[s.charAt(i)]--;
            i++;
      e.

```java
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
```

## 2. 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```java
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++)
