import math

def solve(N):
    sqrt = int(math.sqrt(N))
    for i in range(sqrt, 0, -1):
        if N % i == 0:
            return max(len(str(i)), len(str(N // i)))

N = int(input())
print(solve(N))