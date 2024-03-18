```python
import sys
from collections import defaultdict
from functools import reduce
from math import pi

mod = 10**9 + 7

def solve():
    n, m = map(int, input().split())
    if n > m:
        n, m = m, n

    if m - n > 1:
        print(0)
        return

    ans = 1
    for i in range(n):
        ans = mul(ans, i + 1)
    for i in range(m):
        ans = mul(ans, i + 1)

    if m == n:
        ans = mul(ans, 2)

    print(ans)

def lower_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] < x:
            l = c
        else:
            r = c
    return r

def upper_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] <= x:
            l = c
        else:
            r = c
    return r

def mul(x, y):
    res = (x * y) % mod
    return res if res >= 0 else res + mod

if __name__ == "__main__":
    solve()
```

