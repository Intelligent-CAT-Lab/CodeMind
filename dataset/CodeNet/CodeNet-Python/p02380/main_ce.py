import math
a, b, c = map(int, "4 3 90".split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))
