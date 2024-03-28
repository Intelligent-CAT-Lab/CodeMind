import math

# Water Bottle
def water_bottle():
    A, B, X = map(int, input().split())

    if X * 2 >= A * A * B:
        z = (A * A * B - X) / A / A * 2
        d = math.atan(z / A) * 180 / math.pi
    else:
        z = X / A / B * 2
        d = math.atan(B / z) * 180 / math.pi

    print('{:.10f}'.format(d))

water_bottle()