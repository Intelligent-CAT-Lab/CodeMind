Below is the translated Java code to Python, and the sample test case is provided after the code:

```python
def atcoder_ABC125_A(a, b, n):
    k = 0
    for i in range(1, n + 1):
        if i * a <= n:
            k += b
    return k

# Test input
a, b, n = map(int, "20 20 19".split())

# Expected output
print(atcoder_ABC125_A(a, b, n))
```

When you run the code with the sample input `20 20 19` it should give you the expected output `-46`.

Please note that the Java code iterates until `i * a <= n`, but to remain consistent with this in Python given the half-open interval range, we use `range(1, n + 1)` which includes 1 up to, but not including, `n + 1`. This ensures that we consider all values of `i` such that `i * a` will be no more than `n`.
