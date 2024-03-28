Here is the equivalent code in Python:

```python
# Read input from user
a, b, n = map(int, input().split())

# Calculate and print the result based on given conditions
if n >= b:
    print(a * (b-1) // b)
else:
    print(a * n // b)
```

This Python code reads three integers from the input, just like the Java code, and then performs the same calculations based on the conditions provided. Note that in Python, the `//` operator is used for integer division, which behaves like Java's `/` operator when used with `long` integers.
