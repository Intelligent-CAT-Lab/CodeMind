```python
class FastIO:
    def __init__(self):
        self.buffer = []
        self.idx = 0
    
    def nextInt(self):
        while len(self.buffer) == 0 or self.idx == len(self.buffer):
            self.buffer = input().split()
            self.idx = 0
        self.idx += 1
        return int(self.buffer[self.idx - 1])

def main():
    MOD = 1000000007
    io = FastIO()
    
    N = io.nextInt()
    K = io.nextInt()
    sqrt = int(N**0.5)
    sqrt = 2*sqrt - 1 if sqrt * (sqrt + 1) > N else 2*sqrt
    
    dp = [[0 for _ in range(sqrt)] for _ in range(K)]
    for i in range(sqrt):
        dp[0][i] = max(1, N // (sqrt - i) - N // (sqrt - i + 1))
    
    for i in range(1, K):
        for j in range(sqrt - 1, -1, -1):
            sum_val = sum(dp[i - 1][sqrt - j - 1] for j in range(sqrt))
            dp[i][j] = sum_val % MOD * max(1, N // (sqrt - j) - N // (sqrt - j + 1)) % MOD
    
    ans = sum(dp[K - 1])
    print(ans % MOD)

if __name__ == "__main__":
    main()
```

