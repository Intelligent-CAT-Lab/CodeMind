import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
C = int(sys.stdin.readline())

if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes")