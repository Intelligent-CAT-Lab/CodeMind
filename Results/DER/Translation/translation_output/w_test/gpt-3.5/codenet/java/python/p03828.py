```python
MOD = 1000000007

def primeFactorize(n):
    res = []
    a = 2
    while a * a <= n:
        if n % a != 0:
            a += 1
            continue
        ex = 0
        while n % a == 0:
            ex += 1
            n //= a
        res.append({a: ex})
    if n != 1:
        res.append({n: 1})
    return res

n = int(input())

ex = [0] * 1001
for i in range(2, n+1):
    pfs = primeFactorize(i)
    for pf in pfs:
        for key, value in pf.items():
            ex[key] += value

ans = 1
for i in range(2, n+1):
    ans *= ex[i] + 1
    ans %= MOD

print(ans)
```
```
