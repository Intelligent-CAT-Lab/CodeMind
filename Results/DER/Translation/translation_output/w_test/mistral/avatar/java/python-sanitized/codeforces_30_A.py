import math

A = int(input())
B = int(input())
N = int(input())

for x in range(-1000, 1001):
    if (math.pow(x, N) * math.pow(10, A)) == B:
        print(x)
        break
else:
    print("No solution")