

```python

n = int(input())
if n == 2:
    print("4 7")
    print("23 10")
    exit()

snt = [0] * (n * 2)
cn = 0
x = 2
while cn < n * 2:
    if isSNT(x):
        snt[cn] = x
        cn += 1
    x += 1

a = [[0] * n for i in range(n)]
for i in range(n):
    for j in range(i % 2, n, 2):
        a1 = (i + j) // 2
        a2 = (j - i + n - 1) // 2 + n
        a[i][j] = snt[a1] * snt[a2]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
for i in range(n):
    for j in range((i + 1) % 2, n, 2):
        gcd = 0
        tich = 1
        for k in range(4):
            if i + dx[k] < 0 or i + dx[k] >= n:
                continue
            if j + dy[k] < 0 or j + dy[k] >= n:
                continue
            if gcd == 0:
                gcd = a[i + dx[k]][j + dy[k]]
                tich = gcd
            else:
                gcd = gcd(tich, a[i + dx[k]][j + dy[k]])
                tich = tich // gcd * a[i + dx[k]][j + dy[k]]
        a[i][j] = tich + 1

for i in range(n):
    for j in range(n):
        print(a[i][j], end=" ")
    print()


def isSNT(x):
    for i in range(2, int(x ** 0.5) + 1):
        if x % i == 0:
            return False
    return True


def gcd(a, b):
    return b if b == 0 else gcd(b, a % b)

```

## Problem 3258

```

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

```

python code:

```python

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
        max_len = 1
        start = 0
        for i in range(len(s)):
            if i - max_len >= 1 and s[i - max_len - 1:i + 1] == s[i - max_len - 1:i + 1][::-1]:
                start = i - max_len - 1
                max_len += 2
                continue
            if i - max_len >= 0 and s[i - max_len:i + 1] == s[i - max_len:i + 1][::-1]:
                start = i - max_len
                max_len += 1
        return s[start:start + max_len]

```

## Problem 3259

```

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest palindromic subsequence is "bb".

```

python code:

```python

class Solution:
    def longestPalindromeSubseq(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        dp = [[0] * n for i in range(n)]
        for i in range(n):
            dp[i][i] = 1
        for i in range(n - 1, -1, -1):
            for j in range(i + 1, n):
                if s[i] == s[j]:
                    dp[i][j] = dp[i + 1][j - 1] + 2
                else:
                    dp[i][j] = max(dp[i + 1][j], dp[i][j - 1])
        return dp[0][n - 1]

```

## Problem 3260

```

Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest pal
