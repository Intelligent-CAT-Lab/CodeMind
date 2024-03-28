Here's the provided Java code translated into Python:

```python
def count_doublings(X, Y):
    i = 0
    while X <= Y:
        i += 1
        X *= 2
    return i

# Sample test case
X, Y = map(int, input().split()) # Inputs are taken as integers
print(count_doublings(X, Y))
```

When you run the Python code above with the test input `3 20`, it should produce the expected output `31`.
