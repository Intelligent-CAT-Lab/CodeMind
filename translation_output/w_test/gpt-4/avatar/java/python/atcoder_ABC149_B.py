Here is the Java code translated to Python, encapsulated within the ```python``` markdown:

```python
def atcoder_ABC149_B(A, B, K):
    n = A - K

    if A + B <= K:
        return 0, 0
    elif n < 0:
        return 0, A + B - K
    else:
        return n, B

# Test input
A, B, K = map(int, input().split())

# Expected output
result = atcoder_ABC149_B(A, B, K)
print(result[0], result[1])
```

When you run the above Python code with the input `1000000000000 1000000000000 1000000000000`, it should output `0 1000000000000`, as expected.
