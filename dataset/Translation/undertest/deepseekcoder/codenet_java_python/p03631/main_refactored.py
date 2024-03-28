class main:
    def p03631(a):
        a100 = a // 100
        a10 = a // 10 - a100 * 10
        a1 = a - a100 * 100 - a10 * 10
        rev = a1 * 100 + a10 * 10 + a100
        if a == rev:
            return "Yes"
        else:
            return "No"
    
    print(p03631(575))