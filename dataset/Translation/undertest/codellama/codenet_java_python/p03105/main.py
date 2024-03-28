import sys

A, B, C = map(int, sys.stdin.readline().split())
N = int(B / A)
if N > C:
    print(C)
else:
    print(N)