Below is the translated Python code from the provided Java code:

```python
MOD = 1000000007

def calc(rem, bits):
    if table[rem][bits] != -1:
        return table[rem][bits]
    if bits == 1:
        table[rem][bits] = pot2[rem]
        return table[rem][bits]
    
    ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
    ret += (rem + 1) * calc(rem, bits - 1)
    ret %= MOD
    table[rem][bits] = ret
    return ret

def calc2(rem, bits):
    if table2[rem][bits] != -1:
        return table2[rem][bits]
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

def main():
    N, M = map(int, input().split())
    global pot2, invPot2, table, table2
    pot2 = [1] * (M + 1)
    invPot2 = [0] * (M + 1)
    for i in range(1, len(pot2)):
        pot2[i] = (pot2[i-1] * 2) % MOD
    
    invPot2[-1] = inv(pot2[-1])
    for i in range(len(invPot2) - 2, -1, -1):
        invPot2[i] = (invPot2[i+1] * 2) % MOD
    
    table = [[-1] * (N + 1) for _ in range(M + 1)]
    table2 = [[-1] * (N + 1) for _ in range(M + 1)]

    print(calc(M, N))

if __name__ == "__main__":
    main()
```

To run the program, you can use a Python environment and provide the test input (`2 5`) to get the expected output (`270`). Make sure to provide the input in the format expected by the `input().split()` used in the `main()` function, which should be a single line where the two numbers `N` and `M` are separated by a space.
