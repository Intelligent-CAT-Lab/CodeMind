import sys
import io
import math

MODULO = 998244353

def solve(height, width):
    ph = [1] * (width + 1)
    for i in range(1, width + 1):
        ph[i] = ph[i - 1] * (height + 1) % MODULO
    pw = [1] * (height + 1)
    for i in range(1, height + 1):
        pw[i] = pw[i - 1] * (width + 1) % MODULO
    res = 0
    for common in range(min(height, width) + 1):
        ways = facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
        ways = ways * facts[width] % MODULO * invfacts[width - common] % MODULO
        ways = ways * ph[width - common] % MODULO * pw[height - common] % MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    return res

def main():
    height = int(input())
    width = int(input())
    print(solve(height, width))

if __name__ == "__main__":
    sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8')
    sys.stdin = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    sys.setrecursionlimit(10**6)
    max_n = 500000
    invs = [0] * (max_n + 2)
    invs[1] = 1
    for i in range(2, max_n + 2):
        invs[i] = ((MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO)
    facts = [0] * (max_n + 2)
    invfacts = [0] * (max_n + 2)
    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, max_n + 2):
        facts[i] = (facts[i - 1] * i % MODULO)
        invfacts[i] = (invfacts[i - 1] * invs[i] % MODULO)
    main()