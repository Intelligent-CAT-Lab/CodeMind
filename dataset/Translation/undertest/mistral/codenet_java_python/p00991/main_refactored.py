class main:
    import math
    
    def p00991():
        r, c, a1, a2, b1, b2 = map(int, input().split())
        x, y = abs(a1 - b1), abs(a2 - b2)
        x = min(x, r - x)
        y = min(y, c - y)
        z, C = 1, min(x, y)
        if x == r - x:
            z *= 2
        if y == c - y:
            z *= 2
        b = math.big(1)
        for i in range(C):
            b = b * math.big(x + y - i) / math.big(i + 1)
        return math.big(b * z) % math.big("100000007")
    
    p00991()