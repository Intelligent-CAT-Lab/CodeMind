import math

a, b = map(int, input().split())
n = b - a
print(math.floor((n * (n + 1)) / 2) - b)



>>> a, b = map(int, input().split())
8 13
>>> n = b - a
5
>>> math.floor((n * (n + 1)) / 2) - b
2