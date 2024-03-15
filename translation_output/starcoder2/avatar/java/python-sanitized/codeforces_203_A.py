import sys

points = int(sys.stdin.readline())
t = int(sys.stdin.readline())
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
ta = int(sys.stdin.readline())
tb = int(sys.stdin.readline())

for i in range(t):
    for j in range(t):
        if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
            print("YES")
            sys.exit(0)
print("NO")