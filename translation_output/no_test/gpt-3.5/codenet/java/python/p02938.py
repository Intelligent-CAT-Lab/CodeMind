```python
import sys

MOD = 1000000007

class p02938:
    def __init__(self):
        self.dp = []
        self.out = sys.stdout

    def go(self):
        l, r = map(int, input().split())
        n = len(bin(r)) - 2
        self.dp = [[[[0 for _ in range(2)] for _ in range(2)] for _ in range(2)] for _ in range(n+1]

        for x in range(2):
            for y in range(2):
                for msb in range(2):
                    self.dp[0][x][y][msb] = 1

        for i in range(1, n+1):
            for x in range(2):
                for y in range(2):
                    for msb in range(2):
                        if x == 1 or (l >> (i-1)) & 1 == 0:
                            self.dp[i][x][y][msb] += self.dp[i-1][x][y | ((r >> (i-1)) & 1)][msb]
                            self.dp[i][x][y][msb] %= MOD

                        if y == 1 or (r >> (i-1)) & 1 == 1:
                            self.dp[i][x][y][msb] += self.dp[i-1][x | (1-((l >> (i-1)) & 1))][y][1]
                            self.dp[i][x][y][msb] %= MOD

                        if (x == 1 or (l >> (i-1)) & 1 == 0) and (y == 1 or (r >> (i-1)) & 1 == 1) and msb == 1:
                            self.dp[i][x][y][msb] += self.dp[i-1][x][y][1]
                            self.dp[i][x][y][msb] %= MOD

        self.out.write(str(self.dp[n][0][0][0]) + '\n')

    def getBit(self, n, i):
        return (n >> i) & 1

if __name__ == "__main__":
    p = p02938()
    p.go()
```
```
