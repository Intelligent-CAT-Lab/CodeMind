import sys

w, h, x, y = map(int, sys.stdin.readline().split())

ans = w * h / 2

if x + x == w and y + y == h:
    a = 1
else:
    a = 0

print(ans, a)