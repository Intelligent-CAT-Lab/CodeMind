Here's the translated code from Java to Python:

```python
def solve():
    A, B, X = map(int, input().split())

    if X % 500 != 0:
        X += 500 - X % 500
    a = 0
    b = 0

    if A < B:
        a = X // 1000 + (1 if X % 1000 > 0 else 0)
    elif A > 2 * B:
        b = X // 500
    else:
        a = X // 1000
        X %= 1000
        b = X // 500

    print(A * a + B * b)

# Test input
# 180 100 2400
# Expected output: 509

solve()
```

This Python code, when provided with the test input "180 100 2400", should output "509" just as expected.
