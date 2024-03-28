class main:
    import sys
    
    mod = 1000000007
    
    def dp(n, i, j, k, l):
        if i == 1 and j == 2 and k == 3:
            return 0
        if i == 1 and j == 1 and k == 3:
            return 0
        if j == 1 and k == 2 and l == 3:
            return 0
        if j == 1 and k == 1 and l == 3:
            return 0
        if k == 1 and l == 1 and j == 3:
            return 0
        if k == 1 and l == 2 and j == 3:
            return 0
        if k == 2 and l == 1 and j == 3:
            return 0
        return (dp(n, i, j, k, l) + dp(n-1, i, j, k, l)) % mod
    
    n = int(input())
    ans = 0
    for i in range(1, 5):
        for j in range(1, 5):
            for k in range(1, 5):
                ans = (ans + dp(n, i, j, k, 4)) % mod
    print(ans)