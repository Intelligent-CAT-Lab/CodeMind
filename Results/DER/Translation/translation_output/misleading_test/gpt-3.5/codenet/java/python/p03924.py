```python
import sys
import io

class FS:
    def __init__(self):
        self.input_buffer = io.StringIO()
        self.input_buffer.write(sys.stdin.read())
        self.input_buffer.seek(0)
        self.tokens = iter(self.input_buffer.read().split())
    
    def next(self):
        return next(self.tokens)
    
    def nextInt(self):
        return int(self.next())

MOD = 1000000007

def main():
    r = FS()
    N = r.nextInt()
    M = r.nextInt()
    dp = [[[0 for _ in range(N+1)] for _ in range(N+1)] for _ in range(M+1]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N+1):
            for k in range(N+1):
                if j != N:
                    dp[i+1][j+1][k] += (dp[i][j][k] * (N-j)) % MOD
                    dp[i+1][j+1][k] %= MOD
                dp[i+1][j][k] += (dp[i][j][k] * (j-k)) % MOD
                dp[i+1][j][k] %= MOD
                dp[i+1][j][j] += (dp[i][j][k] * k) % MOD
                dp[i+1][j][j] %= MOD
    print(dp[M][N][N])

if __name__ == "__main__":
    main()
```
```python
# Test Input
3 3

# Expected Output
91
```

