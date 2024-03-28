import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a >= b:
    for i in range(a):
        sys.stdout.write(b)
else:
    for i in range(b):
        sys.stdout.write(a)