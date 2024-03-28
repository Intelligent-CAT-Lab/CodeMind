import sys

n, k = map(int, sys.stdin.readline().split())

if n <= k:
    print(1)
else:
    print(0)