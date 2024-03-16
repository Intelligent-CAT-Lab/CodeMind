import sys

n, a, b = map(int, sys.stdin.readline().split())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")