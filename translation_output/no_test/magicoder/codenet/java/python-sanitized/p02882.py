import math

# Water Bottle
A, B, X = map(int, input().split())

if X * 2 >= A * A * B:
    z = (A * A * B - X) / A / A * 2
    d = math.degrees(math.atan(z / A))
else:
    z = X / A / B * 2
    d = math.degrees(math.atan(B / z))

print(d)