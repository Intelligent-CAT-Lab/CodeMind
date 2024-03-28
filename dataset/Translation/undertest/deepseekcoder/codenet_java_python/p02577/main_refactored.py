class main:
    def p02577(s):
        c = 0
        for i in s:
            c += int(i)
        if c % 9 == 0:
            return "Yes"
        else:
            return "No"
    
    print(p02577("123456789"))