import sys

a, b, c, d = map(int, sys.stdin.readline().split())

t = c // b
tt = c % b
y = a // d
u = a % d
while a >= 0 or c >= 0:
    c = c - b
    if c <= 0:
        print("Yes")
        break
    a = a - d
    if a <= 0:
        print("No")
        break