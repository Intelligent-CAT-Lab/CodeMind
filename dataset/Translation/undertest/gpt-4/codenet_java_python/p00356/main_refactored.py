class main:
    import math
    
    def p00356(x, y):
        gcd = math.gcd(x, y)
        m = x + y - gcd
        
        if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
            return m + 1
        else:
            return m
    
    # Test input:
    x, y = map(int, input().split())
    
    # Expected output:
    print(p00356(x, y))