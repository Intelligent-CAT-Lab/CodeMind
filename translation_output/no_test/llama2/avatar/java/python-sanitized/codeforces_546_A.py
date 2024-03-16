import sys

o, n, g = map(int, sys.stdin.readline().split())

x = 0
for _ in range(g):
    x += o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)