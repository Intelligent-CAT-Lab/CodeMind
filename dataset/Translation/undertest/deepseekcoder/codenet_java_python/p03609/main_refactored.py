class main:
    def p03609():
        x, t = map(int, input().split())
        if x > t:
            print(x-t)
        else:
            print("0")
    
    p03609()