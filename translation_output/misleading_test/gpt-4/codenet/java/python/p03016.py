Here is the translated Python code:

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

def mult_vect_mat(a, b, M):
    r = [0, 0, 0]
    for i in range(3):
        for j in range(3):
            r[i] += a[j] * b[j][i] % M
            if r[i] >= M:
                r[i] -= M
    return r

def mult_mat_mat(a, b, M):
    r = [[0, 0, 0] for _ in range(3)]
    for i in range(3):
        for j in range(3):
            for k in range(3):
                r[i][j] += a[i][k] * b[k][j] % M
                if r[i][j] >= M:
                    r[i][j] -= M
    return r

L, A, B, M = map(int, input().split())

m = [[0] * 3 for _ in range(3)]
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
    r = min((k - 1 - A) // B, L - 1)
    res = mult_vect_mat(res, modpow(m, r - l + 1, M), M)
    l = r + 1
    k *= 10

print(res[0])
```

You can test the translation with the provided test input:

Test input:
```
5 3 4 10007
```

Expected output:
```
5557
```
