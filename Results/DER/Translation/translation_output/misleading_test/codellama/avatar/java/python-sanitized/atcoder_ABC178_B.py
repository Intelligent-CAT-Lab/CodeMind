import math

def max_product(a, b, c, d):
    return max(a * c, b * d, a * d, b * c)

a, b, c, d = map(int, input().split())
print(max_product(a, b, c, d))