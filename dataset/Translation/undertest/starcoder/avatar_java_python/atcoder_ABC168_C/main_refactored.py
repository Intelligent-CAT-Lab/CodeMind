class main:
    import math
    
    a, b, h, m = map(int, input().split())
    
    h = h / 6. * math.pi + m / 30. * math.pi / 12.
    m = m / 30. * math.pi + h / 6. * math.pi * 12.
    rad = h - m
    
    res = math.sqrt(a ** 2 + b ** 2 - 2 * a * b * math.cos(rad))
    
    print(res)