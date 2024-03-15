import sys

r = int(sys.stdin.readline())
d = int(sys.stdin.readline())
x = int(sys.stdin.readline())

for i in range(10):
    x = r * x - d
    print(x)