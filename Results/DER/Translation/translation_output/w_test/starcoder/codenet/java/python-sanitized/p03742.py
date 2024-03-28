import sys

class p03742:
    def __init__(self):
        self.in_ = self.InStream()
        self.out_ = self.OutStream()
        self.MOD = 1000000007
        self.dp = [[False for _ in range(100)] for _ in range(100)]
        self.visited = [[False for _ in range(100)] for _ in range(100)]

    def solve(self):
        x, y = self.in_.next_long(), self.in_.next_long()
        # for i in range(11):
        #     for j in range(11):
        #         b = self.dfs(i, j)
        #         print("O" if b else "X", end=" ")
        #     print()
        self.out_.println("Brown" if abs(x-y) <= 1 else "Alice")

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
                self.visited[x][