import sys

def solve(n, K):
    ans = 0
    for i in range(K+1, n+1):
        for j in range(0, i*n+1):
            if i*(j+1) <= n:
                ans += i - K
            else:
                ans += max(i - K - (i*(j+1) - 1 - n), 0)
    if K == 0:
        ans -= n
    return ans

if __name__ == "__main__":
    n, K = map(int, sys.stdin.readline().strip().split())
    print(solve(n, K))