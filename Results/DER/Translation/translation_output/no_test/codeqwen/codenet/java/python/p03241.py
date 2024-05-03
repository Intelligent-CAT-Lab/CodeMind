Here is the Python equivalent of the Java code:

```python
n = int(input())
m = int(input())

for i in range(m // n, 0, -1):
    if m % i == 0:
        print(i)
        break
```

This Python code does the same thing as the Java code: it reads two integers from the user, then it iterates from `m // n` down to 1, checking if `m` is divisible by `i`. If it is, it prints `i` and breaks out of the loop.
