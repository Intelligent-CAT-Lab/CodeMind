```python
MOD = 998244353

def add(a, b):
    res = a + b
    return res - MOD if res >= MOD else res

def solve():
    s = input()
    n = len(s)
    
    dyn1 = [[[False for _ in range(n + 1)] for _ in range(n + 1)] for _ in range(n + 1]
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
    
    dyn2 = [[[0 for _ in range(n + 1)] for _ in range(n + 1)] for _ in range(n + 1]
    dyn2[n][0][0] = 1
    ans = MOD - 1
    
    for i in range(n, -1, -1):
        for j in range(n + 1):
            for k in range(n + 1):
                if dyn1[i][j][k]:
                    ans = add(ans, dyn2[i][j][k])
                if i > 0 and s[i - 1] == '0':
                    dyn2[i - 1][j][k] = add(dyn2[i - 1][j][k], dyn2[i][j][k])
                elif j < n:
                    dyn2[i][j + 1][k] = add(dyn2[i][j + 1][k], dyn2[i][j][k])
                if i > 0 and s[i - 1] == '1':
                    dyn2[i - 1][j][k] = add(dyn2[i - 1][j][k], dyn2[i][j][k])
                elif k < n:
                    dyn2[i][j][k + 1] = add(dyn2[i][j][k + 1], dyn2[i][j][k])
                    
    print(ans)

if __name__ == "__main__":
    solve()
```
This is the translated Java code into Python.
