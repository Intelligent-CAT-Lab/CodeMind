import sys

class p01593:
    def __init__(self):
        self.sc = sys.stdin
        self.INF = 1 << 28
        self.EPS = 1e-12

    def run(self):
        self.n = int(self.sc.readline().strip())
        self.m = int(self.sc.readline().strip())
        self.solve()

    def solve(self):
        dp = [0.0]*(self.n+1)
        dp[0] = 1
        for j in range(1, self.n+1):
            for i in range(1, min(self.m, j)+1):
                dp[j] += dp[j-i]/j
        self.println("{:.12f}".format(dp[self.n]))

    def println(self, s):
        print(s)

if __name__ == "__main__":
    p01593().run()