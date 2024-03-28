Here is the translated Python code that performs the same operation as the given Java code:

```python
# Reading input
a, b = input().split()
a = int(a)  # Convert input string to integer
b = float(b)  # Convert input string to float

# Perform computation
c = round(b * 100)
d = a * c
result = d // 100  # Use integer division for the final result

# Output the result
print(result)
```

Python automatically takes care of type promotion, so we don't need to explicitly cast `b` to a `double` as in Java. Also, when dealing with large integers in Python, there's no need to worry about the integer range as Python integers are unbounded whereas Java has a maximum value for its long type.

Additionally, the `//` operator in Python performs floor division, which automatically discards any fractional part and returns an integer result, similar to dividing two `long` values in Java resulting in a `long` without any fractional part.
