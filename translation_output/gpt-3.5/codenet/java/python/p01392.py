```python
from math import sqrt

def primes(N):
    ret = []
    bs = [False] * (N + 1)
    i = 2
    while i <= N:
        ret.append(i)
        for j in range(i * 2, N + 1, i):
            bs[j] = True
        i = bs.index(False, i + 1)
    return ret

if __name__ == "__main__":
    A = int(input())
    B = int(input())
    L = max(A - B, 2)
    H = A + B
    primes_list = primes(int(sqrt(H) + 1))
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
    
    ret = sum(1 for i in ok if i)
    print(ret)
```
