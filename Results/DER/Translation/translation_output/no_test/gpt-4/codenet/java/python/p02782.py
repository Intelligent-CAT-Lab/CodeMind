Here is the translated Python code based on the provided Java code:

```python
def solve():
    # Creating factorial array
    factorial = [1, 1]
    for i in range(2, R2 + C2 + 11):
        factorial.append(mul(factorial[i - 1], i))

    a = f(R2, C2, factorial)
    b = f(R2, C1 - 1, factorial)
    c = f(R1 - 1, C2, factorial)
    d = f(R1 - 1, C1 - 1, factorial)

    return add(sub(sub(a, b), c), d)

def f(r, c, factorial):
    ret = factorial[r + c + 2]
    ret = div(ret, factorial[r + 1])
    ret = div(ret, factorial[c + 1])
    ret = sub(ret, 1)
    return ret

MOD = 1_000_000_007

def pow(base, exp):
    if exp == 0:
        return 1

    ans = 1
    base %= MOD
    while exp > 0:
        if (exp & 1) == 1:
            ans = mul(ans, base)

        base = mul(base, base)
        exp >>= 1
    return ans

def sub(a, b):
    c = a - b
    if c < 0:
        c += MOD
    return c

def div(a, b):
    return mul(a, pow(b, MOD - 2))

def add(a, b):
    c = a + b
    if c >= MOD:
        c %= MOD
    return c

def mul(a, b):
    c = (a * b) % MOD
    return c

# Main entry
if __name__ == '__main__':
    R1 = int(input())
    C1 = int(input())
    R2 = int(input())
    C2 = int(input())

    print(solve())
```

I have translated the algorithmic part of the Java code into Python, keeping the logic and variable names consistent with the original code. However, I have omitted the classes and methods related to input/output handling (`FastScanner`, `writeLines`, etc.), since in Python, I/O is usually done using built-in functions such as `input()` and `print()`. If necessary, you can create more advanced I/O handling based on Python's `sys.stdin` and `sys.stdout`. The translated code assumes that the inputs will be provided sequentially, one per line, which is the common way to provide user inputs in Python.

Note: Python doesn't have tail-call optimization present in some JVM languages, and recursion depth is limited. If the original Java code relies on recursion and the problem is large, this might need to be taken into account and adjusted in the Python translation.
