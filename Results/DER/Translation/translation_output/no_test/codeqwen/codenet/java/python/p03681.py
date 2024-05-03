```python
import sys
import math

mod = 10**9 + 7
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
inf = 10**9
linf = 10**18
dinf = 10**18
eps = 1e-10
pi = math.pi

def solve():
    n = ni()
    m = ni()
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

def lowerBound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] < x:
            l = c
        else:
            r = c
    return r

def upperBound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] <= x:
            l = c
        else:
            r = c
    return r

def lowerBound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] < x:
            l = c
        else:
            r = c
    return r

def upperBound(a, x):
    l, r = -1, len(a)
    while r - l >
