```python
import sys

class p02997:
    def __init__(self):
        self.out = sys.stdout

    def solve(self):
        N, K = map(int, input().split())
        if N == 2:
            if K == 0:
                self.out.write("1\n1 2\n")
            else:
                self.out.write("-1\n")
            return

        max_combinations = self.combination(N-1, 2)
        if K > max_combinations:
            self.out.write("-1\n")
            return
        
        M = N - 1 + (max_combinations - K)
        self.out.write(str(M) + '\n')
        for i in range(2, N + 1):
            self.out.write(f"1 {i}\n")
        
        cnt = max_combinations - K
        if cnt > 0:
            for i in range(2, N):
                for j in range(i + 1, N + 1):
                    self.out.write(f"{i} {j}\n")
                    cnt -= 1
                    if cnt <= 0:
                        return

    def make_comb_dp(self, n):
        dp = [[0 for _ in range(n+1)] for _ in range(n+1)]
        for i in range(n + 1):
            dp[i][0] = 1
            dp[i][i] = 1
        for i in range(2, n + 1):
            for j in range(1, i):
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        return dp

    def combination(self, n, k):
        dp = self.make_comb_dp(n)
        return dp[n][k]

if __name__ == "__main__":
    main = p02997()
    main.solve()
```

