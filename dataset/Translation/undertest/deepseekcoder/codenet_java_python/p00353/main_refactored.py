class main:
    def p00353(m, f, b):
        if b > m + f:
            return "NA"
        elif b > m:
            return b - m
        else:
            return 0
    
    # Test input
    m, f, b = 1000, 3000, 3000
    
    # Call the function with test input
    print(p00353(m, f, b))