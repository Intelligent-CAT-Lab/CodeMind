import sys

A = int(input())
B = int(input())
C = int(input())

if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes")