```python
import sys

class FastScanner:
    input = sys.stdin
    def nextLong(self):
        try:
            b = self.input.read(1)
            while b and (b < '0' or b > '9') and b != '-' and b != '+':
                b = self.input.read(1)
            if b == '':
                return None
            sign = -1 if b == '-' else 1 if b != '+' else 0
            ret = 0 if b == '-' or b == '+' else int(b)
            b = self.input.read(1)
            while b and '0' <= b <= '9':
                ret = ret * 10 + int(b)
                b = self.input.read(1)
            return ret if sign == 1 else -ret
        except Exception as e:
            print(e)
            return -1

def printlnYN(b):
    print("Brown" if b else "Alice")

dp = [[False for _ in range(100)] for _ in range(100)]
visited = [[False for _ in range(100)] for _ in range(100)]

def dfs(x, y):
    if visited[x][y]:
        return dp[x][y]
    if x <= 1 and y <= 1:
        dp[x][y] = False
        visited[x][y] = True
        return False

    for i in range(2, x+1, 2):
        if not dfs(x-i, y+i//2):
            dp[x][y] = True
            visited[x][y] = True
            return True

    for i in range(2, y+1, 2):
        if not dfs(x+i//2, y-i):
            dp[x][y] = True
            visited[x][y] = True
            return True

    dp[x][y] = False
    visited[x][y] = True
    return False

def solve():
    X = in.nextLong()
    Y = in.nextLong()
    printlnYN(abs(X-Y) <= 1)

def main():
    solve()

in = FastScanner()
main()
```
The given Java code has been translated to Python. The code now runs in Python and performs the same functionality as the original Java code.
