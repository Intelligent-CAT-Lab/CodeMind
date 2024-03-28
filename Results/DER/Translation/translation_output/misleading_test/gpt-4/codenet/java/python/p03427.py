Here's the translated Python code:

```python
def calculate_max(N):
    N += 1
    s = str(N)
    length = len(s)
    c = int(s[0])
    max_value = (c - 1) + 9 * (length - 1)
    return max_value

# Test input
N = 100
# Expected output: 41
print(calculate_max(N))
```

Remember to run the function with the actual input when using this code in practice. The provided sample test case directly calls the function with `N = 100` and prints the result.
