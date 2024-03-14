import sys

w, h, x, y = map(int, sys.stdin.readline().split())

if x + x == w and y + y == h:
    print(w * h / 2, 1)
else:
    print(w * h / 2, 0)