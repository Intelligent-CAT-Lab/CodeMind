class main:
    def pow(a, n, mod):
        ret = 1
        while n > 0:
            if n & 1:
                ret = ret * a % mod
            a = a * a % mod
            n >>= 1
        return ret
    
    def invl(a, mod):
        return pow(a, mod-2, mod)
    
    def solve(n, K):
        mod = 924844033
        
        dp = [[[0 for _ in range(n+1)] for _ in range(2)] for _ in range(n+1)]
        dp[0][0][0] = 1
        for i in range(n):
            for j in range(n):
                if not dp[i][0][j] and not dp[i][1][j]:
                    continue
                dp[i+1][0][j] = (dp[i+1][0][j] + dp[i][0][j] + dp[i][1][j]) % mod
                dp[i+1][1][j+1] = (dp[i+1][1][j+1] + dp[i][0][j] + dp[i][1][j]) % mod
                if i > 0:
                    dp[i+1][0][j+1] = (dp[i+1][0][j+1] + dp[i][0][j]) % mod
        
        ep = [[[0 for _ in range(n+1)] for _ in range(2)] for _ in range(n+1)]
        ep[0][0][0] = 1
        for i in range(n):
            for j in range(n):
                if not ep[i][0][j] and not ep[i][1][j]:
                    continue
                ep[i+1][0][j] = (ep[i+1][0][j] + ep[i][0][j] + ep[i][1][j]) % mod
                ep[i+1][1][j+1] = (ep[i+1][1][j+1] + ep[i][0][j] + ep[i][1][j]) % mod
                ep[i+1][0][j+1] = (ep[i+1][0][j+1] + ep[i][0][j]) % mod
        
        fp = [1] + [0] * n
        for i in range(min(2*K, n)):
            len_i = (n-i+2*K-1)//(2*K)
            temp = [0] * (n+1)
            if i < K:
                if i+2*K*(len_i-1)+K < n:
                    for v in range(n+1):
                        temp[v] = dp[len_i][0][v] + dp[len_i][1][v]
                else:
                    for v in range(n+1):
                        temp[v] = dp[len_i][0][v]
            else:
                if i+2*K*(len_i-1)+K < n:
                    for v in range(n+1):
                        temp[v] = ep[len_i][0][v] + ep[len_i][1][v]
                else:
                    for v in range(n+1):
                        temp[v] = ep[len_i][0][v]
            # convoluteSimply function is needed but not included in the translation
            # as it requires a full implementation of the NTT (Number