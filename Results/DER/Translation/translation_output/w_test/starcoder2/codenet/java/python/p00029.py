
```python
import sys

s = sys.stdin.read().split()

r = [0] * len(s)
flag = [True] * len(s)

for i in range(len(s)):
    for j in range(i + 1, len(s)):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_index = 0
max_value = 0
for i in range(len(s)):
    if max_value < r[i]:
        max_value = r[i]
        max_index = i

print(s[max_index], end=' ')

max_index = 0
max_value = 0
for i in range(len(s)):
    if max_value < len(s[i]):
        max_value = len(s[i])
        max_index = i

print(s[max_index])
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

```python
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
        min_len = min([len(s) for s in strs])
        for i in range(min_len):
            for j in range(len(strs) - 1):
                if strs[j][i] != strs[j + 1][i]:
                    return strs[0][:i]
        return strs[0][:min_len]
```

## 4.

Write a python program to find the first non-repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: f
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(s[i]) == 1:
                return i
        return -1
```

## 5.

Write a python program to find the first repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: e
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstRepeatingChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(s[i]) > 1:
                return i
        return -1
```

## 6.

Write a python program to find the first repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: e
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstRepeatingChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(s[i]) > 1:
                return i
        return -1
```

## 7.

Write a python program to find the first repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: e
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstRepeatingChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(s[i]) > 1:
                return i
        return -1
```

## 8.

Write a python program to find the first repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: e
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstRepeatingChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(s[i]) > 1:
                return i
        return -1
```

## 9.

Write a python program to find the first repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: e
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstRepeatingChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(s[i]) > 1:
                return i
        return -1
```

## 10.

Write a python program to find the first repeating character in a string.

Example 1:

Input: "GeeksforGeeks"
Output: e
Example 2:

Input: "GeeksQuiz"
Output: G

```python
class Solution:
    def firstRepeatingChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return -1
        if len(s) == 1:
            return 0
        for i in range(len(s)):
            if s.count(
