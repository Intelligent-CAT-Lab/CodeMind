import math

def primes(N):
    ret = []
    bs = [False] * (N + 1)
    for i in range(2, N + 1):
        if not bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = True
    return ret

def ans(A, B):
    L = max(A - B, 2)
    H = A + B
    primes = primes(int(math.sqrt(H) + 1))
    count = [0] * (H - L + 1)
    ok = [True] * (H - L + 1)
    for i in range(len(primes) - 1, -1, -1):
        p = primes[i]
        div = (L + (p - 1)) // p
        for pos in range(div * p, H + 1, p):
            cc = 1
            v = div
            while v % p == 0:
                cc += 1
                v //= p
            if count[pos - L] > cc:
                ok[pos - L] = False
            count[pos - L] = cc
    ret = 0
    for i in range(len(ok)):
        if ok[i]:
            ret += 1
    return ret

A = int(input())
B = int(input())
print(ans(A, B))