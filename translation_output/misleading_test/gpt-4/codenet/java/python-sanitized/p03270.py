import sys
import math

MOD = 998244353

def add(a, b):
    return ((a + b) % MOD + MOD) % MOD

def mlt(a, b):
    return (a * b) % MOD

def rev(a):
    return pow(a, MOD - 2)

def pow(a, x):
    ans = 1 % MOD
    while x > 0:
        if (x & 1) != 0:
            ans = (ans * a) % MOD
        x >>= 1
        a = (a * a) % MOD
    return ans

def build_combination(n):
    global nors, revs
    nors = [1] * (n + 1)
    revs = [1] * (n + 1)

    for i in range(1, n + 1):
        nors[i] = mlt(nors[i - 1], i)

    revs[n] = rev(nors[n])
    for i in range(n - 1, -1, -1):
        revs[i] = mlt(revs[i + 1], i + 1)

def h(n, k):
    return 1 if k <= 0 else mlt(mlt(nors[n + k - 1], revs[n]), revs[k - 1])

def c(n, k):
    return 0 if n - k < 0 else mlt(mlt(nors[n], revs[k]), revs[n - k])

def calc(i, n, k):
    ret = 0
    p = 0
    for j in range(1, i - j):
        if i - j <= k:
            p += 1
    l = k - 2 * p - (1 if i % 2 == 0 else 0)
    for q in range(min(n, p) + 1):
        if l == 0 and q == 0:
            continue
        temp = 1
        temp = mlt(temp, c(p, q))
        temp = mlt(temp, pow(2, q))
        temp = mlt(temp, h(n - q, q + l))
        ret = add(ret, temp)
    return ret

def main():
    k, n = map(int, sys.stdin.readline().strip().split())

    build_combination(5000)

    for i in range(2, 2 * k + 1):
        ans = 0
        ans = add(ans, calc(i, n, k))
        if i % 2 == 0:
            ans = add(ans, calc(i, n - 1, k))
        print(ans)

if __name__ == "__main__":
    main()