import math

N = int(input())
sqrt_N = int(math.sqrt(N))

for i in range(sqrt_N, 0, -1):
    if N % i == 0:
        A = len(str(i))
        B = len(str(N // i))
        print(max(A, B))
        break