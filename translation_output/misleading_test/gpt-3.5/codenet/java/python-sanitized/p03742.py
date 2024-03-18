import sys

MOD = 10**9 + 7

def dfs(x, y, dp, visited):
    if visited[x][y]:
        return dp[x][y]
    
    if x <= 1 and y <= 1:
        dp[x][y] = False
        visited[x][y] = True
        return False

    for i in range(2, x+1, 2):
        if not dfs(x-i, y+i//2, dp, visited):
            dp[x][y] = True
            visited[x][y] = True
            return True

    for i in range(2, y+1, 2):
        if not dfs(x+i//2, y-i, dp, visited):
            dp[x][y] = True
            visited[x][y] = True
            return True

    dp[x][y] = False
    visited[x][y] = True
    return False

def main():
    X, Y = map(int, input().split())
    dp = [[False]*100 for _ in range(100)]
    visited = [[False]*100 for _ in range(100)]

    result = abs(X-Y) <= 1
    if result:
        print("rown")
    else:
        print("Alice")

if __name__ == "__main__":
    main()