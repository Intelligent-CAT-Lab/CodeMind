import sys

n, k = map(int, sys.stdin.readline().split())

if n % k == 0:
    print(0)
else:
    print(1)