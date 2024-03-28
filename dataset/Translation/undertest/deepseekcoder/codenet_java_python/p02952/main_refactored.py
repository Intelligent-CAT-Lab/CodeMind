class main:
    def p02952(n):
        c = 0
        for i in range(1, n+1):
            if len(str(i)) % 2 != 0:
                c += 1
        return c
    
    print(p02952(11))