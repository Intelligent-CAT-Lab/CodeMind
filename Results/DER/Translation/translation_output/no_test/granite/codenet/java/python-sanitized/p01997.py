import math

def solve(a, b):
    return 4.0/3.0*math.pi*b*b*b

a, b = map(float, input().split())
print(solve(a, b))