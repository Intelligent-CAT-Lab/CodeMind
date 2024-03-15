import sys

w = int(sys.stdin.readline())
h = int(sys.stdin.readline())
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

ans = (w * h) / 2
a = 0
if x + x == w and y + y == h:
    a = 1

print(ans + " " + str(a))