import sys

MOD = 998244353

def add(a, b):
    res = a + b
    return res % MOD if res >= MOD else res

def sub(a, b):
    res = a - b
    return res % MOD if res < 0 else res + MOD

def mul(a, b):
    res = (a * b) % MOD
    return res % MOD if res < 0 else res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(31 - len(bin(e)) + 1, -1, -1):
        r = mul(r, r)
        if (e & (1 << i)) != 0:
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

facts = [1]
factsInv = [inv(facts[0])]

for i in range(1, len(facts)):
    facts[i] = facts[i - 1] * i
    factsInv[i] = factsInv[i - 1] * i

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n, m = map(int, input().split())
    for i in range(1, len(facts)):
        facts[i] *= i
    for i in range(1, len(facts)):
        factsInv[i] *= i
    ans = 0
    for nOdd in range(min(m, n) // 2 + 1, min(m, n) + 1, 2):
        cans = c(nOdd, n - nOdd)
        cans1 = c((3 * m - nOdd) // 2, n - 1)
        cans2 = mul(nOdd, c((m - nOdd) // 2, n - 1))
        if nOdd < m:
            cans2 += mul(n - nOdd, c((m - nOdd) // 2 - 1, n - 1))
        ans += mul(cans, sub(cans1, cans2))
    print(ans)

if __name__ == "__main__":
    sys.stdin.buffer = sys.stdin
    sys.stdout.buffer = sys.stdout
    solve()