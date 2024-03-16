import math
import numpy as np

MODULO = 998244353

# Pre-computing invs, facts, and invfacts for efficiency
k = 8010
invs = [1] * (k + 2)
for i in range(2, k + 2):
    invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
facts = [1] * (k + 2)
invfacts = [1] * (k + 2)
for i in range(1, k + 2):
    facts[i] = facts[i - 1] * i % MODULO
    invfacts[i] = invfacts[i - 1] * invs[i] % MODULO

def solve(m, n):
    w = [(facts[m] * invfacts[m - i] % MODULO) for i in range(m + 1)]
    nw = [0] * (m + 1)
    tw = [0] * (m + 1)
    other = [invfacts[m + 2 - i] for i in range(3, m + 3)]

    for step in range(n):
        nw = [0] * (m + 1)
        tw = [(w[j] * (j + 1) % MODULO * (j + 2) % MODULO) for j in range(m + 1)]

        prod = np.polymul(tw, other)[:2*m+1].astype(int) % MODULO

        for i in range(m + 1):
            s = prod[m + i]
            s = (s + w[i] * (1 + i * (i + 1) // 2)) % MODULO
            nw[i] = s
        
        w, nw = nw, w

    res = w[0]
    return res

# Test case input
m, n = map(int, input().split())

# Expected output
print(solve(m, n))