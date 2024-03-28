import math

def p02584(x, k, d):
    absX = abs(x)
    if absX // d >= k:
        return absX - k * d
    else:
        sho = absX // d
        amari = absX % d
        if (k - sho) % 2 == 0:
            return amari
        else:
            return d - amari

x, k, d = map(int, input().split())
print(p02584(x, k, d))