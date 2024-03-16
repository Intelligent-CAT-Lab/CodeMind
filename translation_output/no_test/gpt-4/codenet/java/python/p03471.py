Here is the Java code translated into Python:

```python
X, Y = map(int, input().split())

sum = 0
judge = False
a = b = c = 0

for i in range(X + 1):
    for k in range(X - i + 1):
        sum = 10000 * i + 5000 * k + 1000 * (X - i - k)
        if sum == Y:
            judge = True
            a, b, c = i, k, X - i - k
            break
    if judge:
        break

if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```

In this Python version, the `Scanner` class is replaced by the built-in `input()` function combined with `map` to read integers from standard input. The loops and logic are directly translated since Python's syntax for loops and conditionals is similar to Java's. Printing is done using the `print` function which can handle multiple arguments separated by spaces.
