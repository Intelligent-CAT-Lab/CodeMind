class main:
    def f(n):
        if n <= 2:
            return n
        if n in mb:
            return mb[n]
        res = (f(n//2) + f((n-1)//2) + f((n+1)//2)) % MOD
        mb[n] = res
        return res
    
    MOD = 1000000007
    mb = {}
    n = int(input())
    print(f(n+1))