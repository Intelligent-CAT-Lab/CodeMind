import sys

w, h = map(int, sys.stdin.readline().split())

if w == 1 or h == 1:
    print(1)
else:
    print((w * h) // 2 + 1 if (w * h) % 2 == 1 else (w * h) // 2)