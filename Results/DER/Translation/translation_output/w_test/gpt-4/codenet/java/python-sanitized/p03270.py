MOD = 998244353

def add(a, b):
    return ((a + b) % MOD + MOD) % MOD

def mlt(a, b):
    return (a * b) % MOD

def rev(a):
    x, y, g = extgcd(a, MOD)
    return (x % MOD + MOD) % MOD

def extgcd(a, b):
    if a == 0:
        return 0, 1, b
    else:
        x, y, g = extgcd(b % a, a)
        return y - (b // a) * x, x, g

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
    nors = [0] * (n + 1)
    revs = [0] * (n + 1)

    nors[0] = 1
    for i in range(1, n + 1):
        nors[i] = mlt(nors[i - 1], i)

    revs[n] = rev(nors[n])
    for i in range(n - 1, -1, -1):
        revs[i] = mlt(revs[i + 1], i + 1)

def h(n, k):
    return 1 if k <= 0 else mlt(nors[n + k - 1], mlt(revs[n], revs[k - 1]))

def c(n, k):
    return 0 if n - k < 0 else mlt(nors[n], mlt(revs[k], revs[n - k]))

def solve(k, n):
    build_combination(5000)

    for i in range(2, 2 * k + 1):
        ans = 0
        ans = add(ans, calc(i, n, k))
        if i % 2 == 0:
            ans = add(ans, calc(i, n - 1, k))
        print(ans)

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
        tmp = 1
        tmp = mlt(tmp, c(p, q))
        tmp = mlt(tmp, pow(2, q))
        tmp = mlt(tmp, h(n - q, q + l))
        ret = add(ret, tmp)
    return ret

if __name__ == "__main__":
    k, n = map(int, input().split())
    solve(k, n)