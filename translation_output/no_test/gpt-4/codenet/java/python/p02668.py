Below is the translated Python code based on the provided Java code:

```python
MOD = 1000000007

def calc(rem, bits):
    global table, pot2
    ret = table[rem][bits]
    if ret != -1:
        return ret
    if bits == 1:
        table[rem][bits] = pot2[rem]
        return pot2[rem]
    ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
    ret += ((rem + 1) * calc(rem, bits - 1)) % MOD
    ret %= MOD
    table[rem][bits] = ret
    return ret

def calc2(rem, bits):
    global table2, invPot2
    ret = table2[rem][bits]
    if ret != -1:
        return ret
    if rem == 0:
        table2[rem][bits] = 0
        return 0
    ret = calc2(rem - 1, bits)
    tmp = (rem * calc(rem, bits)) % MOD
    tmp = (tmp * invPot2[rem + 1]) % MOD
    ret = (ret + tmp) % MOD
    table2[rem][bits] = ret
    return ret

def eleva(a, e):
    if e == 0:
        return 1
    ret = eleva(a, e // 2)
    ret = (ret * ret) % MOD
    if e % 2 == 1:
        ret = (ret * a) % MOD
    return ret

def inv(a):
    return eleva(a, MOD - 2)

if __name__ == "__main__":
    N, M = [int(e) for e in input().split()]
    pot2 = [1 for _ in range(M+1)]
    invPot2 = [1 for _ in range(M+1)]
    for i in range(1, len(pot2)):
        pot2[i] = (pot2[i-1] * 2) % MOD
    invPot2[-1] = inv(pot2[-1])
    for i in range(len(pot2) - 2, -1, -1):
        invPot2[i] = (invPot2[i+1] * 2) % MOD
    table = [[-1 for _ in range(N+1)] for _ in range(M+1)]
    table2 = [[-1 for _ in range(N+1)] for _ in range(M+1)]
    
    print(calc(M, N))
```

Note that the `MyScanner` class in the original Java code was replaced with using Python's `input()` function and list comprehensions to read integers from the standard input. The rest of the predefined methods were translated to their equivalent Python features while keeping the same logic and structures. 

Remember that Python uses zero-based indexing, unlike Java's one-based indexing, and inherently supports big integers, so there is no separate type for handling long integers in Python. The print and flush at the end is simplified to a single `print()` call because Python's `print()` will immediately flush by default.
