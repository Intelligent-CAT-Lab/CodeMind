class main:
    import sys
    
    def c(a, b):
        fact = [1] * (b + 1)
        inv = [1] * (b + 1)
        ifact = [1] * (b + 1)
        for i in range(2, b + 1):
            fact[i] = i * fact[i - 1] % _m
            inv[i] = (_m - (_m // i) * inv[_m % i] % _m) % _m
            ifact[i] = inv[i] * ifact[i - 1] % _m
        return ifact[a] * ifact[b - a] % _m * fact[b] % _m
    
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
            cur = c(m, i - m - 1)
            cur = cur * md[m] % _m
            res = (res + (cur - prev) * m % _m) % _m
            prev = cur
        return res
    
    _m = 1000000007
    print(solve(int(sys.stdin.readline())))