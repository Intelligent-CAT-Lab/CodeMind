import sys
import math

MOD = 1000000007
N = int(sys.stdin.readline())
M = int(sys.stdin.readline())
pot2 = [1]
inv_pot2 = [0]
for i in range(1, M + 1):
    pot2.append((pot2[i - 1] * 2) % MOD)
    inv_pot2.append((inv_pot2[i - 1] * 2) % MOD)

table = [[-1] * (N + 1) for _ in range(M + 1)]
table2 = [[-1] * (N + 1) for _ in range(M + 1)]

def calc(rem, bits):
    if table[rem][bits] != -1:
        return table[rem][bits]
    if bits == 1:
        return table[rem][bits] = pot2[rem]
    ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
    ret += (rem + 1) * calc(rem, bits - 1)
    ret %= MOD
    return table[rem][bits] = ret

def calc2(rem, bits):
    if table2[rem][bits] != -1:
        return table2[rem][bits]
    if rem == 0:
        return table2[rem][bits] = 0
    ret = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * inv_pot2[rem + 1]) % MOD
    ret = (ret + tmp) % MOD
    return table2[rem][bits] = ret

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

print(calc(M, N))