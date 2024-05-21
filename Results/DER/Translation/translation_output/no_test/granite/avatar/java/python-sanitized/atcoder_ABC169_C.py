import sys

a, b = map(int, sys.stdin.readline().split())
c = round(b * 100)
d = a * c
print(d // 100)