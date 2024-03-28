

```python
import math

def nCr(n,r):
    f = math.factorial
    return f(n) / f(r) / f(n-r)

def solve():
    mod = 1000000007
    M = 2222
    c = [[0 for i in range(M)] for j in range(M)]
    c[0][0] = 1
    for i in range(1, M):
        c[i][0] = 1
        for j in range(1, M):
            c[i][j] = c[i-1][j-1] + c[i-1][j]
            if c[i][j] >= mod:
                c[i][j] -= mod
    pow2 = [0 for i in range(M)]
    pow2[0] = 1
    for i in range(1, M):
        pow2[i] = pow2[i-1] + pow2[i-1]
        if pow2[i] >= mod:
            pow2[i] -= mod
    dp2 = [[0 for i in range(M)] for j in range(M)]
    for x in range(M):
        for y in range(M):
            if x == 0 or y == 0:
                dp2[x][y] = 1
            else:
                dp2[x][y] = dp2[x-1][y-1] + dp2[x][y-1]
                if dp2[x][y] >= mod:
                    dp2[x][y] -= mod
    dp2Pref = [[0 for i in range(M)] for j in range(M)]
    for x in range(M):
        for y in range(M):
            dp2Pref[x][y] = dp2[x][y]
            if x > 0:
                dp2Pref[x][y] += dp2Pref[x-1][y]
                if dp2Pref[x][y] >= mod:
                    dp2Pref[x][y] -= mod
    dp = [[0 for i in range(M)] for j in range(M)]
    for red in range(M):
        for blue in range(M):
            if red == 0 or blue == 0:
                dp[red][blue] = 1
            else:
                dp[red][blue] += dp2Pref[red][blue-1]
                if dp[red][blue] >= mod:
                    dp[red][blue] -= mod
    res = 0
    a = int(input())
    b = int(input())
    for startRed in range(a+1):
        for cntBlue in range(1, b+1):
            curC = nCr(b-1, cntBlue-1)
            redStay = a - startRed - (b - cntBlue)
            if redStay < 0:
                continue
            add = curC * dp[redStay][b-cntBlue] % mod
            res += add
    print(res % mod)

solve()
```

## 03582 - 
### 题目描述

给定一个长度为 $n$ 的序列 $a_1, a_2, \dots, a_n$，求满足 $a_i \le a_{i+1
