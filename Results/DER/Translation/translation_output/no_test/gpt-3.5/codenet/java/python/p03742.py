```python
import sys
from collections import deque

class p03742:
    MOD = 10**9 + 7

    def __init__(self):
        self.visited = [[False]*100 for _ in range(100)]
        self.dp = [[False]*100 for _ in range(100)]

    def solve(self):
        X, Y = map(int, input().split())
        print("Brown" if abs(X-Y) <= 1 else "Alice")

    def dfs(self, x, y):
        if self.visited[x][y]: 
            return self.dp[x][y]
        
        if x <= 1 and y <= 1:
            self.dp[x][y] = False
            self.visited[x][y] = True
            return False

        for i in range(2, x+1, 2):
            if not self.dfs(x-i, y+i//2):
                self.dp[x][y] = True
                self.visited[x][y] = True
                return True
            
        for i in range(2, y+1, 2):
            if not self.dfs(x+i//2, y-i):
                self.dp[x][y] = True
                self.visited[x][y] = True
                return True
            
        self.dp[x][y] = False
        self.visited[x][y] = True
        return False

    def m(self):
        self.solve()

if __name__ == "__main__":
    p = p03742()
    p.m()
```
The above code is the translated Java code into Python. Let me know if you need any more assistance.
