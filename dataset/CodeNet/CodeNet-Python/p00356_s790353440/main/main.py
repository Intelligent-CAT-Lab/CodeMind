import math
def intersection(x,y):
    g = math.gcd(x, y)
    if g == 1:
        return x + y
    return intersection(x//g, y//g) * g - (g-1)
print((intersection(*list(map(int, input().split())))))
