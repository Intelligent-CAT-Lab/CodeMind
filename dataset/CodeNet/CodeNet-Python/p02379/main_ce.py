import math
x1, y1, x2, y2 = map(lambda x: float(x), "0 0 1 1".split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))
