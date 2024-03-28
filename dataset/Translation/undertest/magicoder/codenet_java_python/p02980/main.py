import sys

MODULO = 998244353

def solve(height, width):
    invs = [0] * (width + 2)
    invs[1] = 1
    for i in range(2, width + 2):
        invs[i] = ((MODULO - (MODULO // i) * invs[MODULO % i]) % MODULO)

    facts = [0] * (width + 2)
    invfacts = [0] * (width + 2)
    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, width + 2):
        facts[i] = (facts[i - 1] * i % MODULO)
        invfacts[i] = (invfacts[i - 1] * invs[i] % MODULO)

    ph = [0] * (width + 1)
    ph[0] = 1
    for i in range(1, width + 1):
        ph[i] = ph[i - 1] * (height + 1) % MODULO

    pw = [0] * (height + 1)
    pw[0] = 1
    for i in range(1, height + 1):
        pw[i] = pw[i - 1] * (width + 1) % MODULO

    res = 0
    for common in range(min(height, width) + 1):
        ways = facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO \
               * facts[width] % MODULO * invfacts[width - common] % MODULO \
               * ph[width - common] % MODULO * pw[height - common] % MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways

    res %= MODULO
    if res < 0:
        res += MODULO

    return res


if __name__ == "__main__":
    height, width = map(int, sys.stdin.readline().split())
    print(solve(height, width))