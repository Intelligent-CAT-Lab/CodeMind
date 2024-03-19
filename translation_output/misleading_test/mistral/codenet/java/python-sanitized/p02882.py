import math

def p02882():
    A = int(input())
    B = int(input())
    X = int(input())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = (X) / A / B * 2
        d = math.atan(B / z) * 180 / math.pi

    print(d)

p02882()