import math

def is_within_distance(a, b, c, d):
    ab = abs(a - b)
    ac = abs(a - c)
    bc = abs(b - c)
    return ac <= d or (ab <= d and bc <= d)

print("Yes") if is_within_distance(4, 7, 9, 3) else print("No")