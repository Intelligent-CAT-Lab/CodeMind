
```python
import sys

def solve(S):
    while len(S) > 3:
        abc = False
        for i in range(len(S) - 2):
            if S[i:i+3] == "ABC":
                S = S[:i] + "X" + S[i+3:]
                abc = True
        if not abc:
            return "No"

        check = [False] * 3
        for i in range(len(S)):
            if S[i] >= 'A' and S[i] <= 'C':
                check[ord(S[i]) - ord('A')] = True
        cnt = 0
        for t in check:
            if t:
                cnt += 1
        if cnt != 2:
            return "No"
        for i in range(3):
            if not check[i]:
                c = chr(i + ord('A'))
                S = S.replace("X", c)
    if S == "ABC":
        return "Yes"
    else:
        return "No"

if __name__ == "__main__":
    S = sys.stdin.readline().strip()
    print(solve(S))
```

## 01812 - 1000000007

### 题目描述

给定一个整数 $N$，求 $N!$ 除以 $1000000007$ 的余数。

### 输入格式

一行一个整数 $N$。

### 输出格式

一行一个整数，表示 $N!$ 除以 $1000000007$ 的余数。

### 数据范围

$1 \le N \le 1000000000$

### 输入样例：

```
10
```

### 
