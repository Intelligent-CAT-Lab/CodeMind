Below is the equivalent Python code for the given Java code:

```python
MOD = 1000000007

def calc(rem, bits):
    ret = table[rem][bits]
    if ret != -1:
        return ret
    if bits == 1:
        table[rem][bits] = pow(2, rem, MOD)
        return table[rem][bits]
    ret = calc2(rem - 1, bits - 1) * pow(2, rem, MOD) % MOD
    ret += (rem + 1) * calc(rem, bits - 1) % MOD
    ret %= MOD
    table[rem][bits] = ret
    return ret

def calc2(rem, bits):
    ret = table2[rem][bits]
    if ret != -1:
        return ret
    if rem == 0:
        table2[rem][bits] = 0
        return 0
    ret = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * pow(2, MOD - (rem+1), MOD)) % MOD
    ret = (ret + tmp) % MOD
    table2[rem][bits] = ret
    return ret

def main():
    N, M = map(int, input().split())
    global table, table2
    table = [[-1 for _ in range(N+1)] for _ in range(M+1)]
    table2 = [[-1 for _ in range(N+1)] for _ in range(M+1)]
    print(calc(M, N))

if __name__ == "__main__":
    main()
```

This code does not include the custom `MyScanner` class from the original Java code. Instead, it uses the built-in `input()` function in Python for reading input. This is more idiomatic in Python for simple input reading. The `calc` and `calc2` functions, as well as the modular exponentiation and inverse functions `eleva` and `inv`, are converted to their Python equivalents. Note that in Python, the `pow` function can be used to perform modular exponentiation with three arguments where the third argument is the modulus.
