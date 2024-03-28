class main:
    def main():
        mod = 10**9 + 7
        n, k = map(int, input().split())
    
        len = []
        l = 1
        while l <= n:
            r = n // (n // l)
            len.append(r - l + 1)
            l = r + 1
    
        q = len.__len__()
        dp = [0] * (k * (q + 1))
    
        for j in range(1, q + 1):
            dp[j] = len[j - 1] + dp[j - 1]
    
        for i in range(1, k):
            for j in range(1, q + 1):
                dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len[j - 1]
                dp[i * (q + 1) + j] %= mod
    
        print(dp[k * (q + 1) - 1])
    
    if __name__ == "__main__":
        main()