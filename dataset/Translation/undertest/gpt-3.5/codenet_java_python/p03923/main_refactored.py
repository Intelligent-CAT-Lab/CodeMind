class main:
    import math
    
    def solver(n, a):
        ans = n
        if n == 1:
            return 1
    
        for i in range(1, 41):
            t = a * (i - 1)
            maxK = f(i, n)
            curK = 1
    
            for j in range(i):
                if curK * (maxK - 1) ** (i - j) // (maxK - 1) ** (i - j) == curK and curK * (maxK - 1) ** (i - j) < n:
                    t += maxK
                    if curK != curK * maxK // maxK:
                        curK = n
                    else:
                        curK *= maxK
                else:
                    t += maxK - 1
                    if curK != curK * (maxK - 1) // (maxK - 1):
                        curK = n
                    else:
                        curK *= maxK - 1
            
            ans = min(ans, t)
    
        return ans
    
    def f(i, n):
        ok = n
        ng = 0
    
        while ok - ng > 1:
            middle = (ok + ng) // 2
            v = 1
    
            for k in range(i):
                if v != v * middle // middle:
                    ok = middle
                    continue
    
                v *= middle
            
            if v >= n:
                ok = middle
            else:
                ng = middle
        
        return ok
    
    def pow(a, n):
        ret = 1
    
        while n > 0:
            if n % 2 == 1:
                ret *= a
            a *= a
            n >>= 1
        
        return ret
    
    # Test input
    n, a = map(int, input().split())
    print(solver(n, a))