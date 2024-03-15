
```
import sys

def dfs(n):
    global minDiff, ansStr, startStr
    if n == len(ch):
        ansStr = startStr
        return
    if n == 0:
        use[(ord(ch[n]) - ord('0') + 5) % 10] = True
        startStr = startStr + chr((ord(ch[n]) - ord('0') + 5) % 10 + ord('0'))
        dfs(n + 1)
        return
    if not use[ord(ch[n]) - ord('0')]:
        dfs2(n, "")
        use[ord(ch[n]) - ord('0')] = True
        startStr = startStr + ch[n]
        dfs(n + 1)
        return
    dfs2(n, "")

def dfs2(n, s):
    global minDiff, ansStr, startStr
    if n == len(ch):
        a = int(S[len(startStr):])
        b = int(s)
        diff = abs(a - b)
        if minDiff > diff:
            ansStr = startStr + s
            minDiff = diff
        return
    for i in range(10):
        if use[i]:
            continue
        use[i] = True
        dfs2(n + 1, s + chr(i + ord('0')))
        use[i] = False

S = sys.stdin.readline().strip()
ch = S
use = [False] * 10
minDiff = sys.maxsize
ansStr = ""
startStr = ""
dfs(0)
print(ansStr)
```

## 01830

### 题目

[01830](https://www.luogu.com.cn/problem/P1830)

### 题解

#### 思路

#### 代码

## 01831

### 题目

[01831](https://www.luogu.com.cn/problem/P1831)

### 题解

#### 思路

#### 代码

## 01832

### 题目

[01832](https://www.luogu.com.cn/problem/P1832)

### 题解

#### 思路

#### 代码

## 01833

### 题目

[01833](https://www.luogu.com.cn/problem/P1833)

### 题解

#### 思路

#### 代码

## 01834

### 题目

[01834](https://www.luogu.com.cn/problem/P1834)

### 题解

#### 思路

#### 代码

## 01835

### 题目

[01835](https://www.luogu.com.cn/problem/P1835)

### 题解

#### 思路

#### 代码

## 01836

### 题目

[01836](https://www.luogu.com.cn/problem/P1836)

### 题解

#### 思路

#### 代码

## 01837

### 题目

[01837](https://www.luogu.com.cn/problem/P1837)

### 题解

#### 思路

#### 代码

## 01838

### 题目

[01838](https://www.luogu.com.cn/problem/P1838)

### 题解

#### 思路

#### 代码

## 01839

### 题目

[01839](https://www.luogu.com.cn/problem/P1839)

### 题解

#### 思路

#### 代码

## 01840

### 题目

[01840](https://www.luogu.com.cn/problem/P1840)

### 题解

#### 思路

#### 代码

## 01841

### 题目

[01841](https://www.luogu.com.cn
