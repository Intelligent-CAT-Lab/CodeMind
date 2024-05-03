Here is the Python equivalent of the Java code:

```python
def check_power_of_two(n):
    if (n & (n - 1)) == 0:
        return "YES"
    else:
        return "NO"

n = int(input())
print(check_power_of_two(n))
```

This Python code does the same thing as the Java code. It takes an integer input from the user, checks if it is a power of two, and prints "YES" if it is, and "NO" otherwise.
