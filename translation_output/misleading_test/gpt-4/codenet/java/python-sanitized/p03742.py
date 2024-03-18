import sys

MOD = 10**9 + 7
dp = [[False for _ in range(100)] for _ in range(100)]
visited = [[False for _ in range(100)] for _ in range(100)]

def printlnYN(b):
    print("Brown" if b else "Alice")

def dfs(x, y):
    if visited[x][y]:
        return dp[x][y]
    if x <= 1 and y <= 1:
        dp[x][y] = False
        visited[x][y] = True
        return False

    for i in range(2, x + 1, 2):
        if not dfs(x-i, y+i//2):
            dp[x][y] = True
            visited[x][y] = True
            return True

    for i in range(2, y + 1, 2):
        if not dfs(x+i//2, y-i):
            dp[x][y] = True
            visited[x][y] = True
            return True

    dp[x][y] = False
    visited[x][y] = True
    return False

def solve():
    X, Y = map(int, input().split())
    printlnYN(abs(X-Y) <= 1)

if __name__ == '__main__':
    solve()