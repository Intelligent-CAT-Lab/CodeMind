import math
import sys

def primes(N):
    ret = []
    bs = [True] * (N + 1)
    for i in range(2, N + 1):
        if bs[i]:
            ret.append(i)
            for j in range(i * 2, N + 1, i):
                bs[j] = False
    return ret

def main():
    A, B = map(int, input().split())
    L = max(A - B, 2)
    H = A + B
    primes_list = primes(int(math.sqrt(H)) + 1)
    count = [0] * (H - L + 1)
    ok = [True] * (H - L + 1)
    for p in reversed(primes_list):
        div = (L + (p - 1)) // p
        for pos in range(div * p - L, H - L + 1, p):
            cc = 1
            v = pos + L
            while v % p == 0:
                v //= p
                cc += 1
            if count[pos] > cc:
                ok[pos] = False
            count[pos] = cc
    print(sum(ok))

if __name__ == '__main__':
    main()