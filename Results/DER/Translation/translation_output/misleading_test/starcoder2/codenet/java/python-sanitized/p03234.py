import sys

mod = 1000000007

def waysToPair(x):
    if memoWaysToPair[x] != -1:
        return memoWaysToPair[x]
    if x % 2 == 1:
        memoWaysToPair[x] = 0
    elif x == 0:
        memoWaysToPair[x] = 1
    else:
        memoWaysToPair[x] = waysToPair(x - 2) * (x - 1) % mod
    return memoWaysToPair[x]

def paired(x, y):
    return f[y] - f[x - 1]

def inside(a, x, y):
    return x <= a and a <= y

def caldp(x, y):
    if dp[x][y] != -1:
        return dp[x][y]
    notPairedinXY = (y - x + 1) - paired(x, y)
    for i in range(1, k + 1):
        p1 = inside(a[i], x, y)
        p2 = inside(b[i], x, y)
        if p1 != p2:
            dp[x][y] = 0
            return dp[x][y]
    dp[x][y] = waysToPair(notPairedinXY)
    for z in range(x + 1, y):
        notPairedinZY