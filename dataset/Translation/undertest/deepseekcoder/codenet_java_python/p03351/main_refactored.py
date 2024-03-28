class main:
    def p03351(a, b, c, d):
        ab = abs(a-b)
        ac = abs(a-c)
        bc = abs(b-c)
        if ac <= d or (ab <= d and bc <= d):
            return "Yes"
        else:
            return "No"
    
    # Test input
    print(p03351(4, 7, 9, 3))