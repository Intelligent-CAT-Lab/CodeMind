```python
import sys

def solve(R1, C1, R2, C2):
    MOD = 10**9 + 7

    def mul(a, b):
        c = (a * b) % MOD
        return c

    def sub(a, b):
        c = a - b
        if c < 0:
            c += MOD
        return c

    def div(a, b):
        return mul(a, pow(b, MOD-2, MOD))

    def add(a, b):
        c = a + b
        if c >= MOD:
            c %= MOD
        return c

    def pow(base, exp, mod):
        ans = 1
        base %= mod
        while exp > 0:
            if exp & 1 == 1:
                ans = mul(ans, base)
            base = mul(base, base)
            exp >>= 1
        return ans

    def f(r, c, factorial):
        ret = factorial[r+c+2]
        ret = div(ret, factorial[r+1])
        ret = div(ret, factorial[c+1])
        ret = sub(ret, 1)
        return ret

    factorial = [0] * (R2+C2+11)
    factorial[0] = 1
    factorial[1] = 1
    for i in range(2, R2+C2+11):
        factorial[i] = mul(factorial[i-1], i)

    a = f(R2, C2, factorial)
    b = f(R2, C1-1, factorial)
    c = f(R1-1, C2, factorial)
    d = f(R1-1, C1-1, factorial)

    return add(sub(sub(a, b), c), d)

if __name__ == "__main__":
    input_vals = input().split()
    R1, C1, R2, C2 = map(int, input_vals)
    result = solve(R1, C1, R2, C2)
    print(result)
```
```python
# Test Input
1 1 2 2

# Expected Output
98
```
