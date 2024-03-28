MOD = 1000000007

def pow(a, x):
    res = 1
    while x > 0:
        if x % 2 != 0:
            res = (res * a) % MOD
        a = (a * a) % MOD
        x //= 2
    return res

def inv(a):
    return pow(a, MOD - 2) % MOD

_fact = []
_invfact = []

def comb(n, r):
    n = int(n)
    r = int(r)
    if n < 0 or r < 0 or r > n:
        return 0
    if r > n / 2:
        r = n - r
    return (((_fact[n] * _invfact[n - r]) % MOD) * _invfact[r]) % MOD

def prec(n):
    global _fact, _invfact
    _fact = [1] * (n + 1)
    _invfact = [1] * (n + 1)
    for i in range(1, n + 1):
        _fact[i] = _fact[i - 1] * i % MOD
        _invfact[i] = inv(_fact[i])

def main():
    x, y, z = map(int, input().split())
    B = min(y, z)
    C = max(y, z)
    prec(1000000)

    pow3 = [0] * 1000000
    pow3[0] = 1
    for i in range(1, len(pow3)):
        pow3[i] = pow3[i-1] * 3 % MOD

    ans = [0] * (x+y+z+2)
    last = 0
    for l in range(x+1, x+y+z+2):
        space = l - 2
        base = comb(space, x-1)
        row = space - (x-1)
        if row == 0:
            last = 1
        elif row <= B:
            last = (last * 2) % MOD
        elif row <= C:
            last = (last * 2 - comb(row-1, B) + MOD) % MOD
        else:
            d = (row-1) - C
            last = (last * 2 - comb(row-1, B) - comb(row-1, d) + MOD + MOD) % MOD
        ans[l] = base * last % MOD * pow3[x+y+z+1-l] % MOD

    sum_ans = sum(ans) % MOD
    print(sum_ans)

if __name__ == "__main__":
    main()