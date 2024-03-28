import math

A = int(input())
B = int(input())
N = int(input())

for x in range(-1000, 1001):
    if (math.pow(x, N) * math.big(A) == math.big(B)):
        print(x)
        break

print("No solution")