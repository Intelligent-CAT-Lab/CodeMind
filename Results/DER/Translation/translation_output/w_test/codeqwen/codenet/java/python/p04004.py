Here is the Python version of the provided Java code:

```python
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

def comb(ln, lr):
    n = int(ln)
    r = int(lr)
    if n < 0 or r < 0 or r > n:
        return 0
    if r > n // 2:
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
    inp = list(map(int, input().split()))
    x, y, z = inp[0], inp[1], inp[2]
    B = min(y, z)
    C = max(y, z)
    prec(1000000)

    pow3 = [1] * (x + y + z + 2)
    for i in range(1, len(pow3)):
        pow3[i] = pow3[i-1] * 3 % MOD

    ans = [0] * (x + y + z + 2)
    last = 0
    for l in range(x + 1, x + y + z + 2):
        space = l - 2
        base = comb(space, x - 1)
        row = space - (x - 1)
        if row == 0:
            last
