import sys

mod = 10**9 + 7
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
dx8 = [-1, -1, -1, 0, 0, 1, 1, 1]
dy8 = [-1, 0, 1, -1, 1, -1, 0, 1]
inf = 10**9
linf = 10**18
dinf = 10**18
eps = 1e-10
pi = 3.1415926535897932384626433832795

def solve():
    n = int(input())
    m = int(input())
    if n > m:
        n, m = m, n
    if m - n > 1:
        print(0)
        return
    ans = 1
    for i in range(n):
        ans = (ans * (i + 1)) % mod
    for i in range(m):
        ans = (ans * (i + 1)) % mod
    if m == n:
        ans = (ans * 2) % mod
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

def lower_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] < x:
            l = c
        else:
            r = c
    return r

def upper_bound(a, x