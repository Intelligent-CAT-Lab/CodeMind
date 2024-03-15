Here's the translation of the Java code into Python:

```python
# Read input from the user
a, b = map(int, input().split())
res = a

# Algorithm to calculate the result
while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

# Print the result
print(res)
```

This Python code does the same thing as the Java code: it reads two integers as input, then follows an algorithm that keeps track of a result count (`res`) while adding the integer division of `a` by `b` to `res` and updating `a` to be the quotient plus the remainder. It prints the result once `a` is less than `b`.
