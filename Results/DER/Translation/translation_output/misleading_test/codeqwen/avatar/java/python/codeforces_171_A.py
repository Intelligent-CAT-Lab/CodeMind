Here is the Python equivalent of the Java code:

```python
def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

a, b = map(int, input().split())
ans = get_num(a, b)
print(ans)
```

This Python code does the same thing as the Java code. It defines a function `get_num` that takes two integers `a` and `b` as input, reverses `b`, and returns the sum of `a` and `b`. The main part of the code reads two integers from the user, calls the `get_num` function with these integers, and prints the result.
