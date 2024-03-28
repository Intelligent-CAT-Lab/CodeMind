

```python

import sys

def checkEqual(S):
    ans = 8
    for k in range(1, len(S)):
        if len(S) % k != 0:
            continue
        mins = maxs = S[0:k]
        for s in range(0, len(S), k):
            tmp = S[s:s+k]
            if tmp > maxs:
                maxs = tmp
            if tmp < mins:
                mins = tmp
        ans = min(ans, sub(maxs, mins))
    return ans

def check12(S):
    maxv = 0
    minv = 10
    for p in range(0, len(S)):
        v = int(S[p])
        if S[p] == '1' and p+1 < len(S):
            v = 10 + int(S[p+1])
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

def sub(maxs, mins):
    for i in range(0, len(maxs)):
        if maxs[i] != mins[i]:
            if i == len(maxs)-1:
                return int(maxs[i]) - int(mins[i])
            if i == len(maxs)-2:
                return (10*int(maxs[i])+int(maxs[i+1])) - (10*int(mins[i])+int(mins[i+1]))
            return 10
    return 0

def solve():
    S = sys.stdin.readline().strip()
    print(min(checkEqual(S), check12(S)))

if __name__ == '__main__':
    solve()

```

## 00370. 最长公共子序列

### 题目描述

给定两个字符串，求它们的最长公共子序列的长度。

### 输入格式

输入包含多组测试数据。

每组测试数据包含两个字符串，每个字符串占一行。

### 输出格式

对于每组测试数据，输出它们的最长公共子序列的长度。

### 样例输入

```
abcde
ace
program
contest
```

### 样例输出

```
3
2
```

### 题解

```python

import sys

def solve():
    s1 = sys.stdin.readline().strip()
    s2 = sys.stdin.readline().strip()
    dp = [[0 for i in range(len(s2)+1)] for j in range(len(s1)+1)]
    for i in range(1, len(s1)+1):
        for j in range(1, len(s2)+1):
            if s1[i-1] == s2[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])
    print(dp[len(s1)][len(s2)])

if __name__ == '__main__':
    solve()

```

## 00371. 最长公共子串

### 题目描述

给定两个字符串，求它们的最长公共子串的长度。

### 输入格式

输入包含多组测试数据。

每组测试数据包含两个字符串，每个字符串占一行。

### 输出格式

对于每组测试数据，输出它们的最长公共子串的长度。

### 样例输入

```
abcde
ace
program
contest
```

### 样例输出

```
1
0
```

### 题解

```python

import sys

def solve():
    s1 = sys.stdin.readline().strip()
    s2 = sys.stdin.readline().strip()
    dp = [[0 for i in range(len(s2)+1)] for j in range(len(s1)+1)]
    ans = 0
    for i in range(1, len(s1)+1):
        for j in range(1, len(s2)+1):
            if s1[i-1] == s2[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
                ans = max(ans, dp[i][j])
    print(ans)

if __name__ == '__main__':
    solve()

```

## 00372. 最长回文子串

### 题目描述

给定一个字符串，求它的最长回文子串的长度。

### 输入格式

输入包含多组测试数据。

每组测试数据包含一个字符串，每个字符串占一行。

### 输出格式

对于每组测试数据，输出它的最长回文子串的长度。

### 样例输入

```
abba
abcd
```

### 样例输出

```
4
1
```

### 题解

```python

import sys

def solve():
    s = sys.stdin.readline().strip()
    dp = [[0 for i in range(len(s))] for j in range(len(s))]
    ans = 0
    for i in range(len(s)):
        dp[i][i] = 1
        ans = 1
    for i in range(len(s)-1):
        if s[i] == s[i+1]:
            dp[i][i+1] = 1
            ans = 2
    for l in range(3, len(s)+1):
        for i in range(len(s)-l+1):
            j = i + l - 1
            if s[i] == s[j] and dp[i+1][j-1] == 1:
                dp[i][j] = 1
                ans = l
    print(ans)

if __name__ == '__main__':
    solve()

```

## 00373.
