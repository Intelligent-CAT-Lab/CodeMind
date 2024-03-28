import math

a, b = map(int, input().split())
h, m = map(float, input().split())

rad = h - m

res = math.sqrt(a**2 + b**2 - 2 * a * b * math.cos(rad))

print(res)