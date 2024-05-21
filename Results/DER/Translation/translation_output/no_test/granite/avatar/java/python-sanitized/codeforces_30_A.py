import math

A, B, N = map(int, input().split())

for x in range(-1000, 1001):
    if A * (x ** N) == B:
        print(x)
        break
else:
    print("No solution")