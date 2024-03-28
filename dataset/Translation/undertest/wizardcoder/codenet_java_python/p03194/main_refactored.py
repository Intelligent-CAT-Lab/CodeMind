class main:
    import math
    
    def find_power(n, p):
        if n == 1:
            return p
        res = 1
        for i in range(2, int(math.pow(p, 1/n))+1):
            if p % math.pow(i, n) == 0:
                res = i
        return res
    
    n, p = map(int, input().split())
    print(find_power(n, p))