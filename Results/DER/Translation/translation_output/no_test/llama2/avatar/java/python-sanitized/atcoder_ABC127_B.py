import sys

r, d, x = map(int, sys.stdin.readline().split())

for _ in range(10):
    x = r * x - d
    print(x)