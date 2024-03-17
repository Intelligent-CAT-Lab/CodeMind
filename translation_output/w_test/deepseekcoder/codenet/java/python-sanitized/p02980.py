import sys

MODULO = 998244353

def solve(height, width):
    ph = [1]*(width + 1)
    for i in range(1, len(ph)):
        ph[i] = ph[i - 1]*(height + 1)%MODULO

    pw = [1]*(height + 1)
    for i in range(1, len(pw)):
        pw[i] = pw[i - 1]*(width + 1)%MODULO

    res = 0
    for common in range(min(height, width) + 1):
        ways = facts[height]*pow(facts[common], MODULO - 2, MODULO)*pow(facts[height - common], MODULO - 2, MODULO)%MODULO*facts[width]*pow(facts[width - common], MODULO - 2, MODULO)*ph[width - common]*pw[height - common]%MODULO
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
        res %= MODULO
    if res < 0:
        res += MODULO
    return res

def main():
    height, width = map(int, sys.stdin.readline().split())
    print(solve(height, width))

if __name__ == "__main__":
    k = int(5e5)
    facts = [1]*(k + 2)
    for i in range(1, len(facts)):
        facts[i] = facts[i - 1]*i%MODULO
    main()