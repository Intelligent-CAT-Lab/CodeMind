class main:
    import math
    
    def primeFactorize(n):
        res = []
        for a in range(2, int(math.sqrt(n))+1):
            if n % a == 0:
                ex = 0
                while n % a == 0:
                    ex += 1
                    n //= a
                res.append({a: ex})
        if n != 1:
            res.append({n: 1})
        return res
    
    n = int(input())
    ex = [0] * 1001
    for i in range(2, n+1):
        pfs = primeFactorize(i)
        for pf in pfs:
            for k, v in pf.items():
                ex[k] += v
    
    ans = 1
    for i in range(2, n+1):
        ans *= (ex[i] + 1)
        ans %= 1000000007
    
    print(ans)