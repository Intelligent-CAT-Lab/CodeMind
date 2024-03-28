class main:
    import sys
    
    def input():
        global sc
        sc = sys.stdin
        n = int(sc.readline())
        m = int(sc.readline())
        k = int(sc.readline())
        ans = 0
        fact = [1, 1]
        ifact = [1, 1]
        for i in range(1, n+1):
            fact.append(fact[i-1] * i)
            ifact.append(mod