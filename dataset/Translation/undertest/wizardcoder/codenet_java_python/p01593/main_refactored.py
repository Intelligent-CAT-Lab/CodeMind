class main:
    import math
    
    class p01593:
        def __init__(self):
            self.sc = Scanner(System.in)
    
        def run(self):
            n = self.sc.nextInt()
            m = self.sc.nextInt()
            self.solve(n, m)
    
        def solve(self, n, m):
            dp = [0] * (n+1)
            dp[0] = 1
            for j in range(1, n+1):
                for i in range(1, min(m, j)+1):
                    dp[j] += dp[j-i] / j
            self.println(str(dp[n]))
    
        def println(self, s):
            print(s)
    
    p01593().run()