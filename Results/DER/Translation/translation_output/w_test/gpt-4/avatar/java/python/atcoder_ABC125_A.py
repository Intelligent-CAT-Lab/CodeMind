Here is the equivalent Python code for the provided Java example:

```python
def atcoder_ABC125_A(a, b, n):
    k = 0
    i = 1
    while i * a <= n:
        k += b
        i += 1
    return k

# Test input
input_str = "20 20 19"
# Extracting a, b, n from the input string
a, b, n = map(int, input_str.split(' '))

# Expected output
print(atcoder_ABC125_A(a, b, n))
```

When you provide the input "20 20 19", the Python function `atcoder_ABC125_A` should print `0`, which is the expected output.
