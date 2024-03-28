from sympy import Pow
import sys

A, B, N = map(int, input().split())

for x in range(-1000, 1001):
    if Pow(x, N) * A == B:
        print(x)
        sys.exit()
print("No solution")