class main:
    import sys
    
    def c(a, b):
        if a == b or a == 0:
            return 1
        else:
            return (fact[a] * pow(fact[b - a], _m - 2, _m) * pow(fact[b], _m - 2, _m)) % _m
    
    def fact(a):
        if a == 0 or a == 1:
            return 1
        else:
            return (a * fact(a - 1)) % _m
    
    def solve(i):
        md = [0] * i
        rm = i - 2
        lx = i - 2
        while rm >= 0:
            md[lx + 1] = c(rm, lx)
            rm -= 2
            lx -= 1
        res = 0
        prev = 0
        for m in range(1, i):
            cur = (fact(m) * fact(i - m - 1)) % _m
            cur = (cur * md[m]) % _m
            res = (res + (cur - prev + _m) * m) % _m
            prev = cur
        return res
    
    _m = 1000000007
    i = int(sys.stdin.readline())
    print(solve(i))