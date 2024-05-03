Here is the Python equivalent of the Java code:

```python
n, m = map(int, input().split())
for i in range(m // n, 0, -1):
    if m % i == 0:
        print(i)
        break
```

This Python code does the same thing as the Java code. It reads two integers from the user, then it loops from `m // n` down to 1, checking if `m` is divisible by `i`. If it is, it prints `i` and breaks the loop.
