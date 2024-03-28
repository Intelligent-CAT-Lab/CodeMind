import sys

A, B, K = map(int, sys.stdin.readline().split())

if A + B <= K:
    print("0 0")
elif A + B - K < 0:
    print("0 " + str(A + B - K))
else:
    print(str(A + B - K) + " " + str(B))