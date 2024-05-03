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

In this Python code, we define a function `GCD` that takes two integers as input and returns their greatest common divisor. We then use the `input()` function to read two integers from the user, split them into a list of strings using the `split()` function, and convert them to integers using the `map()` function. Finally, we call the `GCD` function with these two integers and print the result.
