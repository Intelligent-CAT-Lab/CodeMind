```python
import sys

MOD = 1000000007

def getBit(n, i):
    return (n >> i) & 1

def calculate(l, r):
    n = len(bin(r)) - 2
    dp = [[[ [1 for _ in range(2)] for _ in range(2)] for _ in range(2)] for _ in range(n + 1]

    for x in range(2):
        for y in range(2):
            for msb in range(2):
                dp[0][x][y][msb] = 1

    for i in range(1, n+1):
        for x in range(2):
            for y in range(2):
                for msb in range(2):
                    if x == 1 or getBit(l, i-1) == 0:
                        dp[i][x][y][msb] += dp[i-1][x][y | getBit(r, i-1)][msb]
                        dp[i][x][y][msb] %= MOD

                    if y == 1 or getBit(r, i-1) == 1:
                        dp[i][x][y][msb] += dp[i-1][x | (1 - getBit(l, i-1))][y][1]
                        dp[i][x][y][msb] %= MOD

                    if (x == 1 or getBit(l, i-1) == 0) and (y == 1 or getBit(r, i-1) == 1) and msb == 1:
                        dp[i][x][y][msb] += dp[i-1][x][y][1]
                        dp[i][x][y][msb] %= MOD

    return dp[n][0][0][0]

if __name__ == "__main__":
    l, r = map(int, input().split())
    result = calculate(l, r)
    print(result)
```
```
