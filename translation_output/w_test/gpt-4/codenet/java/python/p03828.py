Here is the translated Python code:

```python
def prime_factorize(n):
    res = []
    for a in range(2, int(n**0.5) + 1):
        if n % a != 0:
            continue
        ex = 0
        while n % a == 0:
            ex += 1
            n //= a
        res.append({a: ex})
    if n != 1:
        res.append({n: 1})
    return res

def main():
    MOD = 1000000007

    n = int(input())

    ex = [0] * 1001
    for i in range(2, n + 1):
        pfs = prime_factorize(i)
        for pf in pfs:
            for k, v in pf.items():
                ex[k] += v

    ans = 1
    for i in range(2, n + 1):
        ans *= ex[i] + 1
        ans %= MOD

    print(ans)

if __name__ == "__main__":
    main()
```

For the test input `3`, running this Python script will give you the expected output `4`.
