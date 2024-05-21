MOD = 1000000007

def pow(a, x):
    res = 1
    while x > 0:
        if x % 2!= 0:
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
    return (((fact[n] * invfact[n - r]) % MOD) * invfact[r]) % MOD

def prec(n):
    global fact, invfact
    fact = [1] * (n + 1)
    invfact = [1] * (n + 1)
    for i in range(1, n + 1):
        fact[i] = fact[i - 1] * i % MOD
    invfact[n] = inv(fact[n])
    for i in range(n - 1, 0, -1):
        invfact[i] = invfact[i + 1] * (i + 1) % MOD

x, y, z = map(int, input().split())
B = min(y, z)
C = max(y, z)
prec(1000000)

pow3 = [1] * (x + y + z + 2)
for i in range(1, x + y + z + 2):
    pow3[i] = pow3[i - 1] * 3 % MOD

ans = [0] * (x + y + z + 2)
last = 0
for l in range(x + 1, x + y + z + 2):
    space = l - 2
    base = comb(space, x - 1)
    row = space - (x - 1)
    if row == 0:
        last = 1
    elif row <= B:
        last = (last * 2) % MOD
    elif row <= C:
        last = (last * 2 - comb(row - 1, B) + MOD) % MOD
    else:
        d = (row - 1) - C
        last = (last * 2 - comb(row - 1, B) - comb(row - 1, d) + MOD + MOD) % MOD
    ans[l] = base * last % MOD * pow3[x + y + z + 1 - l] % MOD

print(sum(ans) % MOD)