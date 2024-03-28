class main:
    import sys
    
    def main():
        n = int(sys.stdin.readline().strip())
        mod = 1000000007
        dp = [1] + [0] * n
        for i in range(3, n + 1):
            for j in range(3, i + 1):
                dp[i] = (dp[i] + dp[i - j]) % mod
        print(dp[n])
    
    if __name__ == "__main__":
        main()