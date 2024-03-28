class main:
    import sys
    
    class Solution:
        def minSteps(self, N: str) -> int:
            N = '0' + N
            l = len(N)
            dp = [[0] * 3 for _ in range(l + 1)]
            dp[0][0] = dp[0][2] = 1
            for i in range(1, l):
                c = int(N[i])
                dp[i][0] = min(dp[i - 1][0], dp[i - 1][2]) + 9 - c
                dp[i][1] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c
                dp[i][2] = min(dp[i - 1][0] + 1, dp[i - 1][1]) + c + 1
            dp[l - 1][0] += 1
            return min(dp[l - 1][0], min(dp[l - 1][1], dp[l - 1][2]))
    
    def main():
        sol = Solution()
        N = sys.stdin.readline().strip()
        print(sol.minSteps(N))
    
    if __name__ == '__main__':
        main()