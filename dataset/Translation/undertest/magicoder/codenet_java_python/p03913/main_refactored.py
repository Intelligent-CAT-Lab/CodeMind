class main:
    import math
    
    def pow(a, n):
        ret = 1
        for _ in range(n):
            ret *= a
        return ret
    
    def solver(n, a):
        ans = n
        for m in range(2, 41):
            c = int(n ** (