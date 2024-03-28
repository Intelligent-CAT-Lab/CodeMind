import math

a = int(input())
b = int(input())
tmp1 = float(input())
tmp2 = float(input())

h = (tmp1 / 6. * math.pi) + (tmp2 / 30. * math.pi / 12.)
m = (tmp2 / 30. * math.pi) + (tmp1 / 6. * math.pi * 12.)
rad = h - m

res = math.sqrt(a**2 + b**2 - 2*a*b*math.cos(rad))

print(res)