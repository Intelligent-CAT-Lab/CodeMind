Here is the Python equivalent of the Java code:

```python
def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

a, b = map(int, input().split())
print(GCD(a, b))
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates their GCD using the recursive function `GCD()`, and prints the result.
