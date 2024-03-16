Here is the Java code translated into Python:

```python
def modpow(m, c, M):
    if c == 0:
        return [[1, 0, 0], [0, 1, 0], [0, 0, 1]]
    if c == 1:
        return m
    if c % 2 == 0:
        m1 = modpow(m, c // 2, M)
        return mult(m1, m1, M)
    else:
        m1 = modpow(m, c - 1, M)
        return mult(m1, m, M)

def mult(a, b, M):
    if isinstance(a[0], list):
        r = [[0] * 3 for _ in range(3)]
        for i in range(3):
            for j in range(3):
                for k in range(3):
                    r[i][j] += a[i][k] * b[k][j] % M
                    if r[i][j] >= M:
                        r[i][j] -= M
        return r
    else:
        r = [0] * 3
        for i in range(3):
            for j in range(3):
                r[i] += a[j] * b[j][i] % M
                if r[i] >= M:
                    r[i] -= M
        return r

if __name__ == '__main__':
    L = int(input())
    A = int(input())
    B = int(input())
    M = int(input())

    m = [[0]*3 for _ in range(3)]
    for i in range(2):
        m[1][i] = 1
    for i in range(1, 3):
        m[2][i] = 1

    res = [0, A % M, B % M]
    k = 10
    l = 0
    while A >= k:
        k *= 10
    while l < L:
        m[0][0] = k % M
        r = min((k - A - 1) // B, L - 1)
        res = mult(res, modpow(m, r - l + 1, M), M)
        l = r + 1
        k *= 10

    print(res[0])
```

Please note that reading input with `input()` in Python already provides a string, so we need to cast it to `int` to get the numeric values. Additionally, I switched the `long` type from Java to `int` in Python because Python's `int` type can handle arbitrary precision.

Also, the `mult` function in Python uses an isinstance check to differentiate between multiplication involving a matrix and a vector, since Python doesn't have function overloading based on the argument type. The `mult` function now works for both cases with a single definition.
