import sys

A, B = map(int, sys.stdin.readline().split())

if A + B > 23:
    print(A + B - 24)
else:
    print(A + B)