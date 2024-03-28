import math

def calculate_distance(x1, y1, x2, y2):
    return math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))

input_values = input().split()
x1, y1, x2, y2 = map(float, input_values)

print(calculate_distance(x1, y1, x2, y2))