Here is the Python version of the provided Java code:

```python
MOD = 1000000007

def calc(rem, bits):
    global table
    if table[rem][bits] != -1:
        return table[rem][bits]
    if bits == 1:
        return table[rem][bits] = pow(2, rem, MOD)
    table[rem][bits] = (calc2(rem - 1, bits - 1) * pow(2, rem, MOD)) % MOD
    table[rem][bits] += (rem + 1) * calc(rem, bits - 1)
    table[rem][bits] %= MOD
    return table[rem][bits]

def calc2(rem, bits):
    global table2
    if table2[rem][bits] != -1:
        return table2[rem][bits]
    if rem == 0:
        return table2[rem][bits] = 0
    table2[rem][bits] = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * pow(2, MOD - 2, MOD)) % MOD
    table2[rem][bits] = (table2[rem][bits] + tmp) % MOD
    return table2[rem][bits]

def pow(a, e):
    if e == 0:
        return 1
    ret = pow(a, e // 2)
    ret = (ret * ret) % MOD
    if e % 2 == 1:
        ret = (ret * a) % MOD
    return ret

def inv(a):
    return pow(a, MOD - 2)

N, M = map(int, input().split())
pot2 = [1] * (M + 1)
invPot2 = [1] * (M + 1)
for i in range(1, M + 1):
    pot2[i] = (pot2[i-1] * 2) % MOD
invPot2[M] = inv(pot2[M])
for i in range(M - 1, -1, -1):
    inv
