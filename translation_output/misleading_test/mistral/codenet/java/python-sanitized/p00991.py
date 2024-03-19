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
    b = math.bigdecimal.ONE
    for i in range(C):
        b = b * (math.bigdecimal(str(x + y - i)) / math.bigdecimal(str(i + 1)))
    return (b * math.bigdecimal(str(z))).mod(math.bigdecimal("100000007"))

# Test input
r, c, a1, a2, b1, b2 = map(int, input().split())

# Expected output
print(p00991())