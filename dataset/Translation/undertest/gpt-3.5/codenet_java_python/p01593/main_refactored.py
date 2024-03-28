class main:
    import sys
    import math
    
    class p01593:
        INF = 1 << 28
        EPS = 1e-12
    
        def __init__(self):
            self.n, self.m = map(int, input().split())
    
        def solve(self):
            dp = [0.0] * (self.n + 1)
            dp[0] = 1
            for j in range(1, self.n+1):
                for i in range(1, min(self.m, j)+1):
                    dp[j] += dp[j-i] / j
            print("{:.8f}".format(dp[self.n]))
    
    if __name__ == "__main__":
        p = p01593()
        p.solve()