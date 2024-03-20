import math

def calculate_area(r):
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    return x, y

n = int(input())
for i in range(n):
    r = float(input())
    x, y = calculate_area(r)
    print("{:.6f} {:.6f}".format(x, y))