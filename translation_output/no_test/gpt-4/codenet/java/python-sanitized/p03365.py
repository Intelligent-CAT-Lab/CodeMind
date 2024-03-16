MOD = 10 ** 9 + 7

class Util:
    fact = [1] * 1000001
    inv = [1] * 1000001
    ifact = [1] * 1000001
    inv[0] = 0
    for i in range(2, len(inv)):
        inv[i] = (MOD - (MOD // i) * inv[MOD % i] % MOD) % MOD
    for i in range(2, len(fact)):
        fact[i] = i * fact[i - 1] % MOD
        ifact[i] = inv[i] * ifact[i - 1] % MOD

    @staticmethod
    def c(a, b):
        return Util.ifact[a] * Util.ifact[b - a] % MOD * Util.fact[b] % MOD

    @staticmethod
    def fact(a):
        return Util.fact[a]


def solve(i):
    md = [0] * i
    rm = i - 2
    lx = i - 2
    while rm >= 0:
        md[lx + 1] = Util.c(rm, lx)
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, i):
        cur = Util.fact(m) * Util.fact(i - m - 1) % MOD
        cur = cur * md[m] % MOD

        res += (cur - prev + MOD) * m % MOD
        prev = cur

    return res % MOD

# This would replace the main function, typically you would retrieve 'i' from user input or another source.
# For example, suppose 'i' is given as follows:
i = int(input())
print(solve(i))