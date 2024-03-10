import sys

A, B, K = map(int, sys.stdin.readline().split())

if A + B <= K:
    print(0, 0)
elif A - K < 0:
    print(0, A + B - K)
else:
    print(A - K, B)