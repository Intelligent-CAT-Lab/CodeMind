import math

def calculate_distance(x1, y1, x2, y2):
    return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)

# Test input
x1, y1, x2, y2 = 0, 0, 1, 1

# Calculate distance
distance = calculate_distance(x1, y1, x2, y2)

print(distance)