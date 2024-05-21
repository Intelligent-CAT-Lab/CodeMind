import sys

MOD = 1000000007
table = {}
table2 = {}

def calc(rem, bits):
    if (rem, bits) in table:
        return table[(rem, bits)]
    if bits == 1:
        table[(rem, bits)] = pow(2, rem, MOD)
        return table[(rem, bits)]
    ret = (calc2(rem - 1, bits - 1) * pow(2, rem, MOD)) % MOD
    ret += (rem + 1) * calc(rem, bits - 1)
    ret %= MOD
    table[(rem, bits)] = ret
    return ret

def calc2(rem, bits):
    if (rem, bits) in table2:
        return table2[(rem, bits)]
    if rem == 0:
        table2[(rem, bits)] = 0
        return table2[(rem, bits)]
    ret = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * pow(2, MOD - 2 - rem, MOD)) % MOD
    ret = (ret + tmp) % MOD
    table2[(rem, bits)] = ret
    return ret

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

N, M = map(int, input().split())
pot2 = [1] * (M + 1)
invPot2 = [1] * (M + 1)
for i in range(1, pot2.length):
    pot2[i] = (pot2[i-1] * 2) % MOD
invPot2[pot2.length - 1] = inv(pot2[pot2.length - 1])
for i in range(pot2.length - 2, -1, -1):
    invPot2[i] = (invPot2[i+1] * 2) % MOD
table = {}
table2 = {}
print(calc(M, N))