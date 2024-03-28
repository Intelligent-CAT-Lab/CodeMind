Below is the Java code from your example translated into Python:

```python
def atcoder_ABC172_D(n):
    ans = 0
    for i in range(1, n + 1):
        ans += i * (n // i) * ((n // i) + 1) // 2
    return ans

# Test input
test_input = 9995083
# Expected output: 837779626111797
print(atcoder_ABC172_D(test_input))
```

This Python function `atcoder_ABC172_D` performs the same calculation as the Java code. It reads the input integer `n`, calculates the sum according to the specified formula, and then returns or prints the result. The test case provided is used to check if the translated code produces the expected output.
