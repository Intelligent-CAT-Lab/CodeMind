Here is the Python equivalent of the Java code:

```python
class p02997:
    def solve(self):
        N = int(input())
        K = int(input())
        if N == 2:
            if K == 0:
                print(1)
                print("1 2")
            else:
                print(-1)
            return
        max_val = combination(N-1,2)
        if K > max_val:
            print(-1)
            return
        M = N - 1 + (max_val - K)
        print(M)
        for i in range(2, N+1):
            print(1, i)
        cnt = max_val - K
        if cnt > 0:
            for i in range(2, N-1+1):
                for j in range(i+1, N+1):
                    print(i, j)
                    cnt -= 1
                    if cnt <= 0:
                        return

    def make_comb_dp(self, n):
        dp = [[0]*(n+1) for _ in range(n+1)]
        for i in range(n+1):
            dp[i][0] = 1
            dp[i][i] = 1
        for i in range(2, n+1):
            for j in range(1, i):
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        return dp

    def combination(self, n, k):
        dp = self.make_comb_dp(n)
        return dp[n][k]

p02997().solve()
```

Please note that the `FastScanner` class is not used in this Python version, as Python has built-in functions for reading input.
