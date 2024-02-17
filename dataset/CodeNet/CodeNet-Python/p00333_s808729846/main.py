import math

w, h, c = map(int, input().split())

size = math.gcd(w, h)
cost = w // size * h // size * c
print(cost)
