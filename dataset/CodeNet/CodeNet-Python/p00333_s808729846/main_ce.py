import math
w, h, c = map(int, "10 20 5".split())
size = math.gcd(w, h)
cost = w // size * h // size * c
print(cost)
