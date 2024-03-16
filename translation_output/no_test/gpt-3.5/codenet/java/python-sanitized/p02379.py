import math

lines = input().split()
list = [float(lines[i]) for i in range(4)]

distance = math.sqrt((list[0] - list[2])**2 + (list[1] - list[3])**2)
print(distance)