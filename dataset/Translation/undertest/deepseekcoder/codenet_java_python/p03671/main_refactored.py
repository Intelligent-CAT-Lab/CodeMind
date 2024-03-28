class main:
    def p03671(a, b, c):
        sum = [a, b, c]
        sum.sort()
        return sum[0] + sum[1]
    
    # Test input
    a = 700
    b = 600
    c = 780
    
    # Expected output
    print(p03671(a, b, c))