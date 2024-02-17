def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a

from collections import Counter
def m():
    N, P = map(int, input().split())
    if N == 1:
        return P
    x = prime_factorize(P)
    a = 1
    c = Counter(x)
    ans = [1]
    for k, v in c.items():
        tmp = v // N
        if tmp != 0:
            ans.append(k**tmp)


    for i in ans: a*=i
    return a


print(m())
