
```
s1 = input()
won  = 0
lose = 0
g = 0
p = 0

for i in range(len(s1)):
    if s1[i] == 'g':
        if p == g:
            g += 1
        elif p < g:
            p += 1
            won += 1
    elif s1[i] == 'p':
        if p == g:
            g += 1
            lose += 1
        elif p < g:
            p += 1
        else:
            g += 1
            lose += 1

print(won - lose)
```

## 3.

Write a python program to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.

```
class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0:
            return ""
        if len(strs) == 1:
            return strs[0]
        strs.sort()
        min_len = min(len(strs[0]), len(strs[-1]))
        for i in range(min_len):
            if strs[0][i] != strs[-1][i]:
                return strs[0][:i]
        return strs[0][:min_len]
```

## 4.

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
class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        max_len = 0
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == j-i:
                    max_len = max(max_len, j-i)
        return max_len
```

## 5.

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

```
class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s) == 0:
            return ""
        if len(s) == 1:
            return s
        max_len = 0
        max_str = ""
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if s[i:j] == s[i:j][::-1]:
                    if j-i > max_len:
                        max_len = j-i
                        max_str = s[i:j]
        return max_str
```


```
class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False
        if x < 10:
            return True
        x_str = str(x)
        for i in range(len(x_str)//2):
            if x_str[i] != x_str[-i-1]:
                return False
        return True
```
/leetcode/0009.md
# 9. Palindrome Number

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?

## 1.

```
class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False
        if x < 10:
            return True
        x_str = str(x)
        for i in range(len(x_str)//2):
            if x_str[i] != x_str[-i-1]:
                return False
        return True
```

## 2.

```
class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False
        if x < 10:
            return True
        x_str = str(x)
        for i in range(len(x_str)//2):
            if x_str[i] != x_str[-i-1]:
                return False
        return True
```

## 3.

```
class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False
        if x < 10:
            return True
        x_str = str(x)
        for i in range(len(x_str)//2):
            if x_str[i] != x_str[-i-1]:
                return False
        return True
```

## 4.

```
class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False
        if x < 10:
            return True
        x_str = str(x)
        for i in range(len(x_str)//2):
            if x_str[i] != x_str[-i-1]:
