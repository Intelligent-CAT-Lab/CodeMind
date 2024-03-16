import sys

a, b = map(int, sys.stdin.readline().split())

if b % a == 0:
    print(a + b)
else:
    print(b - a)