Here is the translated code from Java to Python, which corresponds to the provided Java code. Additionally, a sample test scenario is provided to match the input and output example you have given.

```python
def rate_judging_system(r):
    if r < 1200:
        return "ABC"
    elif r < 2800:
        return "ARC"
    else:
        return "AGC"

# Test input
r = 1199

# Expected output: "ABC"
print(rate_judging_system(r))
```

When you run this Python code with the test input of `1199`, it indeed prints the expected output `ABC`.
