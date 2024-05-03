Here is the Python equivalent of the Java code:

```python
def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

x = int(input())

while not prime(x):
    x += 1

print(x)
```

This Python code does the same thing as the Java code: it takes an integer input, checks if it's prime, and if not, increments it until it is. The `prime` function checks if a number is prime by trying to divide it by all numbers less than it. If it finds a divisor, it returns `False`; otherwise, it returns `True`. The `while` loop keeps incrementing `x` until `prime(x)` returns `True`.
