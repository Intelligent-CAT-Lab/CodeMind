import math

a = int(input())
b = int(input())
c = int(input())
d = int(input())

print(max(max(max(a * c, b * d), a * d), b * c))