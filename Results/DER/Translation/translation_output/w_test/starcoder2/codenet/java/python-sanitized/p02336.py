import math

def combination(n, r):
    if n < r or r < 0:
        return 0
    return math.factorial(n) // math.factorial(r) // math.factorial(n-r)

n, k = map(int, input().split())
print(combination(n-1, k))