import sys

w, h, x, y = map(int, sys.stdin.readline().split())
ans = (w * h) / 2
if x == w // 2 and y == h // 2:
    a = 1
print(ans, a)