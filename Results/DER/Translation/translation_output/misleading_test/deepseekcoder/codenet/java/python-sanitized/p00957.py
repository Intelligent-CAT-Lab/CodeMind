import sys

class MyScanner:
    def __init__(self):
        self.input = sys.stdin.readline().split()

    def nextInt(self):
        return int(self.input[0])

    def nextLong(self):
        return long(self.input[0])

def solve():
    sc = MyScanner()
    l = sc.nextInt()
    k = sc.nextInt()
    dp = [[0 for _ in range(l+1)] for _ in range(2)]
    dp[0][0] = 1
    for i in range(1, l+1):
        dp[0][i] += dp[1][i-1]
        dp[1][i] += dp[0][i-1]
        if i >= k:
            dp[1][i] += dp[0][i-k]
    ans = 0
    for i in range(1, l+1):
        ans += dp[1][i]
    print(ans)

solve()