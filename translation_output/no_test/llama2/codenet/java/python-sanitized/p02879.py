import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

if 9 < A or 9 < B:
    print(-1)
else:
    print(A * B)