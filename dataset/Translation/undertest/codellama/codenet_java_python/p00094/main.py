import math

while True:
    try:
        a, b = map(float, input().split())
        print(math.sqrt(a * b) / 3.305785)
    except:
        break