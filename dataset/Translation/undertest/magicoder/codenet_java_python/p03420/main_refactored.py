class main:
    import sys
    
    def solve(n, K):
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(0, n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        return ans
    
    n, K = map(int, sys.stdin.readline().split())
    print(solve(n, K))