class main:
    import math
    
    a, b = map(int, input().split())
    tmp1, tmp2 = map(float, input().split())
    
    h = (tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.) % (2 * math.pi)
    m = (tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.) % (2 * math.pi)
    rad = h - m
    
    res = math.sqrt(a ** 2 + b ** 2 - 2 * a * b * math.cos(rad))
    
    print("{:.4f}".format(res))