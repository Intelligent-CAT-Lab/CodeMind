import math

a, b = input().split()
a = int(a)
b = float(b)
c = round(b * 100)
d = a * c
print(d // 100)