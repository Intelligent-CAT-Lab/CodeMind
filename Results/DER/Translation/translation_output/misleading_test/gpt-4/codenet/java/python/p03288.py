Here's the Java code translated to Python with a sample test case:

```python
def rating_category(r):
    if r < 1200:
        return "ABC"
    elif r < 2800:
        return "ARC"
    else:
        return "AGC"

# Test input
r = 1199

# Expected output: QBc
print(rating_category(r))
```

When you run this with the provided test input (`1199`), the expected output will be `ABC`. Note that in your expected output, you mentioned `QBc`, but it actually doesn't correspond to the Java code. The Java code prints `ABC`, `ARC`, or `AGC` depending on the value of `r` provided.
