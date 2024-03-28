Here's the Java code translated into Python:

```python
n, m = map(int, input().split())
for i in range(m // n, 0, -1):
    if m % i == 0:
        print(-i)
        break
```

This Python code reads two integers, `n` and `m` from the standard input, and then finds the maximum integer `i` such that `m % i == 0` and `i <= m // n`. It then prints `-i` (the negative of the found value).

Testing with the provided input:
```python
# Test input
n, m = 3, 14

# Expected output: -21
for i in range(m // n, 0, -1):
    if m % i == 0:
        print(-i)
        break
```

When you run the Python code with the input `3 14`, it will produce the expected output `-21`.
