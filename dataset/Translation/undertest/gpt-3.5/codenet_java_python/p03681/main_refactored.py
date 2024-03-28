class main:
    def solve():
        n, m = map(int, input().split())
        if n > m:
            n, m = m, n
        if m - n > 1:
            print(0)
            return
    
        mod = 10**9 + 7
    
        def mul(a, b):
            return (a * b) % mod
    
        ans = 1
        for i in range(n):
            ans = mul(ans, i+1)
        for i in range(m):
            ans = mul(ans, i+1)
    
        if m == n:
            ans = mul(ans, 2)
    
        print(ans)
    
    # Test input
    solve()