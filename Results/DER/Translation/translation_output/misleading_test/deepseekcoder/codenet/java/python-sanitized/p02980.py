import sys

MODULO = 998244353

def solve(height, width):
    invs = [0, 1] + [0] * (height * width)
    invs[1] = 1
    for i in range(2, height * width + 2):
        invs[i] = ((MODULO - (MODULO // i) * invs[MODULO % i]) % MODULO)

    facts = [1, 1] + [0] * (height * width)
    invfacts = [1, 1] + [0] * (height * width)
    for i in range(2, height * width + 2):
        facts[i] = (facts[i - 1] * i % MODULO)
        invfacts[i] = (invfacts[i - 1] * invs[i] % MODULO)

    ph = [1] * (width + 1)
    for i in range(1, width + 1):
        ph[i] = (ph[i - 1] * (height + 1) % MODULO)

    pw = [1] * (height + 1)
    for i in range(1, height + 1):
        pw[i] = (pw[i - 1] * (width + 1) % MODULO)

    res = 0
    for common in range(min(height, width) + 1):
        ways = (facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
                * facts[width] % MODULO * invfacts[width - common] % MODULO
                * ph[width - common] % MODULO * pw[height - common] % MODULO)
        if common % 2 == 0:
            res = (res + ways) % MODULO
        else:
            res = (res - ways + MODULO) % MODULO

    print(res)

height, width = map(int, sys.stdin.readline().split())
solve(height, width)