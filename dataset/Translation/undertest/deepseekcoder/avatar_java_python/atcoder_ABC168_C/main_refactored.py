class main:
    import math
    
    def atcoder_ABC168_C(a, b, h, m):
        h = h / 60. * math.pi + m / 360. * math.pi
        m = m / 30. * math.pi + h / 12. * math.pi * 60.
        rad = h - m
        
        res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2. * a * b * math.cos(rad)))
        
        return res
    
    a, b, h, m = map(int, input().split())
    print(f"{atcoder_ABC168_C(a, b, h, m):.6f}")