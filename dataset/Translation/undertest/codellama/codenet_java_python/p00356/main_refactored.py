class main:
    import math
    
    def gcd(a, b):
        while b != 0:
            a, b = b, a % b
        return a
    
    def solve(x, y):
        g = gcd(x, y)
        m = x + y - g
        if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
            return m + 1
        else:
            return m
    
    x = int(input())
    y = int(input())
    print(solve(x, y))