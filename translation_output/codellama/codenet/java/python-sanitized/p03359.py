import sys

a, b = map(int, sys.stdin.readline().split())

if b >= a:
    print(a)
else:
    print(a - 1)