import math

def calculate_circle_properties(r):
    pi = math.pi
    x = r*r*pi
    y = 2*r*pi
    return round(x, 6), round(y, 6)

r = float(input())
x, y = calculate_circle_properties(r)
print(x, y)