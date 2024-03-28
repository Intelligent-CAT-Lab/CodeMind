class main:
    import sys
    
    def calc(n):
        if n == 0:
            return 0
        if memo[n]!= -1:
            return memo[n]
        res = n
        for pow6 in range(1, n+1):
            res = min(res, calc(n-pow6)+1)
        for pow9 in range(1, n+1):
            res = min(res, calc(n-pow9)+1)
        memo[n] = res
        return memo[n]
    
    memo = [-1 for _ in range(110000)]
    
    n = int(sys.stdin.readline())
    print(calc(n))