import sys

n, a, b = map(int, sys.stdin.readline().strip().split())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")