import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a >= b:
    for i in range(a):
        print(b, end='')
else:
    for i in range(b):
        print(a, end='')