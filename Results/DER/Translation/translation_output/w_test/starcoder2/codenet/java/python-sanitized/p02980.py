import sys

MODULO = 998244353

def main():
    height, width = map(int, sys.stdin.readline().split())
    ph = [1]
    for i in range(1, width + 1):
        ph.append(ph[i - 1] * (height + 1) % MODULO)
    pw = [1]
    for i in range(1, height + 1):
        pw.append(pw[i - 1] * (width + 1) % MODULO)
    res = 0
    for common in range(min(height, width) + 1):
        ways = 1
        ways *= facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
        ways *= facts[width] * invfacts[width - common] % MODULO * invfacts[common] % MODULO
        ways *= ph[width - common] % MODULO * pw[height - common] % MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0:
        res += MODULO
    print(res)

k = 500000
invs = [1]
for i in range(2, k + 2):
    invs.append((MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO)
facts = [1]
invfacts = [1]
for i in range(1, k + 2):
    facts.append(facts[i - 1] * i % MODULO)
    invfacts.append(invfacts[i - 1] * invs[i] % MODULO)

if __name__ == '__main__':
    main()