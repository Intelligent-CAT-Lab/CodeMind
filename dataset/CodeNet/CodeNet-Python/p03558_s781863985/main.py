from collections import deque

def solve(k):
    que = deque()
    que.append((1, 1))
    dp = {1: 1}
    while que:
        x, c = que.pop()
        y = (x + 1) % k
        if (not y in dp) or (dp[y] > c + 1):
            dp[y] = c + 1
            que.appendleft((y, c+1))
        z = (10 * x) % k
        if (not z in dp) or (dp[z] > c):
            dp[z] = c
            que.append((z, c))
    return dp[0]

k = int(input())
print(solve(k))