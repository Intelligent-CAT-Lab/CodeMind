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

ans = 0
primes_list = []
L, H = 0, 0

A, B = map(int, input().split())
L = max(A - B, 2)
H = A + B
primes_list = primes(int(math.sqrt(H) + 1))
count = [0] * (H - L + 1)
ok = [True] * (H - L + 1)

for i in range(len(primes_list) - 1, -1, -1):
    p = primes_list[i]
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
        
print(ret)