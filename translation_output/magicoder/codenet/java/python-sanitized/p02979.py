import sys

def add(a, b):
    res = a + b
    return res if res < mod else res - mod

def mul(a, b):
    res = (a * b) % mod
    return res if res >= 0 else res + mod

def solve():
    n, k, mod = map(int, input().split())
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        for i in range(n // 2 + k // 2 + 2):
            for a in ndyn:
                a[:] = [0] * (k + 2)
            mask = (i < n // 2) + (i >= k // 2 + 2) * 2
            for m in range(mask, -1, -1):
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = (m & 1) * min(j + 1, k + 1)
                        njj = ((m & 2) != 0 and (j != 0 or jj != 0)) * max(j, jj) + 1
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
            dyn, ndyn = ndyn, dyn
        ans = sum(dyn[i][j] for i in range(k + 2) for j in range(k + 2))
        print(ans)

def solve2(n, k):
    dyn = [1] + [0] * (k - 1)
    for _ in range(n):
        v = dyn[-1]
        dyn = [v] + [add(dyn[i], v) for i in range(k - 1)]
    return dyn[-1]

if __name__ == "__main__":
    try:
        solve()
    except Exception as e:
        print(e, file=sys.stderr)
        sys.exit(1)