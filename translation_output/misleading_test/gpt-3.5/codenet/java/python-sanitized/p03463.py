import sys

n, a, b = map(int, input().split())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")