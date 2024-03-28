Here's the Java code translated into Python:

```python
def solve():
    n, a, b, c = map(int, input().split())
    M = 1000000007
    inv100 = pow(100, M - 2, M)
    a = a * inv100 % M
    b = b * inv100 % M
    c = c * inv100 % M
    na = (100 - a) * inv100 % M
    nb = (100 - b) * inv100 % M
    
    fa = [1] * (2 * n)
    fai = [1] * (2 * n)
    for i in range(1, 2 * n):
        fa[i] = fa[i - 1] * i % M
        fai[i] = pow(fa[i], M - 2, M)
    
    ans = 0
    scale = pow((a + b) % M, M - 2, M)
    a2 = a * scale % M
    b2 = b * scale % M
    
    for k in range(n, 2 * n):
        ak = pow(a2, n, M) * pow(b2, k - n, M) % M * fa[k - 1] * fai[n - 1] * fai[k - n] % M
        bk = pow(b2, n, M) * pow(a2, k - n, M) % M * fa[k - 1] * fai[n - 1] * fai[k - n] % M
        ans = (ans + ak * k % M) % M
        ans = (ans + bk * k % M) % M
    
    ans = ans * pow((a + b) % M, M - 2, M) % M
    print(ans)

if __name__ == "__main__":
    solve()
```

The `solve()` function expects an input from `stdin` formatted as four space-separated integers (which is provided by the user), and it outputs a single integer result.

The core logic remains the same - using modular exponentiation (`pow(base, exp, mod)`) and pre-computing factorials and their modular inverses for the calculation. The `modpow()` and `modinv()` functions in Java are replaced with the native `pow()` function in Python, which handles modular exponentiation and inversion.

The Java code utilizes an `IO` class for input and output, but in Python, we use the built-in `input()` and `print()` functions for simplicity. The structures and classes for graph theory present in the Java code are omitted in the Python translation, as they are not used in the problem-solving part of the code.

To test the program as per the input specified:

Test input:
```
1 25 25 50
```

You can run the Python code. The expected output, as provided, should be:
```
2
```
