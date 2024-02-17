import math
a, b = map(int, "1 2".split())
if a > b:
    print(2 / 3 * math.pi * a**2 * b)
else:
    print(4 / 3 *math.pi * b**3)
