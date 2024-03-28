class main:
    import math
    
    def solve(x, k, d):
        abs_x = abs(x)
        if abs_x // d >= k:
            return abs_x - k * d
        else:
            sho = abs_x // d
            amari = abs_x % d
            if (k - sho) % 2 == 0:
                return amari
            else:
                return d - amari
    
    print(solve(6, 2, 4))