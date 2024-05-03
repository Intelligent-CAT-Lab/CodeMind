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

This Python code does the same thing as the Java code. It reads two integers from the user, then checks if they are equal, greater than or less than each other, and returns the appropriate result. The `map` function is used to convert the input string into a list of integers. The `input()` function is used to read a line of input from the user. The `split()` function is used to split the input string into a list of words, and the `int()` function is used to convert each word into an integer. The `print()` function is used to output the result of the `solve()` function.
