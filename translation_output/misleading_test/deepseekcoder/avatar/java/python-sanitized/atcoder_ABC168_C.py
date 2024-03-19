import math

def solve():
    a, b, x, y = map(int, input().split())

    h = x / 6. * math.pi + y / 30. * math.pi / 12.
    m = y / 30. * math.pi + x / 6. * math.pi * 12.
    rad = h - m

    res = math.sqrt(a**2 + b**2 - (2. * a * b * math.cos(rad)))

    print(res)

solve()