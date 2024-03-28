import sys

a, b = map(int, sys.stdin.readline().split())

if a >= b:
    for i in range(a):
        print(b, end="")
else:
    for i in range(b):
        print(a, end="")