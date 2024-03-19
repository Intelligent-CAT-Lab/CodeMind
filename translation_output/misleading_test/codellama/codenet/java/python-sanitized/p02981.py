import math

def solve(n, a, b):
    return math.min(a * n, b)

# Test case
print(solve(4, 2, 9)) # Output: 38