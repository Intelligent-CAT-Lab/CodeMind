import sys

def add(a, b):
    res = a + b
    return res >= mod and res - mod or res

def mul(a, b):
    res = a * b % mod
    return res < 0 and res + mod or res

def solve():
    n, k, mod = map(int, sys.stdin.readline().split())
    if k % 2 == 0:
        print mul(solve2(n / 2, k / 2 + 1), solve2((n + 1) / 2, k / 2 + 1))
    else:
        dyn = [[0] * (k + 2) for i in xrange(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for i in xrange(k + 2)]
        for i in xrange((n | 1) / 2 + k / 2 + 2):
            for a in ndyn:
                for j in xrange(k + 2):
                    a[j] = 0
            mask = (i < (n + 1) / 2 and 1 or 0) + (i >= k / 2 + 2 and 2 or 0)
            for m in xrange(mask, -1, -1):
                for j in xrange(k + 2):
                    for jj in xrange(k + 2):
                        nj = (m & 1) and min(j + 1, k + 1) or 0
                        njj = (m & 2) and (j != 0 or jj != 0) and max(j, jj) + 1 or 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
            dyn, ndyn = ndyn, dyn
        ans = 0
        for i in xrange(k + 2):
            for j in xrange(k + 2):
                ans = add(ans, dyn[i][j])
        print ans

def solve2(n, k):
    dyn = [1] * k
    for i in xrange(n):
        v = dyn[k - 1]
        for j in xrange(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

solve()