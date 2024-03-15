import sys


def solve():
    # 10^6だからだめだけど大丈夫だろう...
    # 使うinverseの数は少ないので全部出す(遅い)
    factorials = [0] * (R2 + C2 + 11)
    factorials[0] = 1
    factorials[1] = 1
    for i in range(2, R2 + C2 + 11):
        factorials[i] = mul(factorials[i - 1], i)

    a = f(R2, C2, factorials)
    b = f(R2, C1 - 1, factorials)
    c = f(R1 - 1, C2, factorials)
    d = f(R1 - 1, C1 - 1, factorials)
    return add(sub(sub(a, b), c), d)


def f(r, c, factorials):
    # k(0, c) + k(1, c) + ...k(r, c) = k(r, c+1) すくない。
    # だから、これを各列に対して行ったものが1行になるよう考えると、すぐにその和になることが分かる(-1すれば)

    ret = factorials[r + c + 2]
    ret = div(ret, factorials[r + 1])
    ret = div(ret, factorials[c + 1])
    ret = sub(ret, 1)
    return ret


MOD = 1_000_000_007


def pow(base, exp):
    if exp == 0:
        return 1

    ans = 1
    base %= MOD
    while exp > 0:
        if exp & 1 == 1:
            ans = mul(ans, base)

        base = mul(base, base)
        exp >>= 1
    return ans


def sub(a, b):
    c = a - b
    if c < 0:
        c += MOD
    return c


def div(a, b):
    return mul(a, pow(b, MOD - 2))


def add(a, b):
    c = a + b
    if c >= MOD:
        c %= MOD
    return c


def mul(a, b):
    c = (a * b) % MOD
    return c


R1, C1, R2, C2 = map(int, input().split())
print(solve())