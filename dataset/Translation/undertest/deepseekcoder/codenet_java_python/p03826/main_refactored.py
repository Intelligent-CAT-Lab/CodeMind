class main:
    def p03826():
        a, b, c, d = map(int, input().split())
        a *= b
        c *= d
        print(max(a, c))
    
    p03826()