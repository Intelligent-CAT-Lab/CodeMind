class main:
    import sys
    
    class TaskE:
        def __init__(self):
            self.mod = 1000000007
    
        def solve(self, testNumber, in, out):
            n = in.readInt()
            h = in.readInt()
            d = in.readInt()
            fact = [1] * (n + 1)
            factSum = 0
            for i in range(1, n + 1):
                fact[i] = fact[i - 1] * i
                factSum += fact[i]
            dp = [0] * (h + 1)
            dp[0] = fact[n]
            preDpSum = [0] * (h + 1)
            preDpSum[0] = dp[0]
            for i in range(1, h + 1):
                dp[i] = preDpSum[i - 1]
                if i - d - 1 >= 0:
                    dp[i] -= preDpSum[i - d - 1]
                if i <