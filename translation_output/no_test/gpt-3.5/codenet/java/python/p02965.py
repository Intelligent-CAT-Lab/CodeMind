```python
MOD = 998244353

def add(a, b):
    res = a + b
    return res - MOD if res >= MOD else res

def sub(a, b):
    res = a - b
    return res + MOD if res < 0 else res

def mul(a, b):
    res = (a * b) % MOD
    return res + MOD if res < 0 else res

def pow(a, e):
    if e == 0:
        return 1
    r = a
    for i in range(30 - e.bit_length(), -1, -1):
        r = mul(r, r)
        if e & (1 << i):
            r = mul(r, a)
    return r

def inv(a):
    return pow(a, MOD - 2)

def c(x, y):
    return mul(mul(facts[x + y], factsInv[x]), factsInv[y])

def solve():
    n, m = map(int, input().split())
    facts = [1] * (n + 3 * m//2 + 1)
    for i in range(1, len(facts)):
        facts[i] = mul(facts[i - 1], i)
    factsInv = [0] * len(facts)
    factsInv[-1] = inv(facts[-1])
    for i in range(len(facts) - 1, 0, -1):
        factsInv[i - 1] = mul(factsInv[i], i)
    
    ans = 0
    for nOdd in range(m % 2, m+1, 2):
        cans = c(nOdd, n - nOdd)
        cans1 = c(((3 * m - nOdd) // 2), n - 1)
        cans2 = mul(nOdd, c((m - nOdd) // 2, n - 1))
        if nOdd < m:
            cans2 = add(cans2, mul(n - nOdd, c((m - nOdd) // 2 - 1, n - 1)))
        ans = add(ans, mul(cans, sub(cans1, cans2)))
    
    print(ans)

if __name__ == "__main__":
    solve()
```

