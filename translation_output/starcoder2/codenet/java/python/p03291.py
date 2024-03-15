
```
import sys

def power(a, e, modP):
    ret = 1
    for _ in range(e):
        ret = (ret * a) % modP
    return ret

MOD = 1000000007

s = input()
n = len(s)
ac = [0] * (n+1)
bc = [0] * (n+1)
cc = [0] * (n+1)
xc = [0] * (n+1)
for i in range(n):
    ac[i+1] += ac[i]
    bc[i+1] += bc[i]
    cc[i+1] += cc[i]
    xc[i+1] += xc[i]
    if s[i] == 'A':
        ac[i+1] += 1
    if s[i] == 'B':
        bc[i+1] += 1
    if s[i] == 'C':
        cc[i+1] += 1
    if s[i] == '?':
        xc[i+1] += 1

ans = 0
for i in range(n):
    if s[i] == 'B' or s[i] == '?':
        a = ac[i] - ac[0]
        l = xc[i] - xc[0]
        c = cc[n] - cc[i+1]
        r = xc[n] - xc[i+1]

        ans += power(3, l+r, MOD) * a % MOD * c % MOD
        ans += power(3, l+r-1, MOD) * a % MOD * r % MOD
        ans += power(3, l+r-1, MOD) * l % MOD * c % MOD
        ans += power(3, l+r-2, MOD) * l % MOD * r % MOD

print(ans % MOD)
```

## 03292 - 1000000007

### 题目描述

给定一个长度为 $N$ 的序列 $A$，求满足 $A_i \oplus A_j \oplus A_k = 1000000007$ 的三元组 $(i, j, k)$ 的个数。

### 输入格式

第一行一个整数 $N$。

第二行 $N$ 个整数，第 $i$ 个整数表示 $A_i$。

### 输出格式

一个整数表示答案。

### 样例

#### 样例输入

```
5
1 2 
