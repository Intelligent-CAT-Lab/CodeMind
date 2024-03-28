Here's the provided Java code translated to Python:

```python
MOD = 1_000_000_007

def add(a, b):
    c = a + b
    if c >= MOD:
        c %= MOD
    return c
    
def sub(a, b):
    c = a - b
    if c < 0:
        c += MOD
    return c
    
def mul(a, b):
    c = (a * b) % MOD
    return c
    
def pow(base, exp):
    base %= MOD
    result = 1
    while exp > 0:
        if (exp & 1):
            result = mul(result, base)
        base = mul(base, base)
        exp >>= 1
    return result
    
def div(a, b):
    return mul(a, pow(b, MOD-2))

def f(r, c, factorial):
    ret = factorial[r + c + 2]
    ret = div(ret, factorial[r + 1])
    ret = div(ret, factorial[c + 1])
    ret = sub(ret, 1)
    return ret
    
def solve(R1, C1, R2, C2):
    factorial = [1] * (R2 + C2 + 11)
    for i in range(2, R2 + C2 + 11):
        factorial[i] = mul(factorial[i-1], i)
        
    a = f(R2, C2, factorial)
    b = f(R2, C1-1, factorial)
    c = f(R1-1, C2, factorial)
    d = f(R1-1, C1-1, factorial)
    
    return add(sub(sub(a, b), c), d)

# Sample test case
test_input = "1 1 2 2"
R1, C1, R2, C2 = map(int, test_input.split())
print(solve(R1, C1, R2, C2))
```

This Python code should produce the output `14` when using the provided test input `1 1 2 2`. To input different test cases, you can modify the `test_input` variable or take input from the user using `input()`.
