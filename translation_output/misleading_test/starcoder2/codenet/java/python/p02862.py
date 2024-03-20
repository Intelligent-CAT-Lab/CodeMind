

```python
import math

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def enumFIF(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    invf[n] = p if p >= 0 else p + mod
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return [f, invf]

mod = 1_000_000_007
# mod = 998244353
# inf = Long.MAX_VALUE/2
inf = 2147483647

x = int(input())
y = int(input())
if (2*y-x)%3!=0 or 2*y-x<0:
    print(0)
    exit()
a = (2*y-x)//3
if (2*x-y)%3!=0 or 2*x-y<0:
    print(0)
    exit()
b = (2*x-y)//3
fif = enumFIF(3000000, mod)
print(C(a+b,a,mod,fif))
```

## 02863 - 2020-2021 ICPC Northwestern European Regional Programming Contest (NWERC 2020)

### 题目大意

给定一个$n\times m$的矩阵，每个格子上有一个数字，从左上角走到
