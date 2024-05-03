Here is the Python equivalent of the Java code:

```python
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print("ab")
elif n == 3:
    print("abc")
else:
    for i in range(n // 4):
        print("abcd", end="")
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print("ab")
    elif t == 3:
        print("abc")
```

In Python, we use `input()` to get user input, and `int()` to convert the input to an integer. The `print()` function can take an optional `end` parameter, which specifies what to print at the end of the line. By default, `end` is `\n`, which means a newline character is printed at the end of the line. We set `end=""` to print nothing at the end of the line.
