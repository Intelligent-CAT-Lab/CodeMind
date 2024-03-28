# Import the necessary function from sys module to read input
from sys import stdin

class p02775:
    
    def run(self):
        N = "0" + stdin.readline().strip()
        l = len(N)
    
        # 0 = ãã¤ã, 1 = ã´ã£ãã, 2 = å¤ã
        dp = [[0 for _ in range(3)] for _ in range(l + 1)]
    
        dp[0][0] = dp[0][2] = 1
    
        for i in range(1, l):
            c = int(N[i])  # Converting character to integer
            dp[i][0] = min(dp[i - 1][0], dp[i - 1][2]) + 9 - c
            dp[i][1] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c
            dp[i][2] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c + 1
        
        # Uncomment the following line to use debug
        # self.debug(dp)
        
        dp[l - 1][0] += 1
        print(min(dp[l - 1][0], min(dp[l - 1][1], dp[l - 1][2])))

    def debug(self, *args):
        # This function is a simple replacement for the debug method in the original code.
        # It prints the arguments to standard error.
        from pprint import pprint
        pprint(args)

#