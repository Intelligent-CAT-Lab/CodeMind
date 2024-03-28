class main:
    import sys
    
    P = 1_000_000_007
    
    def solve():
        n = int(sys.stdin.readline())
        dp = [1, 0, 0]
    
        inv = [0, 1] + [0] * (n + 5)
        for x in range(2, n + 7):
            inv[x] = P - (P // x) * inv[P % x] % P
    
        coef = 1
        ret = 0
        for k in range(1, n + 1):
            nxt = [0, 0, 0]
            for j1 in range(3):
                for j2 in range(3):
                    if j1 != j2:
                        nxt[j2] = (nxt[j2] + dp[j1]) % P
    
            dp = nxt
    
            coef = coef * (n - k + 1) % P * inv[k] % P
    
            ways = dp[1] * coef % P
    
            delta = inv[3] * inv[n] % P * inv[k] % P * ways % P
    
            ret = (ret + delta) % P
    
        for i in range(1, n):
            ret = ret * inv[3] % P
    
        print(ret)
    
    if __name__ == "__main__":
        solve()