import math

A, B, X = map(int, input().split())

d = 0.0

if X * 2 >= A * A * B:
    z = (A * A * B - X) / A / A * 2
    d = math.atan(z / A) * 180 / math.pi
else:
    z = X / A / B * 2
    d = math.atan(B / z) * 180 / math.pi

print(d)