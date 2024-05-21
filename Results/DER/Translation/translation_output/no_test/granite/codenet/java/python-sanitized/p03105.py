import sys

A, B, C = map(int, sys.stdin.readline().split())
N = B // A

if N > C:
    print(C)
else:
    print(N)