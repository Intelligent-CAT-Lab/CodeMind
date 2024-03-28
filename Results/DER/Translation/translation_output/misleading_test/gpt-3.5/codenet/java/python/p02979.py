```python
import sys

mod = 0

def add(a, b):
    res = a + b
    return res - mod if res >= mod else res

def mul(a, b):
    res = (a * b) % mod
    return res + mod if res < 0 else res

def solve():
    global mod
    n, k = map(int, input().split())
    mod = int(input())
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        for i in range((n | 1) // 2 + k // 2 + 2):
            for a in ndyn:
                a.fill(0)
            mask = (1 if i < (n + 1) // 2 else 0) + (2 if i >= k // 2 + 2 else 0)
            m = mask
            while True:
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = min(j + 1, k + 1) if m & 1 else 0
                        njj = max(j, jj) + 1 if m & 2 and (j != 0 or jj != 0) else 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
                if m == 0:
                    break
                m = (m - 1) & mask
            t = dyn
            dyn = ndyn
            ndyn = t
        ans = 0
        for i in range(k + 2):
            for j in range(k + 2):
                ans = add(ans, dyn[i][j])
        print(ans)

def solve2(n, k):
    dyn = [1] * k
    for _ in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

try:
    mod = 0
    n, k, mod = map(int, input().split())
    solve()
except Exception as e:
    print(e)
    sys.exit(1)
```
```
