import sys
from functools import reduce

MODULO = 998244353

def invs(k):
    invs = [1] * (k + 2)
    for i in range(2, k + 2):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
    return invs

def facts(k):
    facts = [1] * (k + 2)
    invs = invs(k)
    invfacts = [1] * (k + 2)
    for i in range(1, k + 2):
        facts[i] = (facts[i - 1] * i) % MODULO
        invfacts[i] = (invfacts[i - 1] * invs[i]) % MODULO
    return facts, invfacts

def solve(height, width):
    ph = [1] * (width + 1)
    for i in range(1, width + 1):
        ph[i] = (ph[i - 1] * (height + 1)) % MODULO
    pw = [1] * (height + 1)
    for i in range(1, height + 1):
        pw[i] = (pw[i - 1] * (width + 1)) % MODULO
    res = 0
    for common in range(min(height, width) + 1):
        ways = facts(height)[0][height] * facts(height)[1][common] % MODULO * facts(height)[1][height - common] % MODULO * facts(width)[0][width] % MODULO * facts(width)[1][width - common] % MODULO * ph[width - common] % MODULO * pw[height - common] % MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0: res += MODULO
    return res

if __name__ == "__main__":
    height, width = map(int, sys.stdin.readline().split())
    print(solve(height, width))