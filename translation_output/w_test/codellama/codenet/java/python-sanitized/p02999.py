import sys

a, b = map(int, sys.stdin.readline().split())

if a < b:
    print(0)
else:
    print(10)