class main:
    import math
    
    a = int(input())
    b = int(input())
    tmp1 = float(input())
    tmp2 = float(input())
    
    h = (tmp1 / 6.0) * math.pi + (tmp2 / 30.0) * math.pi / 12.0
    m = (tmp2 / 30.0) * math.pi + (tmp1 / 6.0) * math.pi * 12.0
    rad = h - m
    
    res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2.0 * a * b * math.cos(rad)))
    
    print(res)