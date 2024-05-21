import sys

x = int(sys.stdin.read())
next = 2
for i in range(x):
    next = (next + 1) * 2
print(next)