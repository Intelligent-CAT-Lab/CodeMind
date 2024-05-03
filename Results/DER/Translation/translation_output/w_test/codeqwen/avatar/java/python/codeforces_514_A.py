Here is the Python equivalent of the Java code:

```python
def reverse_number(n):
    new_number = 0
    power = 0
    while n > 0:
        r = n % 10
        if 9 - r < r:
            if n // 10 == 0 and 9 - r == 0:
                new_number = new_number + r
            else:
                new_number = new_number + 9 - r
        else:
            new_number = new_number + r
        n = n // 10
        power += 1
    return new_number * (10 ** (power - 1))

print(reverse_number(5728))
```

This Python function works similarly to the Java code. It takes an integer as input, reverses it, and returns the reversed integer. The main difference is that Python uses `//` for integer division and `**` for exponentiation, which are used in the Python code.
