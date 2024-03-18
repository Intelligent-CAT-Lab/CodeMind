import math

def circle_properties(r):
    pi = math.pi
    x = r * r * pi
    y = 2 * r * pi
    return x, y

# Reading input from user
r = float(input())

# Getting the values of x and y
x, y = circle_properties(r)

# Printing the results
print(f"{x:.6f} {y:.6f}")