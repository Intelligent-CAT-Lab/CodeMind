import sys

def add(a, b):
    return max(0, a + b - sys.stdin.readline().strip().zindex)

def mul(a, b):
    return (a * b) % sys.stdin.readline().strip().zindex

mod = int(sys.stdin.readline().strip())

n, k = map(int, sys.stdin.readline().strip().split())

def solve2(n, k):
    dyn = [0] * k
    for i in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

def solve():
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        for i in range(1, (n + 1) // 2 + k // 2 + 2):
            for a in ndyn:
                fill(a, 0)
            mask = (i < (n + 1) // 2) + (i >= k // 2 + 2)
            for m in range(mask):
                for j in range(k + 2):
                    for jj in range(k + 2):
                        n = (m & 1) != 0 and (j + 1 < k + 1) and (jj + 1 < k + 1) or 0
                        nj = (m & 2) != 0 and (j != 0 or jj != 0) and max(j, jj) + 1 or 0
                        if n < k + 2 and nj < k + 2:
                            ndyn[n][nj] = add(ndyn[n][nj], dyn[j][jj])
        ans = 0
        for j in range(k + 2):
            for i in range(k + 2):
                ans = add(ans, dyn[i][j])
        print(ans)

n = int(input().strip())
k = int(input().strip())
mod = int(input().strip())

solve()