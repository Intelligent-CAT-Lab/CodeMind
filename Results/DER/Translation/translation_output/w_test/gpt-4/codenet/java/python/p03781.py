Sure, here's the Java code translated to Python with a sample input/output block:

```python
def p03781(x):
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    return i

# Test case
x = 6
print(p03781(x))
```

When you run this Python function with the test case where `x = 6`, it should output `3`, which is the expected output.
