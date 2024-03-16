import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
C = int(sys.stdin.readline())

if A == B:
    print(C)
elif B == C:
    print(A)
else:
    print(B)