class main:
    def p02843():
        x = int(input())
        if x % 100 <= x // 100 * 5:
            print(1)
        else:
            print(0)
    
    p02843()