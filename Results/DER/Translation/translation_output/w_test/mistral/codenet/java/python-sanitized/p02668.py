import sys

def calc(rem, bits):
    if rem == 0:
        return 0
    elif bits == 1:
        return pot2[rem]
    else:
        return ((calc(rem - 1, bits - 1) * pot2[rem]) % MOD + (rem + 1) * calc(rem, bits - 1)) % MOD

def calc2(rem, bits):
    if rem == 0:
        return 0
    else:
        return ((calc2(rem - 1, bits) * pot2[rem]) % MOD + (rem * calc(rem, bits)) % MOD) % MOD

def eleva(a, e):
    if e == 0:
        return 1
    else:
        return ((eleva(a, e // 2) * eleva(a, e % 2)) % MOD)

def inv(a):
    return eleva(a, (MOD - 2))

N, M = map(int, sys.stdin.readline().split())
pot2 = [1] * (M + 1)
invPot2 = [1] * (M + 1)
for i in range(1, len(pot2)):
    pot2[i] = (pot2[i - 1] * 2) % MOD
    invPot2[pot2[i]] = inv(pot2[i])
table = [[-1 for _ in range(N + 1)] for _ in range(M + 1)]
table2 = [[-1 for _ in range(N + 1)] for _ in range(M + 1)]
for i in range(len(table)):
    for j in range(len(table[i])):
        table[i][j] = -1
        table2[i][j] = -1
print(calc(M, N))