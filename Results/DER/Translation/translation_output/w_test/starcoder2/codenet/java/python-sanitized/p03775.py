import math

N = int(input())

sqrt = int(math.sqrt(N))

for i in range(sqrt, 0, -1):
    if N % i == 0:
        A = len(str(i))
        B = len(str(N // i))
        print(max(A, B))
        break