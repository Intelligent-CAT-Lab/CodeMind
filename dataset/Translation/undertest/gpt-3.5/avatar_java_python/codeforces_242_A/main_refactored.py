class main:
    import sys
    
    def codeforces_242_A():
        x, y, a, b = map(int, sys.stdin.readline().split())
        res = []
        for i in range(a, x + 1):
            for j in range(b, y + 1):
                if i <= j:
                    continue
                res.append(str(i) + ' ' + str(j))
        print(len(res))
        for s in res:
            print(s)
    
    codeforces_242_A()