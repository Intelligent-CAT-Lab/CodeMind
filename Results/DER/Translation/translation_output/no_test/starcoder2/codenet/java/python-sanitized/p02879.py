import sys

A, B = map(int, sys.stdin.readline().split())
if 9 < A or 9 < B:
    print(-1)
else:
    print(A * B)