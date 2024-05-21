import sys

MOD = 1000000007

def eleva(a, e):
    if e == 0:
        return 1
    ret = eleva(a, e // 2)
    ret = (ret * ret) % MOD
    if e % 2 == 1:
        ret = (ret * a) % MOD
    return ret

def inv(a):
    return eleva(a, MOD - 2)

def calc(rem, bits):
    if bits == 1:
        return pot2[rem]
    return (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD

def calc2(rem, bits):
    if rem == 0:
        return 0
    ret = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * invPot2[rem + 1]) % MOD
    ret = (ret + tmp) % MOD
    return ret

N, M = map(int, input().split())

pot2 = [1] * (M + 1)
invPot2 = [0] * (M + 1)

for i in range(1, M + 1):
    pot2[i] = (pot2[i - 1] * 2) % MOD

invPot2[M] = inv(pot2[M])

for i in range(M - 1, -1, -1):
    invPot2[i] = (invPot2[i + 1] * 2) % MOD

table = [[-1] * (N + 1) for _ in range(M + 1)]
table2 = [[-1] * (N + 1) for _ in range(M + 1)]

for i in range(M + 1):
    table[i][0] = 0
    table2[i][0] = 0

for i in range(1, M + 1):
    for j in range(1, N + 1):
        table[i][j] = (calc2(i - 1, j - 1) * pot2[i]) % MOD
        table[i][j] = (table[i][j] + (i + 1) * table[i][j - 1]) % MOD
        table2[i][j] = table2[i][j - 1]
        tmp = (i * table[i][j]) % MOD
        tmp = (tmp * invPot2[i + 1]) % MOD
        table2[i][j] = (table2[i][j] + tmp) % MOD

print(table[M][N])