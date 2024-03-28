class main:
    def p02682():
        a, b, c, d = map(int, input().split())
        sum = 0
        if d <= a:
            print(d)
            return
        sum = a
        d -= a
        if d <= b:
            print(sum)
            return
        d -= b
        sum -= d
        print(sum)
    
    p02682()