import math
MODULO = 998244353

def nCr(n, r):
    return math.factorial(n) // (math.factorial(r) * math.factorial(n - r))

def nPr(n, r):
    return math.factorial(n) // math.factorial(n - r)

def nHr(n, r):
    return nCr(n + r - 1, r)

def nCrMod(n, r):
    return nPrMod(n, r) // math.factorial(r)

def nPrMod(n, r):
    return math.factorial(n) % MODULO // math.factorial(n - r) % MODULO

def nHrMod(n, r):
    return nCrMod(n + r - 1, r)

def inv(n):
    return pow(n, MODULO - 2, MODULO)

def invs():
    invs = [1] * (500002)
    for i in range(2, 500002):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
    return invs

def facts():
    facts = [1] * (500002)
    for i in range(1, 500002):
        facts[i] = (facts[i - 1] * i) % MODULO
    return facts

def invfacts():
    invfacts = [1] * (500002)
    for i in range(1, 500002):
        invfacts[i] = (invfacts[i - 1] * invs[i]) % MODULO
    return invfacts

def nCrMod(n, r):
    return facts[n] * invfacts[r] * invfacts[n - r] % MODULO

def nPrMod(n, r):
    return facts[n] * invfacts[n - r] % MODULO

def nHrMod(n, r):
    return nCrMod(n + r - 1, r)

invs = invs()
facts = facts()
invfacts = invfacts()

height, width = map(int, input().split())
ph = [1] * (width + 1)
for i in range(1, width + 1):
    ph[i] = ph[i - 1] * (height + 1) % MODULO
pw = [1] * (height + 1)
for i in range(1, height + 1):
    pw[i] = pw[i - 1] * (width + 1) % MODULO
res = 0
for common in range(min(height, width) + 1):
    ways = nCrMod(height, common) * nCrMod(width, width - common) * ph[width - common] * pw[height - common]
    if common % 2 == 0:
        res += ways
    else:
        res -= ways
res %= MODULO
if res < 0:
    res += MODULO
print(res)