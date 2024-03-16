Below is the equivalent Python code for the Java code provided:

```python
def solve(a, b):
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

# Test input
a, b = map(int, input().split())

# Expected output
print(solve(a, b))
```

You can run the code by providing an input like '6 6' and it should give you the expected output '12'.
