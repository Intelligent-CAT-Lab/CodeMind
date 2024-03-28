class main:
    import sys
    
    def calc(n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans
    
    def solve(N, K):
        cnt = 0
        wk = 0
        ans = 0
        for i in range(1, N+1):
            cnt = calc(K, i)
            wk = 1 / (cnt * N)
            ans += wk
        return ans
    
    N, K = map(