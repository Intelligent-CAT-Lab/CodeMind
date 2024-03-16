Here's the translated Python code:

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

def mult_vec_mat(a, b, M):
    r = [0, 0, 0]
    for i in range(3):
        for j in range(3):
            r[i] += a[j] * b[j][i] % M
            if r[i] >= M:
                r[i] -= M
    return r

def mult_mat_mat(a, b, M):
    r = [[0 for _ in range(3)] for _ in range(3)]
    for i in range(3):
        for j in range(3):
            for k in range(3):
                r[i][j] += a[i][k] * b[k][j] % M
                r[i][j] = r[i][j] % M
    return r


def main():
    L, A, B, M = map(int, input().split())

    m = [[0 for _ in range(3)] for _ in range(3)]
    m[1][0] = m[1][1] = m[2][1] = m[2][2] = 1

    res = [0, A % M, B % M]
    k = 10
    l = 0
    while A >= k:
        k *= 10
    while l < L:
        m[0][0] = k % M
        r = min((k - A - 1) // B, L - 1)
        res = mult_vec_mat(res, modpow(m, r - l + 1, M), M)
        l = r + 1
        k *= 10

    print(res[0])


if __name__ == "__main__":
    main()
```

Here are some notations that I used to adapt the Java code to Python:

- In the Java code `mult(long[] a, long[][] b, long M)` and `mult(long[][] a, long[][] b, long M)` are overloaded methods. In Python, I explicitly named them `mult_vec_mat` (for multiplying a vector and a matrix) and `mult_mat_mat` (for multiplying two matrices) to differentiate.
- Integer division in Java is done using the `/` operator, but in Python 3, it is done using the `//` operator to achieve the same effect of flooring the result as in Java.
- Since Python lists are 0-indexed, unlike Java arrays (which are 1-indexed), there is a slight difference in loop ranges and list access.
- The `main` function in Python is defined and then called under the `if __name__ == "__main__":` guard to simulate the behavior of a Java `main` method that runs when the file is executed directly.
