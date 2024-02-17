import sys
readline = sys.stdin.readline

#エラトステネスの篩と素因数分解

from collections import Counter
M = 10**6 + 4
prime = [0]*M
for i in range(2, M):
    if prime[i]:
        continue
    for j in range(i, M, i):
        if not prime[j]:
            prime[j] = i

def pd(x):
    C = Counter()
    while x > 1:
        C[prime[x]] += 1
        x //= prime[x]
    return C

N = int(readline())

ans = 0
for i in range(1, N):
    c = pd(i)
    res = 1
    for vi in list(c.values()):
        res *= (1+vi)
    ans += res
print(ans)