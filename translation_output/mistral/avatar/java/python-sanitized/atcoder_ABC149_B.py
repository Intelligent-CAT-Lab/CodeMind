import sys

A = int(input())
B = int(input())
K = int(input())

n = A - K

if A + B <= K:
    print("0 0")
elif n < 0:
    print("0", A + B - K)
else:
    print(n + 1, B)