Here is the Python equivalent of the Java code:

```python
def solve():
    a, b = map(int, input().split())
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

print(solve())
```

This Python code does the same thing as the Java code. It reads two integers from the user, then uses a series of if-elif-else statements to determine which of the three possible outcomes to return. The `map` function is used to convert the input string into a list of integers, and the `input` function is used to read the input from the user. The `print` function is used to output the result of the `solve` function to the console.
