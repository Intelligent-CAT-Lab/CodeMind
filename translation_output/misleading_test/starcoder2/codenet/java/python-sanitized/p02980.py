import math

MODULO = 998244353

def nCr(n, r):
    return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))

def solve(height, width):
    ph = [1]
    for i in range(1, width + 1):
        ph.append(ph[i - 1] * (height + 1) % MODULO)
    pw = [1]
    for i in range(1, height + 1):
        pw.append(pw[i - 1] * (width + 1) % MODULO)
    res = 0
    for common in range(min(height, width) + 1):
        ways = nCr(height, common) * nCr(width, common) * ph[width - common] * pw[height - common]
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    return res

height, width = map(int, input().split())
print(solve(height, width))