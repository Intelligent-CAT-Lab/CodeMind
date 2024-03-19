import sys

def solve(M, D):
    ans = 0
    for m in range(1, M + 1):
        for d in range(1, D + 1):
            d1 = d % 10
            d2 = d // 10
            if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                ans += 1
    return ans

M, D = map(int, sys.stdin.readline().split())
print(solve(M, D))