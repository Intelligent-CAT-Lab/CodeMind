

```
a,b,c = map(int,input().split())
print("Yes" if a+b>=c else "No")
```

## 03408

### 题目

Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

Note:

The input string length won't exceed 1000.

### 题意

给定一个字符串，求出这个字符串中有多少个回文子串。

### 思路

回文串的定义是：一个字符串从左往右读和从右往左读是一样的。

回文子串的定义是：一个字符串的子串是回文串。

回文子串的个数是多少呢？

我们可以枚举字符串的每个位置，然后以这个位置为中心，向两边扩展，看看有多少个回文子串。

### 代码

```
class Solution:
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        ans = 0
        for i in range(n):
            ans += 1
            l, r = i - 1, i + 1
            while l >= 0 and r < n and s[l] == s[r]:
                ans += 1
                l -= 1
                r += 1
            l, r = i, i + 1
            while l >= 0 and r < n and s[l] == s[r]:
                ans += 1
                l -= 1
                r += 1
        return ans
```

## 03409

### 题目

Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.

Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]

Note:

S will be a string with length between 1 and 12.
S will consist only of letters or digits.

### 题意

给定一个字符串，将其中的字母变成大写或者小写，求出所有可能的字符串。

### 思路

这道题的思路很简单，就是遍历字符串，遇到字母就将其变成大写或者小写，然后将其加入到结果中。

### 代码

```
class Solution:
    def letterCasePermutation(self, S):
        """
        :type S: str
        :rtype: List[str]
        """
        ans = ['']
        for ch in S:
            if ch.isalpha():
                ans = [i + j for i in ans for j in [ch.upper(), ch.lower()]]
            else:
                ans = [i + ch for i in ans]
        return ans
```

## 03410

### 题目

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.

### 题意

给定一个字符串和一个字符，求出这个字符串中每个字符到这个字符的最短距离。

### 思路

这道题的思路也很简单，就是遍历字符串，遇到这个字符就将其加入到结果中，然后将这个字符的位置更新为当前位置。

### 代码

```
class Solution:
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        ans = []
        pos = -float('inf')
        for i, ch in enumerate(S):
            if ch == C:
                pos = i
            ans.append(i - pos)
        pos = float('inf')
        for i in range(len(S) - 1, -1, -1):
            if S[i] == C:
                pos = i
            ans[i] = min(ans[i], pos - i)
        return ans
```

## 03411

### 题目

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.

### 题意

给定一个字符串和一个字符，求出这个字符串中每个字符到这个字符的最短距离。

### 思路

这道题的思路也很简单，就是遍历字符串，遇到这个字符就将其加入到结果中，然后将这个字符的位置更新为当前位置。

### 代码

```
class Solution:
    def shortestToChar(self, S, C):
        """
        :type S: str
        :type C: str
        :rtype: List[int]
        """
        ans = []
        pos = -float('inf')
        for i, ch in enumerate(S):
            if ch == C:
                pos = i
            ans.append(i - pos)
        pos = float('inf')
        for i in range(len(S) - 1, -1, -1):
            if S[i] == C:
                pos = i
            ans[i] = min(ans[i], pos - i)
        return ans
```

## 03412

### 题目

Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.

### 题意

给定一个字符串和一个字符，求出这个字符串中每个字符到这个字符的最短距离。

### 思路

这
