import math

def primes(N):
    ret = []
    bs = [False for _ in range(N + 1)]
    for i in range(2, N + 1):
        if not bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = True
    return ret

L, H = map(int, input().split())
primes_list = primes(int(math.sqrt(H) + 1))
count = [0] * (H - L + 1)
ok = [True] * (H - L + 1)

for i in range(len(primes_list) - 1, -1, -1):
    p = primes_list[i]
    div = (L + (p - 1)) // p
    pos = div * p
    while pos <= H:
        cc = 1
        v = div
        while v % p == 0:
            cc += 1
            v //= p
        if count[pos - L] > cc:
            ok[pos - L] = False
        count[pos - L] = cc
        div += 1
        pos = div * p

ret = sum(1 for i in ok if i)
print(ret)