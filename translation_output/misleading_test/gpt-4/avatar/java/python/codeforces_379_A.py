Below is the translated code in Python that should produce the same output for the given input:

```python
# Read input
a, b = map(int, input().split())

# Calculate result
res = a

while a >= b:
    res += a // b
    a = (a // b) + (a % b)

# Print result
print(res)
```

If you enter the input "80 970", the expected output will be "146".
