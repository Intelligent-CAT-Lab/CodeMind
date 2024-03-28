class main:
    def p03315():
        ary = input()
        num=0
        for c in ary:
            if c == '+':
                num += 1
            else:
                num -= 1
        print(num)
    
    p03315()