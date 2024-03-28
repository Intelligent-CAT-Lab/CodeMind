import sys

h = int(sys.stdin.readline())
w = int(sys.stdin.readline())
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")