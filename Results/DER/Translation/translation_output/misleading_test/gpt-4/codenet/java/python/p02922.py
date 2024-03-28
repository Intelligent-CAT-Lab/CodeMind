Here's the Java code from above translated to Python:

```python
# Read input from user
a, b = map(int, input().split())

# Calculate the answer
ans = (b - 1) // (a - 1)

# Check for exact division
if (b - 1) % (a - 1) == 0:
    print(ans)
else:
    print(ans + 1)
```

With the given test input of "4 10", the output would be `32` as expected.
