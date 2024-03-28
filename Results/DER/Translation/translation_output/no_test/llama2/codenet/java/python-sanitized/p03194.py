import math

def solve(n, p):
    if n == 1:
        return p
    if p <= 1:
        return 1
    for i in range(2, int(math.sqrt(p)) + 1):
        if p % math.pow(i, n) == 0:
            return i
    return 1