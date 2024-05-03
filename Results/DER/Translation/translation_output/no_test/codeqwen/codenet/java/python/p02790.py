Here is the Python equivalent of the Java code:

```python
a = int(input())
b = int(input())

if a >= b:
    for i in range(a):
        print(b, end='')
else:
    for i in range(b):
        print(a, end='')
```

In Python, we use the `input()` function to get user input, and `int()` to convert the input to an integer. The `range()` function is used to generate a sequence of numbers from 0 up to (but not including) the specified number. The `end=''` argument in the `print()` function is used to prevent a newline character from being added after each print statement.
