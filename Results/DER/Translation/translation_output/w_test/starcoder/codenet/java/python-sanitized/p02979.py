import sys

def add(a, b):
    res = a + b
    return res >= mod? res - mod : res

def mul(a, b):
    res = (a * b) % mod
    return res < 0? res + mod : res

def solve():
    n, k = map(int, raw_input().split())
    mod = int(raw_input())
    if k % 2 == 0:
        print mul(solve2(n / 2, k / 2 + 1), solve2((n + 1) / 2, k / 2 + 1))
    else:
        dyn = [[0 for i in range(k + 2)] for j in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0 for i in range(k + 2)] for j in range(k + 2)]
        for i in range((n | 1) / 2 + k / 2 + 2):
            for a in ndyn:
                a[:] = [0 for i in range(k + 2)]
            mask = (i < (n + 1) / 2? 1 : 0) + (i >= k / 2 + 2? 2 : 0)
            for m in range(mask, -1, -1):
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = (m & 1)!= 0? min(j + 1, k + 1) : 0
                        njj = (m & 2)!= 0 and (j!= 0 or jj!= 0)? max(j, jj) + 1 : 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
                if m == 0:
                    break
            dyn, ndyn = ndyn, dyn
        ans = 0
        for i in range(k + 2):
            for j in range(k + 2):
                ans = add(ans, dyn[i][j])
        print ans

def solve2(n, k):
    dyn = [0 for i in range(k)]
    dyn[0] = 1
    for i in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

if __name__ == "__main__":
    solve()