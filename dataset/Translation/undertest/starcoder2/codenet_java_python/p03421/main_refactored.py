class main:
    import sys
    
    def calc(n, a, b):
        for i in range(n - a + 1, n + 1):
            print(i, end=' ')
        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not calcInner(rest, a - 1, b - 1):
                print(-1)
                return
        for i in range(n - a, rest, -1):
            print(i, end=' ')
        print()
    
    def calcInner(n, a, b):
        first = []
        second = []
        while True:
            if a <= 0 or b <= 0:
                return False
            firstI = n - a + 1 if n - a + 1 >= 1 else 1
            for i in range(firstI, n + 1):
                first.append(i)
            rest = n - a - b + 1
            endI = rest + 1 if rest + 1 >= 1 else 1
            subSecond = []
            for i in range(firstI - 1, endI - 1, -1):
                subSecond.append(i)
            second = subSecond + second
            if rest <= 0:
                print(*first, *second, sep=' ')
                return True
            else:
                n = rest
                a -= 1
                b -= 1
    
    n, a, b = map(int, sys.stdin.readline().split())
    calc(n, a, b)