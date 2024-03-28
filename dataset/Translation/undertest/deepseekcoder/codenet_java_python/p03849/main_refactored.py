class main:
    MOD = 1000000007
    
    def f(n):
        if n <= 2:
            return n
        res = f(n//2) + f((n-1)//2) + f((n+1)//2)
        res %= MOD
        return res
    
    n = int(input())
    print(f(n+1))