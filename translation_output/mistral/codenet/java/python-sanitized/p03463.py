import sys

n = int(input())
a = int(input())
b = int(input())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")