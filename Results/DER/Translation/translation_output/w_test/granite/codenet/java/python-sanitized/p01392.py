import math

def primes(N):
    ret = []
    bs = [True] * (N + 1)
    for i in range(2, N + 1):
        if bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = False
    return ret

def ans(A, B):
    L = max(A - B, 2)
    H = A + B
    primes_list = primes(int(math.sqrt(H)) + 1)
    count = [0] * (int(H - L + 1))
    ok = [True] * (int(H - L + 1))
    for p in reversed(primes_list):
        div = (L + (p - 1)) // p
        for pos in range(int(div * p - L), int(H - L + 1), p):
            cc = 1
            v = div
            while v % p == 0:
                cc += 1
                v //= p
            if count[pos] > cc:
                ok[pos] = False
            count[pos] = cc
    return sum(ok)

A, B = map(int, input().split())
print(ans(A, B))