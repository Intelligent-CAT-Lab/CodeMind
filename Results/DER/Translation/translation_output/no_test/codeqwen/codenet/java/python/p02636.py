Here is the Python version of the given Java code:

```python
MOD = 998244353

def add(a, b):
    res = a + b
    return res if res < MOD else res - MOD

def solve():
    s = input()
    n = len(s)
    dyn1 = [[[False for _ in range(n + 1)] for _ in range(n + 1)] for _ in range(n + 1)]
    dyn1[0][0][0] = True
    for i in range(n):
        for j in range(n + 1):
            for k in range(n + 1):
                if dyn1[i][j][k]:
                    dyn1[i + 1][j][k] = True
                    if j > 0 and s[i] == '1':
                        dyn1[i + 1][j - 1][k + 1] = True
                    if k > 0 and s[i] == '0':
                        dyn1[i + 1][j + 1][k - 1] = True
                    if i + 1 < n:
                        if s[i] == '0' or s[i + 1] == '0':
                            dyn1[i + 2][j + 1][k] = True
                        if s[i] == '1' or s[i + 1] == '1':
                            dyn1[i + 2][j][k + 1] = True
    dyn2 = [[[0 for _ in range(n + 1)] for _ in range(n + 1)] for _ in range(n + 1)]
    dyn2[n][0][0] = 1
    ans = MOD - 1
    for i in range(n, -1, -1):
        for j in range(n + 1):
            for k in range(n + 1):
                if dyn1[i][j][k]:
                    ans = add(ans, dyn2[i][j][k])
                if i > 0 and s[
