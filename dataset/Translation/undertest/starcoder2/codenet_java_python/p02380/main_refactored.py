class main:
    import math
    
    a, b, cc = map(float, input().split())
    cc = math.radians(cc)
    
    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)
    
    print(s)
    print(l)
    print(h)