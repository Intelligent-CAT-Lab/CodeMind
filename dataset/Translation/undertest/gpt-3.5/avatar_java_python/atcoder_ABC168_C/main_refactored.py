class main:
    import math
    
    a, b, tmp1, tmp2 = map(float, input().split())
    
    h = tmp1 / 6.0 * math.pi + tmp2 / 30.0 * math.pi / 12.0
    m = tmp2 / 30.0 * math.pi + tmp1 / 6.0 * math.pi * 12.0
    rad = h - m
    
    res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2.0 * a * b * math.cos(rad)))
    
    print("{:.15f}".format(res))